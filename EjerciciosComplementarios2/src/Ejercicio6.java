import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*Se dispone de una colección de Empleados, de cada empleado se conoce:
        -Nombre y Apellido         -DNI
        -horasTrabajadas        -valorPorHora
        Todos los empleados están cargados en un Set (HashSet), se desea calcular el 
        sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar 
        en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es 
        el sueldo calculado. */
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer,Integer> dniSueldo = new HashMap<>();
        Empleado empleado1 = new Empleado("Juan", 123, 20, 300);
        Empleado empleado2 = new Empleado("Ramiro", 456, 10, 500);
        Empleado empleado3 = new Empleado("Ruben", 789, 30 , 175);
        empleados.add(empleado1);
        System.out.println(empleado1.obtenerDNI());
        empleados.add(empleado2);
        empleados.add(empleado3);
        for ( Empleado empleado : empleados){
            System.out.println(empleado);
            dniSueldo.put(empleado.obtenerDNI(),empleado.sueldo());
                   }
                   System.out.println("Su {DNI=Sueldo} es " +dniSueldo);
                    }
               }
        class Empleado {
            String nombre; int DNI ; int horasTrabajadas ;int valorPorHora ;
            public Empleado (String nombre , int DNI , int horasTrabajadas , int valorPorHora ){
                this.nombre = nombre; this.DNI=DNI ; this.horasTrabajadas=horasTrabajadas ;
                this.valorPorHora = valorPorHora ;}
                public String toString(){
                    return this.nombre + " Dni: " + this.DNI + " horas trabajadas: " + this.horasTrabajadas
                     + " valor por hora: " + this.valorPorHora;
                }
                public int sueldo(){
                    return this.valorPorHora*this.horasTrabajadas;
                }
                public int obtenerDNI(){
                    return this.DNI;
                }
            }


        