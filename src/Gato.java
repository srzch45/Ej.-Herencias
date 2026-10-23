public class Gato extends Animal {

    // Atributos
    protected String raza;

    // Métodos
    // Constructor
    public Gato(String raza) {
        super("Gato", "Felis catus", 6.0);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato hace miau");
    }

    // Getters
    public String getRaza() {
        return raza;
    }

    // Setters
    public void setRaza(String raza) {
        this.raza = raza;
    }

}
