import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ejercicio1{
    public static void main(String[] args) {
        /*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
        luego imprimir por pantalla el ranking*/
        Scanner scan = new Scanner(System.in);
        int ranking = 0;
        List<String> rankingDeCiudades = new ArrayList();
        rankingDeCiudades.add("Bariloche");
        rankingDeCiudades.add("Corrientes");
        rankingDeCiudades.add("Resistencia");
        for (String ciudad : rankingDeCiudades){
            System.out.println("#" + (ranking+=1) + " - " + ciudad);
        }
        

    }

}