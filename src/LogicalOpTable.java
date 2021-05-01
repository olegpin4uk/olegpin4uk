public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;
        int answer;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        answer = 0;
        if (p) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p&q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p|q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p^q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (!p) {
            System.out.println(answer + 1 + "\t");
        }
        else {
            System.out.println(answer + "\t");
        }

        p = true;
        q = false;
        answer = 0;
        if (p) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p&q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p|q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p^q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (!p) {
            System.out.println(answer + 1 + "\t");
        }
        else {
            System.out.println(answer + "\t");
        }


        p = false;
        q = true;
        answer = 0;
        if (p) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p&q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p|q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p^q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (!p) {
            System.out.println(answer + 1 + "\t");
        }
        else {
            System.out.println(answer + "\t");
        }


        p = false;
        q = false;
        answer = 0;
        if (p) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p&q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p|q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (p^q) {
            System.out.print(answer + 1 + "\t");
        }
        else {
            System.out.print(answer + "\t");
        }
        if (!p) {
            System.out.println(answer + 1 + "\t");
        }
        else {
            System.out.println(answer + "\t");
        }
    }
}
