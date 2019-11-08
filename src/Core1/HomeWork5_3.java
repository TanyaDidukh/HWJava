package Core.src.Core1;

public class HomeWork5_3 {
    public static void main(String[] args) {
       int k =  sum ( 5, 7);
       System.out.println("k= " +k);
       String a = age (1983);
        System.out.println(a);
    }

     /**
     @ method which find sum*/
    public static int sum (int x, int y){

        return x+y;
    }

    /**
     @ method which find age*/
    public static String age (int year){
        return "Ваш вік: " + (2019 - year);
    }

}
