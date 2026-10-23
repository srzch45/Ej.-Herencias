public class Circulo extends Figura {

    // Atributos
    private double radio;

    // Métodos
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Getters
    public double getRadio() {
        return radio;
    }

    // Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

}
