public class GalToLitTable {
        public static void main(String[] args) {
            double gallons, liters;
            int counter;
            counter = 0;

            for (gallons = 1; gallons <= 100; gallons++) {
                liters = gallons * 3.7854; // преобразование в литры
                System.out.println(gallons + " галлонам соответ ствует " + liters + " литра.");
                counter++; // Увеличивать значение счетчика строк на 1 на каждой итерации цикла
                if (counter == 10) { // Если значение счетчика равно 1 О, вывести пустую строку
                    System.out.println();
                    counter = 0; // сбросить счетчик строк

                }
            }
        }
}
