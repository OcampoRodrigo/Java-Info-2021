import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
     /*    5.	Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y 
        fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea generar un 
        Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
        (con separador de espacio en blanco) y el value la edad del alumno.
        ●	La lista de entrada debe estar cargada con varios alumnos (al menos 5) 
        para subir el ejemplo y demostrar su funcionamiento.
        ●	En ejemplo se muestra solo con 1 Alumno a modo de abreviar
        ●	En el ejemplo también se usa LocalDate.now().minusYears(30),
         en el ejercicio a presentar se deberá usar otra tecnica de construcción
          para la fecha (no usar .now(). Pueden ver métodos .parse(), etc) */
    List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.parse("1980-10-11")),
                           new Alumno("Bart", "Simpson" ,LocalDate.parse("1990-11-04")),
                           new Alumno("Lisa", "Simpson" ,LocalDate.parse("1995-12-07")),
                           new Alumno("Maggie", "Simpson" ,LocalDate.parse("2000-04-08")),
                           new Alumno("Marge", "Simpson" ,LocalDate.parse("1985-01-07")));
    Map<String,Integer> listaNombreEdad = alumnos.stream()
                                          .collect(Collectors.toMap(alumno -> construirClave(alumno)
                                          , alumno -> calcularEdad(alumno)));
    System.out.println(listaNombreEdad);
     }
    public static String construirClave(Alumno alumno){
        return alumno.getApellido().concat("").concat(alumno.getNombre());
    }
    public static Integer calcularEdad(Alumno alumno){
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }
}
