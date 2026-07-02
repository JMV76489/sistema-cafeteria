public class Producto {
    private String nombre;
    private double precio;
    private boolean disponible;

    // Constructor
    public Producto(String nombre, double precio, boolean disponible){
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    // Metodo-Función mostrarInformación
    public void mostrarInformacion(){
        System.out.println("Producto: " + nombre);
        System.out.println("Precio Base: $" + precio);
        System.out.println("Disponibilidad: " + (disponible ? "Disponible" : "Agotado"));
    }

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}// clase Producto
