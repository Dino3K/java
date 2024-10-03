import java.util.Scanner;
public class Perro {
    String raza;
    int edad,peso,tamaño;
    boolean vacuna;
    public void ladrar(){
        System.out.println("Guau guau");
    }
    public void morder(){
        System.out.println("Orale puto");
    }
    public void rascar(){
        System.out.println("Se rasca");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perro p1 = new Perro();
        System.out.println("Diga la raza del perro");
        p1.raza = sc.nextLine();
        System.out.println("Diga la edad del perro");
        p1.edad = sc.nextInt();
        p1.ladrar();
        p1.morder();
        p1.rascar();
        System.out.println("Su perro es un "+p1.raza+" y tiene estos años: "+p1.edad);
    }
}
