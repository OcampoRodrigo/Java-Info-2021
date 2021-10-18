import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*Realizar un programa que dado un String de entrada en minúsculas 
        lo convierta por completo a mayúsculas.
         Sin uso de métodos o librerías que realicen toUppercase().*/
         Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese un texto en minusculas ");
         String ingresado = scan.nextLine(); 
         scan.close();
         System.out.println(toMayusculas(ingresado));                
    }
    public static String toMayusculas(String caracter) {        
            String result = "";
            char texto = ' ';
            for (int i = 0; i < caracter.length(); i++) {
                if(caracter.charAt(i)>='a'&& caracter.charAt(i) <= 'z'){
                    texto = (char)(caracter.charAt(i) - 32);
                }
                else{
                    texto = (char)(caracter.charAt(i));
                }
                result += texto;
            }
            return result;
        }

        
    }
    

