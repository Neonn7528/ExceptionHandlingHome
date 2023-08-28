package Task1;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        try {
            float num = console.nextFloat();
            System.out.println("Вы ввели: " + num);
        } catch (Exception e) {
            String str = console.nextLine();
            System.out.println("Некорректный ввод! Введите дробное число.");
        }
    }
}
