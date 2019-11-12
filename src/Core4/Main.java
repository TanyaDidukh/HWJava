package Core4;

public class Main {
    public static void main(String[] args) {

        System.out.println("завдання 1");

        Robot coffeRobot = new CoffeRobot();
        Robot robotCooker = new RobotCoocker();
        Robot robotDancer = new RobotDancer();

        coffeRobot.work();
        robotCooker.work();
        robotDancer.work();

        Robot[] array = {coffeRobot,robotCooker,robotDancer};
        for (int i=0; i<array.length; i++){
            array [i].work();

        }

        System.out.println("завдання 2");



        Kermo kermo = new Kermo(20);
        Koleso koleso = new Koleso(160);
        Kuzov kuzov = new Kuzov("grey",1500);
        Car renault = new Car (kermo,koleso,kuzov);
        System.out.println(renault);
        kermo.changeDiametr(5);
        koleso.changeRozmir(10);
        kuzov.changeColor("red");
        kuzov.changeVaga(60);
        System.out.println(renault);



        System.out.println("завдання 3");


        Animal animal = new Animal("leopard",20, 7);
        System.out.println(animal);
        animal.setAge(14);
        animal.setName("bull");
        animal.setSpeed(2);
        System.out.println("Назва тварини = " + animal.getName()+ ", Швидкість тварини = " + animal.getSpeed()+ " км/год, Вік тварини = " + animal.getAge() + " років");





    }



}
