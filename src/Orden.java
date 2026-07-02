import java.util.ArrayList;

public class Orden {
    ArrayList<Producto> listaProductos;

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : listaProductos) {
            producto.mostrarInformacion();
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.getPrecio();
        }
        return total;
    }

    //Método para mostrar cantidad
    public void mostrarCantidadProductos() {
        System.out.println(listaProductos.size());
    }

}