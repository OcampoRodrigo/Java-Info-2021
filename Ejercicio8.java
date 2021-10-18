import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/
Scanner scan = new Scanner(System.in);

System.out.println("Ingrese su nombre y apellido");
String nombre = scan.nextLine();

System.out.println("Ingrese su edad");
String edad = scan.nextLine();

System.out.println("Ingrese su direccion");
String direccion = scan.nextLine();

System.out.println("Ingrese su ciudad");
String ciudad = scan.nextLine();
scan.close();

System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);


}
    
}
