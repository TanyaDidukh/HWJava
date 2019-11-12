package Core4;

public class Kermo {

    private int diametr;

    public Kermo (){
    }

    public Kermo(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Kermo{" +
                "diametr=" + diametr +
                '}';
    }

    public void changeDiametr (int zmina){
        diametr += zmina;
    }
}
