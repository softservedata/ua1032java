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
            System.out.println ( "\t1. �����" );
            System.out.println ( "\t2. ��������������" );
            System.out.println ( "\t3. �����" );

            int choice = scanner.nextInt ( );
            scanner.nextLine ( ); // �������� ����� ���� nextInt()

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
                    System.out.println ( "�� ���������!" );
                    System.exit ( 0 );
                    break;
                default:
                    System.out.println ( "������������ ����. ��������� �� ���." );
                    break;
            }
        }

        while (loggedIn) {
            System.out.println ( "1. ����������� ������ ��������" );
            System.out.println ( "2. ������ ����� � �����" );
            System.out.println ( "3. ����������� �����" );
            System.out.println ( "4. �������� ����������" );
            System.out.println ( "5. ����������� ������ ���������" );
            System.out.println ( "6. �����" );

            int choice = scanner.nextInt ( );
            scanner.nextLine ( ); // �������� ����� ���� nextInt()

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
                    System.out.println ( "����� � ��������� ������." );
                    loggedIn = false;
                    currentUser = null;
                    break;
                default:
                    System.out.println ( "������������ ����. ��������� �� ���." );
                    break;
            }
        }
        scanner.close ();
    }

    private User login () {
        System.out.print ( "������ ��� ����: " );
        String username = scanner.nextLine ( );

        System.out.print ( "������ ��� ������: " );
        String password = scanner.nextLine ( );

        User user = userService.getUserByUsername ( username );
        if ( user != null && user.getPassword ( ).equals ( password ) ) {
            System.out.println ( "�� ������ ������ � �������� �����." );
            return user;
        } else {
            System.out.println ( "������������ ���� ��� ������. �������� ������." );
            return null;
        }
    }

    private void register () {
        int id = 0;
        try {
            System.out.print ( "������ ��� ���������������� ���  �� ��� ������: " );
            id = Integer.parseInt ( scanner.nextLine ( ) );
        } catch (NumberFormatException e) {
            System.out.println ( "������ ��� ���." );
        }

        System.out.print ( "������ ����: " );
        String username = scanner.nextLine ( );

        System.out.print ( "������ ������: " );
        String password = scanner.nextLine ( );

        String phoneNumber;
        do {
            System.out.print ( "������ ����� �������� (+380XXXXXXXXX): " );
            phoneNumber = scanner.nextLine ( );
            if ( !isValidPhoneNumber ( phoneNumber ) ) {
                System.out.println ( "������������ ������ ������ ��������. ��������� �� ���." );
            }
        } while (!isValidPhoneNumber ( phoneNumber ));

        User newUser = new User ( id, username, password, phoneNumber );
        userService.addUser ( newUser );

        System.out.println ( "�� ������ �����������." );
    }

    private void displayProductList ( List<Product> products ) {
        System.out.println ( "������ ��������:" );
        for (Product product : products) {
            System.out.println ( product.getId ( ) + ". " + product.getName ( ) + " - " + product.getPrice ( ) );
        }
    }

    private void addToCart ( User user ) {
        List<Product> products = productService.getAllProducts ( );
        displayProductList ( products );

        System.out.print ( "������ ������������� ������ ��� ��������� � �����: " );
        int productId = scanner.nextInt ( );
        scanner.nextLine ( ); // �������� ����� ���� nextInt()

        Product product = productService.getProductById ( productId );
        if ( product != null ) {
            user.addToCart ( product );
            System.out.println ( "����� ������ � �����." );
        } else {
            System.out.println ( "����� � ����� ��������������� �� ��������." );
        }
    }

    private void displayCart ( User user ) {
        List<Product> cartItems = user.getCartItems ( );
        System.out.println ( "�����:" );
        if ( cartItems.isEmpty ( ) ) {
            System.out.println ( "����� �������." );
        } else {
            for (Product product : cartItems) {
                System.out.println ( "- " + product.getName ( ) + " - " + product.getPrice ( ) );
            }
        }
    }

    private void createOrder ( User user ) {
        List<Product> cartItems = user.getCartItems ( );
        if ( cartItems.isEmpty ( ) ) {
            System.out.println ( "����� �������. �������� ������� ������ � �����." );
            return;
        }

        orderService.createOrder ( user, cartItems );
        user.clearCart ( );
        System.out.println ( "���������� ���������!" );
    }

    private void displayOrderHistory ( User user ) {
        List<Order> orders = orderService.getUserOrders ( user );
        System.out.println ( "������ ���������:" );
        for (Order order : orders) {
            System.out.println ( "���������� #" + order.getId ( ) + " - ����: " + order.getTotalAmount ( ) );
            System.out.println ( "��������:" );
            for (Product product : order.getProducts ( )) {
                System.out.println ( "- " + product.getName ( ) + " - " + product.getPrice ( ) );
            }
            System.out.println ( );
        }
    }

    public static void main ( String[] args ) {
        List<Product> products = new ArrayList<> ( );
        products.add ( new FoodProduct ( 1, "����� 1", 100.0 ) );
        products.add ( new FoodProduct ( 2, "����� 2", 200.0 ) );
        products.add ( new Household�hemicalsProduct ( 3, "����� 3", 300.0 ) );
        products.add ( new Household�hemicalsProduct ( 4, "����� 4", 400.0 ) );
        products.add ( new Household�hemicalsProduct ( 5, "����� 5", 500.0 ) );

        System.out.println ( "³��� ���.\n" + "�������: " + LocalDate.now ( ) + "\n������ ��� ����:" );

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