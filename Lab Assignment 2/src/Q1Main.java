import java.sql.SQLOutput;

public class Q1Main {
    public static void main(String[] args) {


        Invoice one = new Invoice(1,10,100,"red");
        Invoice two = new Invoice(2,3,200,"Blue");

        one.paid = true;
        two.paid = true;

        System.out.println(one);
        System.out.println(two);
    }
}
