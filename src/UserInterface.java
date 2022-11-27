import java.util.InputMismatchException;

public class UserInterface {

    public void runApplication() {
        try {
            System.out.println("\nЗадание №1 \n" + "Введите число больше семи");
            FirstAlgorithm.ifNumberMoreThanSeven();
            System.out.println("\nЗадание №2 \n" + "Введите имя (например Вячеслав)");
            SecondAlgorithm.ifNameIsVyacheslav();
            System.out.println("\nЗадание №3 \n" + "Работа с числовым массивом: Элементы кратные трём\n");
            ThirdAlgorithm.elementsDivideByTree();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели недопустимый символ! Перезапустите программу!");
            e.printStackTrace();
        }
    }
}
