public class Main {

    public static void main(String[] args) {

        // Ejercicio 1: Animales
        System.out.println("=== Ejercicio 1: Animales ===");
        Animal perro = new Animal("Perro", "Canis lupus familiaris", 20.5);
        Gato gato = new Gato("Siamés");
        perro.hacerSonido();
        gato.hacerSonido();
        System.out.println();

        // Ejercicio 2: Figuras
        System.out.println("=== Ejercicio 2: Figuras ===");
        Figura figura = new Figura();
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Figura -> Área: " + figura.calcularArea() + " | Perímetro: " + figura.calcularPerimetro());
        System.out.println("Círculo -> Área: " + circulo.calcularArea() + " | Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Rectángulo -> Área: " + rectangulo.calcularArea() + " | Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println();

        // Ejercicio 3: Empleados
        System.out.println("=== Ejercicio 3: Empleados ===");
        Empleado ana = new Empleado("Ana", "Mora", "Desarrolladora");
        EmpleadoRH luis = new EmpleadoRH("Luis", "Vargas");
        Empleado carlos = new Empleado("Carlos", "Rojas", "Analista");
        luis.contratarEmpleado(carlos);
        ana.trabajar();
        luis.trabajar();
        carlos.trabajar();
        System.out.println("Salario mensual de Ana: ₡" + ana.calcularSalario());
        System.out.println();

        // Ejercicio 4: Cuentas
        System.out.println("=== Ejercicio 4: Cuentas ===");
        Cuenta cuenta = new Cuenta("Santiago", 500);
        CuentaAhorros ahorros = new CuentaAhorros("Santiago", 500);
        System.out.println("-- Cuenta --");
        cuenta.depositar(100);
        cuenta.retirar(550);
        cuenta.retirar(200);
        System.out.println("-- Cuenta de ahorros --");
        ahorros.depositar(100);
        ahorros.retirar(450);  // Deja 150, permitido
        ahorros.retirar(100);  // Dejaría 50, rechazado
        ahorros.retirar(50);   // Deja exactamente 100, permitido
        System.out.println("Saldo final: $" + ahorros.getSaldo());
    }
}
