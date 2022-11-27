import java.util.Scanner;

public class ThirdAlgorithm {
    public static void elementsDivideByTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива, длина массива [5]");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите [" + i +"] элемент");
            array[i] = scanner.nextInt();
        }

        System.out.println("Готовый массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println("\n");
        System.out.println("Элементы кратные трём");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}

