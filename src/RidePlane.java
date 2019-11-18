public class RidePlane {
    Plane plane;
    public RidePlane(Plane plane) {
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public RidePlane (){

    }
    public double moveUp (){
        return Math.random()*100;
    }
    public double moveDowm (){
        return Math.random()*100;
    }
    public double moveSright (){
        return Math.random()*100;
    }
    public double moveBack (){
        return Math.random()*100;
    }
}
