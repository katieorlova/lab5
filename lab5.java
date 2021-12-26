import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class lab5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n;
        while (true) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                break;
            }
            else {
                System.out.print ("Ошибка!Введите целое число: ");
                in.next();
            }
        }

        ArrayList <Float> list = new ArrayList<>();
        System.out.print ("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            float p = in.nextFloat();
            list.add(p);
        }
        in.close();

        System.out.println("Оригинальная коллекция: ");
        for (Float p : list) {
            System.out.print (p + " ");
        }
        System.out.println();

        float max = Float.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            else {
                list.remove(i);
            }
        }

        Collections.sort(list);

        System.out.println("Конечная коллекция: ");
        for (Float j : list) {
            System.out.print (j + " ");
        }
    }
}