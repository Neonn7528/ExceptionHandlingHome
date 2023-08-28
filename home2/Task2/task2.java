package Task2;

/*Если необходимо, исправьте данный код
 * try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */
public class task2 {
    private static int[] intArray = { 2, 3, 4, 5, 6, 7 };

    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = intArray[3] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            // Указывается что за ошибка, но не указывается
            // где эту ошибку искать.
            System.out.println("Catching exception: ");
            // я бы дополнил еще:
            e.printStackTrace();
        }
    }
}
