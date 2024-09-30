import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Que onda pa");
        System.out.println(":D");
        System.out.println("Digame su nombre c:");
        String name = scanner.nextLine();

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int sum = n1 + n2;

        System.out.println(sum);
        if (sum == 3) {
            System.out.println("Tonto");


        } else {
            System.out.println("Nose c:");
        }
        if (Objects.equals(name, "nicolah")) {
            System.out.println("Hola nicolah");

        } else {
            System.out.println("Ola "+name);
        }
    }
}