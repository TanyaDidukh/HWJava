package Core3;

public class Сircle {
    private double radius;
    private double diameter;

    public Сircle (){
        radius = 1.1;
        diameter = 2.2;
    }

    public Сircle (double r, double d){
        radius = r;
        diameter = d;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double area (){
        return (Math.PI)*diameter*diameter/4d;
    }

    public double length (){
        return 2*(Math.PI)*radius;
    }
    public void info (){
        System.out.println("Площа кола = " + area());
        System.out.println("Довжина кола = " + length());

    }
}


