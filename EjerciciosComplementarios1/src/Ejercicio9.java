import java.util.Scanner;

public class ej99 {
    public static void main(String[]arg){
        /*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que 
        aparece una letra dada.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase o texto: ");
        String texto = scan.nextLine();
        
        System.out.println("Ingrese el caracter a contar");
        String caracter = scan.nextLine();

        System.out.println("La cantidad de " + " '" + caracter + "'"+ " en el texto es: ");
        System.out.println(texto.split(caracter, -1).length-1);
    }

}