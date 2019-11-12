package Core4;

public class Car {
    private  Kermo kermo;
    private Koleso koleso;
    private Kuzov kuzov;

    public Car(Kermo kermo, Koleso koleso, Kuzov kuzov) {
        this.kermo = kermo;
        this.koleso = koleso;
        this.kuzov = kuzov;
    }

    public Kermo getKermo() {
        return kermo;
    }

    public void setKermo(Kermo kermo) {
        this.kermo = kermo;
    }

    public Koleso getKoleso() {
        return koleso;
    }

    public void setKoleso(Koleso koleso) {
        this.koleso = koleso;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kermo=" + kermo +
                ", koleso=" + koleso +
                ", kuzov=" + kuzov +
                '}';
    }
}
