public class DataFormatExeption {
    static boolean dateFormat(String date) {
        try {
            String[] dateParts = date.split("\\.");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 2023) {
                return false;
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return false;
        }

        return true;
    }
}
