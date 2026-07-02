public class Bebida extends Producto {
    private String tamano; // Small, Medium, Large
    private boolean esFria;

    public Bebida(String nombre, double precio, boolean disponible, String tamano, boolean esFria) {
        super(nombre, precio, disponible);
        this.tamano = tamano;
        this.esFria = esFria;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + this.tamano);
        System.out.println("Temperatura: " + (this.esFria ? "Fría" : "Caliente"));
    }
}
