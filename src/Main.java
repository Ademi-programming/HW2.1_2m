import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();

        System.out.println("Введите 5 строк для списка A: ");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);

            System.out.println("Содержимое списка A:");

            for (String str : listA) {
                System.out.println(str);
            }
        }

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);

            System.out.println("Содержимое списка B:");
            for (String str : listB) {
                System.out.println(str);
            }
        }
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Содержимое списка C (объединенный список A и B):");
        for (String str : listC) {
            System.out.println(str);
        }

        Collections.sort(listC);
        System.out.println("Отсортированный список C по длине строк:");
        for (String str : listC) {
            System.out.println(str);

            scanner.close();

        }
    }
}