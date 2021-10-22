import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
        (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
         orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
        Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita 
        hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso*/
        List<Integer> barajaFrancesa = new ArrayList<>(13);
        for (int i=1 ; i<=13 ; i++){
            barajaFrancesa.add(i);
            System.out.println(barajaFrancesa.get(i-1));
                }
        Collections.reverse(barajaFrancesa);
        for (int i=0 ; i<=12 ; i++){
                        System.out.println(barajaFrancesa.get(i));
                }
        Collections.shuffle(barajaFrancesa);
        for (int i=0 ; i<=12 ; i++){
            System.out.println(barajaFrancesa.get(i));
    }


    }
    
}
