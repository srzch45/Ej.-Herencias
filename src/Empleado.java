public class Empleado {

    // Atributos
    protected String nombre;
    protected String apellidos;
    protected String puesto;

    // Constantes
    public static final double HORAS_TRABAJADAS_DIA = 8;
    public static final double DIAS_TRABAJADOS_SEMANA = 6;
    public static final double SEMANAS_MES = 4; // Por simplicidad, meses de cuatro semanas
    public static final double PAGO_HORA = 5000;

    // Métodos
    // Constructor
    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void trabajar() {
        System.out.println(nombre + " " + apellidos + " trabaja en el puesto de " + puesto);
    }

    // Salario mensual (mes de cuatro semanas)
    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * DIAS_TRABAJADOS_SEMANA * SEMANAS_MES * PAGO_HORA;
    }

}
