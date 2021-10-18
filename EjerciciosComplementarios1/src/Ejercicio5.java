import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) {
         /*Se desea una aplicación que solicite 2 números enteros
          y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).*/

         Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese un numero entero");
         int numero1 = scan.nextInt();
         System.out.println("Ingrese otro numero entero");
         int numero2 = scan.nextInt();
         scan.close();

         int i = 1;
         int resultado = 0;

         for ( i=1 ; i<=numero1 ; i++){
             resultado += numero2;
         }
         System.out.println(numero1 + " X " + numero2 + " = " +resultado);
         

         
     
    }
    }