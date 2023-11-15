import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameA = new ArrayList<>();
        ArrayList<String> nameB = new ArrayList<>();
        ArrayList<String> nameC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 разных слов ");
        for (int i = 0; i < 5; i++) {
            nameA.add(scanner.next());
        }
        System.out.println("Список А " + nameA);

        System.out.println("Введите 5 разных слов ");
        for (int i = 0; i < 5; i++) {
            nameB.add(scanner.next());
        }
        System.out.println("Список B " + nameB);

        Collections.sort(nameA);
        Collections.reverse(nameB);
        for (int i = 0; i < 5; i++) {
            nameC.add(nameA.get(i));
            nameC.add(nameB.get(i));
        }

        System.out.println("Сортировка С:"+nameC);
        Collections.sort(nameC,new Sorting());
        System.out.println("Сортировка по количеству букв :"+nameC);


    }

}