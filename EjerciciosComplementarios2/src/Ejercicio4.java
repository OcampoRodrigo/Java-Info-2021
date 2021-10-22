import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos
         (3 arrayList) e imprimir dichos cursos.
        Ayuda: ArrayList posee un método para particionar en sub-listas?*/
        List<String> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add("Juan");
        listaEstudiantes.add("Sebastian");
        listaEstudiantes.add("Matias");
        listaEstudiantes.add("Pedro");
        listaEstudiantes.add("Martin");
        listaEstudiantes.add("Rodrigo");
        listaEstudiantes.add("Mauricio");
        listaEstudiantes.add("Alberto");
        listaEstudiantes.add("German");
        listaEstudiantes.add("Santiago");
        listaEstudiantes.add("Alejandro");
        listaEstudiantes.add("Agustin");
        System.out.println(listaEstudiantes.size());
      

        List<String> grupoUno = listaEstudiantes.subList(0, 4);
        List<String> grupoDos = listaEstudiantes.subList(4, 8);
        List<String> grupoTres = listaEstudiantes.subList(8, 12);

        System.out.println("Alumnos del curso uno:");
        for ( var estudiante : grupoUno){
            System.out.println(estudiante);
        }
        System.out.println("Alumnos del curso dos:");
        for ( var estudiante : grupoDos){
            System.out.println(estudiante);
        }
        System.out.println("Alumnos del curso tres:");
        for ( var estudiante : grupoTres){
            System.out.println(estudiante);
        }


    }
    
}
