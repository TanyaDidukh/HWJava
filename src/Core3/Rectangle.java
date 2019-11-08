package Core3;

public class Rectangle {
  private int width;
  private int length;

  public Rectangle (){
      width = 1;
      length = 1;
  }

  public Rectangle (int a, int b){
      width = a;
      length = b;
  }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

  public  int perimeter (){
      return (width+length)*2;
  }
  public  int area (){
        return width*length;
    }
  public void info(){
      System.out.println("Площа прямокутника = " + area());
      System.out.println("Периметр прямокутника = " + perimeter());
  }
}






