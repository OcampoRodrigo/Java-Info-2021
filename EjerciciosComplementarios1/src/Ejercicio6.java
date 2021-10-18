import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        /*Se desea una aplicación que solicite 2 números enteros 
        y realice la operación de potencia (sin uso de librerías)
        Ejemplo:3 elevado a 3 = 27*/
        Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese un numero entero(base de la potencia)");
         int numero1 = scan.nextInt();
         System.out.println("Ingrese otro numero entero(exponente de la potencia");
         int numero2 = scan.nextInt();
         scan.close();

         int i = 0;
         int resultado = 1;

         for (i=1 ; i<=numero2 ; i++){
             resultado *= numero1;
         }
         System.out.println(numero1 + " elevado a " + numero2 + " = " + resultado);

        
    }
    
}
