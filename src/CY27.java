public class CY27 extends Plane implements Opportunities{

    int maxSpeed;
    String color;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CY27(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void turboA (){
    double turboSPEED = Math.random()*100 + maxSpeed;
     System.out.println("Турборискорення становить: " + turboSPEED+ " км/год.");
    }

    public void stels (){
    double invisible = Math.random()*100;
    System.out.println("Літак невидимий протягом: " + invisible + " хвилин");
    }
    public void nuclearStrike (){
    int strike = (int)(Math.random()*10);
    System.out.println("Кількість ядерних ударів: " + strike);
    }

}

