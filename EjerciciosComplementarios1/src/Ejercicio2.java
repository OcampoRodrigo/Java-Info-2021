import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el
        resultado de la suma, resta, multiplicación, división y módulo (resto de la división)
         de ambos números.*/
         Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese un numero entero");
         int primerNumero = scan.nextInt();
         System.out.println("Ingrese otro numero entero");
         int segundoNumero = scan.nextInt();
         scan.close();
         
         int suma = primerNumero + segundoNumero;
         int resta = primerNumero - segundoNumero;
         int multiplicación = primerNumero * segundoNumero;
         int division = primerNumero / segundoNumero;
         int modulo = primerNumero % segundoNumero;
         
         System.out.println("La suma de los numeros ingresados es: "+ primerNumero +"+"+segundoNumero+
          "=" + suma);
         System.out.println("La resta de los numeros ingresados es: "+ primerNumero +"-"+segundoNumero+
          "=" + resta);
          System.out.println("La multiplicacion de los numeros ingresados es: "+ primerNumero 
          + "*" + segundoNumero +"=" + multiplicación); 
          System.out.println("La divison de los numeros ingresados es: "
          + primerNumero +"/" + segundoNumero + "=" + division);
          System.out.println("El modulo(resto de la divison) de los numeros ingresados es: "
          + primerNumero +"%"+ segundoNumero + "=" + modulo);
                
    }
    
}
