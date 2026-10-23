public class EmpleadoRH extends Empleado {

    // Métodos
    // Constructor
    public EmpleadoRH(String nombre, String apellidos) {
        super(nombre, apellidos, "Recursos Humanos");
    }

    // Recibe un Empleado como parámetro y lo contrata
    public void contratarEmpleado(Empleado empleado) {
        System.out.println(nombre + " " + apellidos + " (RH) contrató a "
                + empleado.getNombre() + " " + empleado.getApellidos()
                + " como " + empleado.getPuesto());
    }

}
