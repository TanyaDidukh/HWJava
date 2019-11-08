package Core.src.Core1;

import java.util.Scanner;

public class HomeWork5_4 {
    public static void main(String[] args) {
        Scanner hw5 = new Scanner(System.in);
        System.out.println("Яке Ваше хоббі?");
        String text = hw5.nextLine();
        String[] w = text.split(" ");
        for (int i = 0; i<w.length; i++){
            System.out.println(w[i] + " - " + w[i].length());// + w[i].size());
        }

    }
}
