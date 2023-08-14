package project;
/*
Online Market
@avtorBTB
@version1.0

 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppUI {
    private ProductService productService;
    private UserService userService;
    private OrderService orderService;
    private Scanner scanner;

    public AppUI ( ProductService productService, UserService userService, OrderService orderService ) {
        this.productService = productService;
        this.userService = userService;
        this.orderService = orderService;
        this.scanner = new Scanner ( System.in );
    }

    public void run () {
        boolean loggedIn = false;
        User currentUser = null;

        while (!loggedIn) {
            System.out.println ( "\t1. Увійти" );
            System.out.println ( "\t2. Зареєструватися" );
            System.out.println ( "\t3. Вийти" );

            int choice = scanner.nextInt ( );
            scanner.nextLine ( ); // Очистити буфер після nextInt()

            switch (choice) {
                case 1:
                    currentUser = login ( );
                    if ( currentUser != null ) {
                        loggedIn = true;
                    }
                    break;
                case 2:
                    register ( );
                    break;
                case 3:
                    System.out.println ( "До побачення!" );
                    System.exit ( 0 );
                    break;
                default:
                    System.out.println ( "Неправильний вибір. Спробуйте ще раз." );
                    break;
            }
        }

        while (loggedIn) {
            System.out.println ( "1. Переглянути список продуктів" );
            System.out.println ( "2. Додати товар в кошик" );
            System.out.println ( "3. Переглянути кошик" );
            System.out.println ( "4. Оформити замовлення" );
            System.out.println ( "5. Переглянути історію замовлень" );
            System.out.println ( "6. Вийти" );

            int choice = scanner.nextInt ( );
            scanner.nextLine ( ); // Очистити буфер після nextInt()

            switch (choice) {
                case 1:
                    List<Product> products = productService.getAllProducts ( );
                    displayProductList ( products );
                    break;
                case 2:
                    addToCart ( currentUser );
                    break;
                case 3:
                    displayCart ( currentUser );
                    break;
                case 4:
                    createOrder ( currentUser );
                    break;
                case 5:
                    displayOrderHistory ( currentUser );
                    break;
                case 6:
                    System.out.println ( "Вихід з облікового запису." );
                    loggedIn = false;
                    currentUser = null;
                    break;
                default:
                    System.out.println ( "Неправильний вибір. Спробуйте ще раз." );
                    break;
            }
        }
        scanner.close ();
    }

    private User login () {
        System.out.print ( "Введіть свій логін: " );
        String username = scanner.nextLine ( );

        System.out.print ( "Введіть свій пароль: " );
        String password = scanner.nextLine ( );

        User user = userService.getUserByUsername ( username );
        if ( user != null && user.getPassword ( ).equals ( password ) ) {
            System.out.println ( "Ви успішно увійшли в обліковий запис." );
            return user;
        } else {
            System.out.println ( "Неправильний логін або пароль. Повторіть спробу." );
            return null;
        }
    }

    private void register () {
        int id = 0;
        try {
            System.out.print ( "Введіть Ваш ідентифікаційний код  чи Код ЄДРПОУ: " );
            id = Integer.parseInt ( scanner.nextLine ( ) );
        } catch (NumberFormatException e) {
            System.out.println ( "Введіть вірні дані." );
        }

        System.out.print ( "Введіть логін: " );
        String username = scanner.nextLine ( );

        System.out.print ( "Введіть пароль: " );
        String password = scanner.nextLine ( );

        String phoneNumber;
        do {
            System.out.print ( "Введіть номер телефону (+380XXXXXXXXX): " );
            phoneNumber = scanner.nextLine ( );
            if ( !isValidPhoneNumber ( phoneNumber ) ) {
                System.out.println ( "Неправильний формат номера телефону. Спробуйте ще раз." );
            }
        } while (!isValidPhoneNumber ( phoneNumber ));

        User newUser = new User ( id, username, password, phoneNumber );
        userService.addUser ( newUser );

        System.out.println ( "Ви успішно зареєстровані." );
    }

    private void displayProductList ( List<Product> products ) {
        System.out.println ( "Список продуктів:" );
        for (Product product : products) {
            System.out.println ( product.getId ( ) + ". " + product.getName ( ) + " - " + product.getPrice ( ) );
        }
    }

    private void addToCart ( User user ) {
        List<Product> products = productService.getAllProducts ( );
        displayProductList ( products );

        System.out.print ( "Введіть ідентифікатор товару для додавання в кошик: " );
        int productId = scanner.nextInt ( );
        scanner.nextLine ( ); // Очистити буфер після nextInt()

        Product product = productService.getProductById ( productId );
        if ( product != null ) {
            user.addToCart ( product );
            System.out.println ( "Товар додано в кошик." );
        } else {
            System.out.println ( "Товар з таким ідентифікатором не знайдено." );
        }
    }

    private void displayCart ( User user ) {
        List<Product> cartItems = user.getCartItems ( );
        System.out.println ( "Кошик:" );
        if ( cartItems.isEmpty ( ) ) {
            System.out.println ( "Кошик порожній." );
        } else {
            for (Product product : cartItems) {
                System.out.println ( "- " + product.getName ( ) + " - " + product.getPrice ( ) );
            }
        }
    }

    private void createOrder ( User user ) {
        List<Product> cartItems = user.getCartItems ( );
        if ( cartItems.isEmpty ( ) ) {
            System.out.println ( "Кошик порожній. Спочатку додайте товари в кошик." );
            return;
        }

        orderService.createOrder ( user, cartItems );
        user.clearCart ( );
        System.out.println ( "Замовлення оформлено!" );
    }

    private void displayOrderHistory ( User user ) {
        List<Order> orders = orderService.getUserOrders ( user );
        System.out.println ( "Історія замовлень:" );
        for (Order order : orders) {
            System.out.println ( "Замовлення #" + order.getId ( ) + " - Сума: " + order.getTotalAmount ( ) );
            System.out.println ( "Продукти:" );
            for (Product product : order.getProducts ( )) {
                System.out.println ( "- " + product.getName ( ) + " - " + product.getPrice ( ) );
            }
            System.out.println ( );
        }
    }

    public static void main ( String[] args ) {
        List<Product> products = new ArrayList<> ( );
        products.add ( new FoodProduct ( 1, "Товар 1", 100.0 ) );
        products.add ( new FoodProduct ( 2, "Товар 2", 200.0 ) );
        products.add ( new HouseholdСhemicalsProduct ( 3, "Товар 3", 300.0 ) );
        products.add ( new HouseholdСhemicalsProduct ( 4, "Товар 4", 400.0 ) );
        products.add ( new HouseholdСhemicalsProduct ( 5, "Товар 5", 500.0 ) );

        System.out.println ( "Вітаю Вас.\n" + "Сьогодні: " + LocalDate.now ( ) + "\nЗробіть свій вибір:" );

        UserRepository userRepository = new UserRepository ( );
        ProductService productService = new ProductService ( products );
        UserService userService = new UserService ( userRepository );
        OrderRepository orderRepository = new OrderRepository ( );
        OrderService orderService = new OrderService ( orderRepository );

        AppUI consoleUI = new AppUI ( productService, userService, orderService );
        consoleUI.run ( );
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\+380\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}