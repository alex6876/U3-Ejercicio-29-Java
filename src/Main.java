public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo("Rojo", 5);

        Rectangulo rectangulo1 = new Rectangulo("Azul", 10, 5);

        Rectangulo rectangulo2 = new Rectangulo("Verde", 8, 4);

        System.out.println("===== FIGURAS GEOMÉTRICAS =====");

        System.out.println("\n--- CÍRCULO ---");
        circulo.mostrarInformacion();

        System.out.println("\n--- RECTÁNGULO 1 ---");
        rectangulo1.mostrarInformacion();

        System.out.println("\n--- RECTÁNGULO 2 ---");
        rectangulo2.mostrarInformacion();
    }
}