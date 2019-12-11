import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Завдання 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довільне слово з 5 літер ");
        String slovo = scanner.nextLine();
        if(slovo.length()!=5)
            System.out.println("слово не з 5 літер");
        else {
            String newSlovo = new String();
            for (int i = slovo.length() - 1; i >= 0; i--){
                newSlovo = newSlovo + slovo.substring(i, i+1);
            }
            System.out.println("Нове слово: " + newSlovo);
            if (newSlovo.equalsIgnoreCase(slovo))
                System.out.println(slovo + " - паліндром");
        }


        System.out.println("Завдання 2");

        System.out.println("Введіть довільне слово ");
        slovo = scanner.nextLine();
        System.out.println(slovo.replaceAll("[aeiouyAEIOUYаеіоуАЕІОУ]", "-"));


        System.out.println("Завдання 3");

        System.out.println("Введіть довільне речення ");
        slovo = scanner.nextLine().trim();
        int count = slovo.replaceAll("[^ ]", "").length() + 1;
        System.out.println("кількість слів в реченні " + count);

        System.out.println("Завдання 4");

        System.out.println("Введіть довільний текст ");
        slovo = scanner.nextLine().trim();
        count = slovo.replaceAll("[^.?!]", "").length();
        System.out.println("кількість речень в тексті " + count);

        System.out.println("Завдання 5/6");

        System.out.println("Введіть довільне речення (слова розділяти пробілами)");
        slovo = scanner.nextLine().trim();
        String[] list = slovo.split(" ");
        System.out.println(Arrays.toString(list));
        count = 1;
        int[] list1 = new int[list.length];
        for (int i = 0; i < list.length; i++){
            for (int j=0; j < list.length; j++){
                if(i!=j && list[i].equals(list[j]))
                    count++;
            }
            list1[i] = count;
            count = 1;
        }
        System.out.println(Arrays.toString(list1));
        int maxValue = list1[0];
        for (int i = 0; i < list1.length; i++) {
            if (maxValue<=list1[i]){
                maxValue = list1[i];
            }
        }
        String result = list[0];
        for (int i = 0; i < list1.length; i++) {
            if (maxValue==list1[i])
                result = list[i];
        }
        System.out.println("Найчастіше зустрічається слово: " + result);

    }
}
