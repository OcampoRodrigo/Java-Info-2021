import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de 
        la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la 
         misma (antes y después de agregar a en la primera y última posición)*/
         List<Integer> numeros = new ArrayList<>();
         numeros.add(1);
         numeros.add(2);
         numeros.add(3);
         numeros.add(4);
         numeros.add(5);
         numeros.add(0, 0);
         numeros.add(6, 6);
         for ( Integer numero : numeros){
             System.out.println(numero);
                      }
         System.out.println("Tamaño de la lista modificada: " + numeros.size());
         numeros.remove(0);
         numeros.remove(5);
         System.out.println("Tamaño de la lista original : " + numeros.size() );
    }

    
}
