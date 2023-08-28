package Task4;

import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = console.nextLine();
        try {
            if (str.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Вы ввели: " + str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}