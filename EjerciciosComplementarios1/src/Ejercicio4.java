import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scan.nextInt();
        scan.close();
        int factorial = 1;
        int indice ;
        
        for (indice=1; indice<=numero; indice++){
            factorial *= indice;         
                     }
        System.out.println("El factorial de " + numero + " es " + factorial);



    }
    
}
