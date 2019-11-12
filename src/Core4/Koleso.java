package Core4;

public class Koleso {

    private int rozmir;

    public Koleso (){
    }

    public Koleso(int rozmir) {
        this.rozmir = rozmir;
    }

    public int getRozmir() {
        return rozmir;
    }

    public void setRozmir(int rozmir) {
        this.rozmir = rozmir;
    }

    @Override
    public String toString() {
        return "Koleso{" +
                "rozmir=" + rozmir +
                '}';
    }
    public void changeRozmir (int zmina){
        rozmir +=zmina;
    }
}
