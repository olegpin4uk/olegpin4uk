public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q)+"\t"+ (p|q)+"\t");
        System.out.println((p^q)+"\t" + (!p) + "\t");

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q)+"\t"+ (p|q)+"\t");
        System.out.println((p^q)+"\t" + (!p) + "\t");

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q)+"\t"+ (p|q)+"\t");
        System.out.println((p^q)+"\t" + (!p) + "\t");

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q)+"\t"+ (p|q)+"\t");
        System.out.println((p^q)+"\t" + (!p) + "\t");


    }
}
