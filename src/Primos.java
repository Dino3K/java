
public class Primos {
    public static boolean isPrime(int numero){
        if (numero <= 1 ){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero);i++){
            if(numero % i == 0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        String salida = "";
        int vector [] = new int [20];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100+1);
            System.out.println("|"+vector[i]+"|");
            if (isPrime(vector[i])){
                salida += vector[i]+"|";
            }

        }
        System.out.println("Los primos son: ");
        System.out.println(salida);
    }
}
