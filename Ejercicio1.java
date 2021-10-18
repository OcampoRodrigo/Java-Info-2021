import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String usuario = scan.nextLine();
        scan.close();
        System.out.println("HOLA " + usuario);
            }
}