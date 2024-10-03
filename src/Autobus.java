import java.util.Scanner;
public class Autobus {
    int Npasajeros = 0, TanqCombustible = 0;
    int Capacidad = 27;

    public void recogerP(int uno) {
        if (Capacidad > 0 && Capacidad <= 27 && uno <= 27 && uno > 0) {
            Capacidad -= uno;
            Npasajeros += uno;
        }
        System.out.println("La capacidad es de: " + Capacidad);
        System.out.println("El numero de pasajeros es de: " + Npasajeros);
    }

    public void descargarP(int uno) {
        if (Capacidad > 0 && Capacidad <= 27 && uno <= 27 && uno > 0) {
            Capacidad += uno;
            Npasajeros -= uno;
        }


    }

    public void Arrancar() {
    }

    public void Tanquear(int num) {
        if (TanqCombustible < 100) {
            TanqCombustible += num;
        }
    }
}

