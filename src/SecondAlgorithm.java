import java.util.Scanner;

public class SecondAlgorithm {
    public static void ifNameIsVyacheslav() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
            ifNameIsVyacheslav();
        }
    }
}
