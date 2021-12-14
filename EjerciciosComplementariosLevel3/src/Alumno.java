import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    public Alumno(){ }
     public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    @Override
    public String toString() {
        return "Alumno [apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", nombre=" + nombre + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
}
