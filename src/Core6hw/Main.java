package Core6hw;

import Core6hw.interface2.MyCalculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Завдання 1");


        EmployeeFix employeeFix = new EmployeeFix();
        EmployeeHour employeeHour = new EmployeeHour();

        employeeFix.salary();
        employeeHour.salary();

        System.out.println("Завдання 2");

        MyCalculator myCalculator = new MyCalculator();
        int result1 = myCalculator.add(4,5);
        int result2 = myCalculator.minus(7,2);
        int result3 = myCalculator.dev(8,2);
        int result4 = myCalculator.mult(6, 7);


        System.out.println("Сума = " +result1);
        System.out.println("Різниця = " +result2);
        System.out.println("Частка = " +result3);
        System.out.println("Добуток = " +result4);

    }

}
