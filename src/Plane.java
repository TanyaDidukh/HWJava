public abstract class Plane {
    public Plane (){

    }
    int length;
    int weight;
    int width;

    public Plane(int length, int weight, int width) {
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double startEngine (){
        return Math.random()*(88-20)+20;
    }
    public double takeOff (){
        return Math.random()*1000;
    }
    public void landing (){
        System.out.println("Літак іде на посадку");
    }
}
