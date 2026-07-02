public class Alimento extends Producto {
    private boolean esVegetariano;
    private int calorias;

    public Alimento(String nombre, double precio, boolean disponible, boolean esVegetariano, int calorias) {
        super(nombre, precio, disponible);
        this.esVegetariano = esVegetariano;
        this.calorias = calorias;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Vegetariano: " + (this.esVegetariano ? "Sí" : "No"));
        System.out.println("Calorías: " + this.calorias + " kcal");
    }
}