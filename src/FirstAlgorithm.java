import java.util.Scanner;

public class FirstAlgorithm {
    public static void ifNumberMoreThanSeven() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() > 7) {
            System.out.println("Привет");
        }
        else {
            ifNumberMoreThanSeven();
        }
    }
}
