package Task3;

import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            /*
             * 1. В этой задаче нужно поменять местами catch
             * т.к. Throwable стоит на самой вершине иерархии и
             * соответственно остальные подклассы NullPointerException и
             * NullPointerException не будут отрабатывать должным образом.
             * 2. Объявленое исключение FileNotFoundException не обрабатывается, по этому
             * вынесем его в try catch.
             */
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
