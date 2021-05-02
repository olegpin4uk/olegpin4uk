public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++){
            switch (i) {
                case 0 -> System.out.println("i равно 0");
                case 1 -> System.out.println("i равно 1");
                case 2 -> System.out.println("i равно 2");
                case 3 -> System.out.println("i равно 3");
                case 4 -> System.out.println("i равно 4");
                default -> System.out.println("i равно или больше 5");
            }
        }
    }
}
