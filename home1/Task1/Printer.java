class Answer {
    public void arrayOutOfBoundsException() {
        int[] arr = new int[5];
        System.out.println(arr[10]); // Выход за пределы массива
    }

    public void divisionByZero() {
        int a = 10;
        int b = 0;
        System.out.println(a / b); // Деление на ноль
    }

    public void numberFormatException() {
        String str = "abc";
        int num = Integer.parseInt(str); // Ошибка преобразования строки в число
        System.out.println(num);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}