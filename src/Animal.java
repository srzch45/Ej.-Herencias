public class Animal {

    // Atributos
    protected String nombre;
    protected String especie;
    protected double peso;

    // Métodos
    // Constructor
    public Animal(String nombre, String especie, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
    }

    public void hacerSonido() {
        System.out.println("El animal hace sonido");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEspecie: " + especie + "\nPeso: " + peso + "\n";
    }

}
