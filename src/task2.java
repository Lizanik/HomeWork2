import java.util.Scanner;
public class data2{
    public static void main(String[]arg) {
        double x, y, a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        x =  input.nextInt();
        y = x * 0.4536;
        a =( y -(int) y )*100;
        System.out.println((int)y + "kilo");
        System.out.println((int)a + "gram");
    }
}
