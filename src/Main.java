public class Main {
    public static void main(String[] args) {
        CY27 cy27 = new CY27(500,"white");
        System.out.println("Готовність літака взлетіти настане через: " + cy27.startEngine() + " хв.");
        System.out.println("При поній заправці літак пролетить: " + cy27.takeOff() + " км.");

        RidePlane ridePlane = new RidePlane(cy27);
        System.out.println("Літак летить вверх :" + ridePlane.moveUp() + " км.");
        System.out.println("Літак летись прямо : " + ridePlane.moveSright() + " км.");
        System.out.println("Літак повертаючись долає : " + ridePlane.moveBack() + " км.");
        System.out.println("Літак летись вниз : " + ridePlane.moveDowm() + " км.");

        cy27.stels();
        cy27.nuclearStrike();
        cy27.turboA();
        cy27.landing();

    }
}
