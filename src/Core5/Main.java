package Core5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("завдання 1");

        Cow cow = new Cow();
        Cat cat = new Cat();
        Dog dog = new Dog();

        cow.voice();
        cat.voice();
        dog.voice();

        System.out.println("завдання 2");


        Random r1 = new Random();

        boolean side = r1.nextBoolean(); // true - орел, false - решка
       if (side==true){
           System.out.println("випав орел");
       }
       else {
           System.out.println("випала решка");
       }


        System.out.println("завдання 3");

        System.out.println(String.format(String.valueOf(Float.MAX_VALUE), "%e"));
        System.out.println(String.format(String.valueOf(Double.MAX_VALUE), "%e"));


        System.out.println("завдання 4");

        House house1 = new House();
        System.out.println(house1);
        House house2 = new House(5);
        System.out.println(house2);
        House house3 = new House(5,2);
        System.out.println(house3);
        House house4 = new House (10,2,5);
        System.out.println(house4);


        System.out.println("завдання 5");

     Amphibia frog = new Frog();
     frog.eat();
     frog.sleep();
     frog.sweem();
     frog.walk();




    }
}
