import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Проверка на равенство длин массивов
        if (a.length != b.length) {
            return new int[]{0}; // Возвращаем нулевой массив длины 1
        }

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }

        return c;
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на выполнение, вы можете изменять эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3,};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        int[] result = ans.subArrays(a, b);

        String itresume_res = Arrays.toString(result);
        System.out.println(itresume_res);
    }
}