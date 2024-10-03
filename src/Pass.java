import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Objects;
public class Pass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password;
        int intentos = 0;
        do {
            System.out.println("Ingrese la contraseña");
            password = scanner.nextLine();
            intentos++;
        } while (!password.equals("Tonto123") && intentos < 5);
        if (password.equals("Tonto123")){
            System.out.println("Goog choice");
        } else {
            System.out.println("Mamaste");
        }




    }
}
