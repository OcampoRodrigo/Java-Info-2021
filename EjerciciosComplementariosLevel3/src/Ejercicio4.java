import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
       /*  4.	Se dispone de una lista de Integer, de la cual queremos obtener otra lista 
       aplicando la operación de factorial pero no se desean valores repetidos.
        Input (Entrada) */
    List<Integer> numeros = List.of(1, 2, 4, 4, 4);

    List<Integer> numerosFactorial = numeros.stream()
                                     .map(numero -> factorial(numero))
                                     .distinct()
                                     .collect(Collectors.toList())  ;
    System.out.println(numerosFactorial);                              
    }
    public static Integer factorial(Integer numero) {
        if (numero == 1){
            return 1;
        }else {
            return numero * factorial(numero-1);
        }
    }
    
}
