public class PrimeNumber {
    public static void main(String[] args) {
        int i;

        for (i = 2; i<100; i++){
            if ((i==2)|((i % 2)!=0))
                if ((i==3)|((i % 3)!=0))
                    if ((i==5)|((i % 5)!=0))
                        if ((i==7)|((i % 7)!=0))
                            System.out.print(i+"\t");
        }
    }
}
