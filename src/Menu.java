import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

    private ArrayList<Producto> productos;

    public Menu() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void mostrarProductos() {
        this.productos.forEach(producto -> {
            producto.mostrarInformacion();
            System.out.println();
        });
    }

    public Producto buscarProductoNombre(String nombre) {
        for (Producto p : this.productos) {
            if (p.getNombre().equals(nombre)) return p;
        }
        return null;
    }

}
