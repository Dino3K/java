import java.sql.SQLOutput;
import java.util.Scanner;
public class Autobus {
    int Npasajeros=0,TanqCombustible=0;
    int Capacidad =27;
    public void recogerP(int uno){
        if(Capacidad >0 && Capacidad<=27 && uno <=27 && uno >0){
            Capacidad-=uno;
            Npasajeros+=uno;
        }
        System.out.println("La capacidad es de: "+Capacidad);
        System.out.println("El numero de pasajeros es de: "+Npasajeros);
    }
    public void descargarP(int uno){
        if(Capacidad >0 && Capacidad<=27 && uno <=27 && uno >0){
            Capacidad+=uno;
            Npasajeros-=uno;
        }


    }
    public void Arrancar(){
    }
    public void Tanquear(int num){
        if (TanqCombustible < 100){
            TanqCombustible+=num;
        }
    }

    public static void main(String[] args) {
        Autobus Bus = new Autobus();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola!");
        int num = 1;
        while (num == 1){
            System.out.println("Que quieres hacer?");
            System.out.println("1: Reccoger Pasajero");
            System.out.println("2: Descargar Pasajero");
            System.out.println("3: Tanquear");
            System.out.println("4: Arrancar");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Cuantos pasajeros?");
                    int ps = sc.nextInt();
                    Bus.recogerP(ps);
                    break;
                case 2:
                    System.out.println("Cuantos pasajeros?");
                    int pss = sc.nextInt();
                    Bus.descargarP(pss);
                    break;
                case 3:
                    if (Bus.TanqCombustible == 100){
                        System.out.println("Tanque lleno");
                        break;
                    }else {
                        System.out.println("Cuanto quiere tanquear?");
                        int tnq = sc.nextInt();
                        Bus.Tanquear(tnq);
                        break;
                    }
                case 4:
                    if(Bus.TanqCombustible < 5){
                        System.out.println("Debe tanquear primero");
                        break;
                    }else{
                        System.out.println("Nos fuimonos ;D!");
                        num++;
                        break;
                    }

            }
        }
    }

}
