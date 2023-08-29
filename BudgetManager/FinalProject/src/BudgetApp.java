import color.ConsoleColors;

import java.io.File;
import java.util.Scanner;

public class BudgetApp {
    private static Budget budget;
    private static FileManager fileManager = new FileManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir") + "/src/budgetManager.txt");

        budget = (Budget) fileManager.loadDataFromFile(file);

        if (budget == null) {
            budget = new Budget();
        }
        System.out.println(ConsoleColors.CYAN_BACKGROUND_BRIGHT + "~Вітаємо в додатку \"БЮДЖЕТ\"!~");
        boolean isRunning = true;
        while (isRunning) {
            System.out.println(ConsoleColors.CYAN_BRIGHT + "~~~~~ ГОЛОВНЕ МЕНЮ ~~~~~");
            System.out.println(ConsoleColors.CYAN_BRIGHT +  "1 - додати транзакцію.");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "2 - переглянути бюджет");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "3 - редагувати транзакцію");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "4 - видалити транзакцію");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "5 - зберегти дані");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "6 - завантажити дані");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "7 - вийти");
            System.out.println(ConsoleColors.CYAN_BRIGHT + "~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print(ConsoleColors.RESET + "Обрана опція: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTransaction();
                    break;
                case 2:
                    viewBudget();
                    break;
                case 3:
                    editTransaction();
                    break;
                case 4:
                    removeTransaction();
                    break;
                case 5:
                    fileManager.saveDataToFile(budget, file);
                    break;
                case 6:
                    loadDataFromFile(file);
                    break;
                case 7:
                    isRunning = false;
                    System.out.println(ConsoleColors.CYAN_BACKGROUND_BRIGHT + "Дякуємо за використання BudgetApp!");
                    break;
                default:
                    System.out.println("Такого варіанту не існує! Спробуйте ще раз :)");
                    break;
            }
        }
    }

    private static void addTransaction() {
        System.out.print("Введіть тип транзакції (прибуток чи витрата): ");
        String type = scanner.nextLine();
        System.out.print("Введіть суму транзакції: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть категорію транзакції: ");
        String category = scanner.nextLine();

        Transaction transaction = new Transaction(type, amount, category);
        budget.addTransaction(transaction);
        System.out.println("Транзакція успішно додана!");
    }

    private static void viewBudget() {
        System.out.println("Ваш бюджет:");
        for (Transaction transaction : budget.getTransactions()) {
            System.out.println("ID: " + transaction.getId());
            System.out.println("Тип: " + transaction.getType());
            System.out.println("Сума: " + transaction.getMoneyAmount());
            System.out.println("Категорія: " + transaction.getCategory());
            System.out.println();
        }
        System.out.println("Загальний баланс: " + Budget.getBalance());
    }

    private static void editTransaction() {
        System.out.print("Введіть ID транзакції для редагування: ");
        int transactionId = scanner.nextInt();
        scanner.nextLine();

        Transaction transactionToEdit = budget.getTransactionById(transactionId);
        if (transactionToEdit != null) {
            System.out.print("Введіть новий тип транзакції (прибуток чи витирата): ");
            String type = scanner.nextLine();
            System.out.print("Введіть нову суму транзакції: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Введіть нову категорію транзакції: ");
            String category = scanner.nextLine();

            budget.editTransaction(transactionId, type, amount, category);
            System.out.println("Транзакція успішно відредагована.");
        } else {
            System.out.println("Транзакцію з таким ID не знайдено. Спробуйте ще раз :)");
        }
    }

    private static void removeTransaction() {
        System.out.print("Введіть ID транзакції для видалення: ");
        int transactionId = scanner.nextInt();
        scanner.nextLine();
        budget.removeTransaction((int) transactionId);
        System.out.println("Транзакція успішно видалена.");
    }

    private static void loadDataFromFile(File file) {
        budget = (Budget) fileManager.loadDataFromFile(file);
        System.out.println("Дані успішно завантажено з файлу.");
    }
}