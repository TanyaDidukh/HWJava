package Core5;

public class House {

    int window;
    int floor;
    int room;
    // конструктор без параметрів
    public House (){
        window = 10;
        floor = 2;
        room = 4;
    }
    // конструктор з 1 параметром
    public House (int window){
        this.window = window;
    }
    // конструктор з 2 параметрами
    public House (int window, int floor){
        this.window = window;
        this.floor = floor;
    }
    // конструктор з 3 параметрами
    public House (int window, int floor,int room){
        this.window = window;
        this.floor = floor;
        this.room = room;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                ", floor=" + floor +
                ", room=" + room +
                '}';
    }
}
