package Core4;

public class Kuzov {

    private String color;
    private int vaga;

    public Kuzov (){
    }

    public Kuzov(String color, int vaga) {
        this.color = color;
        this.vaga = vaga;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return "Kuzov{" +
                "color='" + color + '\'' +
                ", vaga=" + vaga +
                '}';
    }

    public void changeColor (String change){
        color = change;
    }
    public void changeVaga (int zmina){
        vaga += zmina;
    }
}

