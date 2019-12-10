import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws WrongInputConsoleParametersException {

        System.out.println(">>Задача 1");
        Scanner scanner = new Scanner(System.in);
        Months result = null;

        // пропозиція введення чи виходу
        System.out.println("1 Введіть довільний місяць.");
        String m = scanner.nextLine();

        // 1.1 перевірити, чи існує місяць
        try {
            result = Months.valueOf(m.toUpperCase());
        }
        catch(IllegalArgumentException e){
            throw new WrongInputConsoleParametersException("Такого місяця не існує");
        }

        // 1.2 Вивести місяці з такою порою року
        System.out.println(result + " - це пора року " + result.getSeason());
        for (int i = 0; i < Months.values().length; i++) {
            if (Months.values()[i].getSeason() == result.getSeason() && result != Months.values()[i]) {
                System.out.println(result.getSeason() + ": " + Months.values()[i]);
            }
        }
        // 1.3 Вивести всі місяці з такою кількістю днів
        System.out.println(result + " має днів " + result.getDays());
        for (int i = 0; i < Months.values().length; i++) {
            if (Months.values()[i].getDays() == result.getDays() && result != Months.values()[i]) {
                System.out.println(result.getDays() + ": " + Months.values()[i]);
            }
        }
        // 1.4 Вивести місяці з меншою кількістю днів
        System.out.println("Меншу кількість днів мають:");
        for (int i = 0; i < Months.values().length; i++) {
            if (Months.values()[i].getDays() < result.getDays()) {
                System.out.println(Months.values()[i].getDays() + ": " + Months.values()[i]);
            }
        }
        // 1.5 Вивести місяці з більшою кількістю днів
        System.out.println("Більшу кількість днів мають:");
        for (int i = 0; i < Months.values().length; i++) {
            if (Months.values()[i].getDays() > result.getDays()) {
                System.out.println(Months.values()[i].getDays() + ": " + Months.values()[i]);
            }
        }
        // 1.6 Вивести наступну пору року
        for (int i = 0; i < Season.values().length; i++) {
            if (Season.values()[i] == result.getSeason() && i != Season.values().length - 1)
                System.out.println("Наступна пора року: " + Season.values()[i + 1]);
            if (Season.values()[i] == result.getSeason() && i == Season.values().length - 1)
                System.out.println("Наступна пора року: " + Season.values()[0]);
        }
        // 1.7 Вивести попередню пору року
        for (int i = 0; i < Season.values().length; i++) {
            if (Season.values()[i] == result.getSeason() && i != 0)
                System.out.println("Попередня пора року: " + Season.values()[i - 1]);
            if (Season.values()[i] == result.getSeason() && i == 0)
                System.out.println("Попередня пора року: " + Season.values()[Season.values().length - 1]);
        }
        // 1.8 Місяці з парною кількістю днів
        System.out.println("Місяці з парною кількістю днів");
        for (int i = 0; i < Months.values().length; i++) {
            if (Months.values()[i].getDays() % 2 == 0)
                System.out.println(Months.values()[i]);
        }
        // 1.8 Місяці з непарною кількістю днів
        System.out.println("Місяці з непарною кількістю днів");
        for (int i = 0; i < Months.values().length; i++) {
            if (Months.values()[i].getDays() % 2 != 0)
                System.out.println(Months.values()[i]);
        }
        // 1.9 Чи введений місяць має парну кількість днів
        if (result.getDays() % 2 == 0)
            System.out.println(result + " має парну кількість днів (" + result.getDays() + ")");
        else
            System.out.println(result + " має непарну кількість днів (" + result.getDays() + ")");


        System.out.println(">>Задача 2");
        System.out.println("Введіть перше число");
        double a = scanner.nextDouble();
        System.out.println("Введіть друге число");
        double b = scanner.nextDouble();
        try {
            Methods methods = new Methods(a, b);
            methods.add();
            methods.minus();
            methods.mult();
            methods.dev();
        }
        catch(Exception e){

        }
    }
}
