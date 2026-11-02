public class FiguraGeometrica {

    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public void mostrarInformacion() {
        System.out.println("Color: " + color);
    }
}