import java.util.Scanner;
public class Sise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numerito");
        int n1 = sc.nextInt();
        System.out.println("Digite su otro numerito");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            System.out.println(n2);
        }else {
            System.out.println(n1);
        }

    }
}
