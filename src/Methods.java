public class Methods {

    double a;
    double b;

    Methods(double a, double b){
        this.a = a;
        this.b = b;

        try {
            checkExceptions();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkExceptions() throws Exception{
        if(a<0 && b<0)
            throw new IllegalArgumentException("обидва параметри менші нуля");
        else if((a==0 && b!=0) || (a!=0 && b==0))
            throw new ArithmeticException("один з аргументів рівний нулю");
        else if(a==0 && b==0)
            throw new IllegalArgumentException("обидва параметри рівні нулю");
        else if(a>0 && b >0)
            throw new MyException("my exception");
    }

    public double add() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double mult() {
        return a * b;
    }

    public double dev() throws MyException{
        try{
            return a / b;
        }
        catch (ArithmeticException e){
            throw new MyException("ймовірне ділення на нуль");
        }
    }

}
