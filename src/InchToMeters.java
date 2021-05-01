public class InchToMeters {
    public static void main(String[] args) {
        double inch, meters;
        int counter;
        counter = 0;
        double ratio;
        ratio = 1/39.37;

        for (inch = 1; inch <= 100; inch++) {
            meters = inch * ratio; // преобразование в литры
            System.out.println(inch + " дюймам соответствует " + meters + " метра.");
            counter++; // Увеличивать значение счетчика строк на 1 на каждой итерации цикла
            if (counter == 12) { // Если значение счетчика равно 1 О, вывести пустую строку
                System.out.println();
                counter = 0; // сбросить счетчик строк

            }
        }
    }
}
