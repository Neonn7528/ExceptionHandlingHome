import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print(
                        "Введите данные латиницей через пробел: Фамилия Имя Отчество дата рождения(12.12.1221) номер телефона пол(m или f)): ");
                String input = scanner.nextLine();
                String[] inputData = input.split(" ");// вносим данные через пробел

                if (inputData.length != 6) {
                    throw new IllegalArgumentException("Введено неверное количество данных");
                }

                String lastName = inputData[0];
                String firstName = inputData[1];
                String fatherName = inputData[2];
                String dateOfBirth = inputData[3];
                long phoneNumber = Long.parseLong(inputData[4]);// Объект типа Long содержит одно поле длинного типа
                char gender = inputData[5].charAt(0);
                if (!DataFormatExeption.dateFormat(dateOfBirth)) {
                    throw new IllegalArgumentException("Неверный формат даты");
                }

                if (gender != 'f' && gender != 'm') {
                    throw new IllegalArgumentException("Неверное значение пола");
                }

                FileWriter fileWriter = new FileWriter("data.txt", true);
                String data = lastName + " " + firstName + " " + fatherName + " " + dateOfBirth + " " + phoneNumber
                        + " " + gender + "\n";
                fileWriter.write(data);
                fileWriter.close();
            }

            System.out.println("Данные успешно записаны в файл!");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}