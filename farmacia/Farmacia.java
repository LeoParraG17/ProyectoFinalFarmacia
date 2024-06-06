package farmacia;

import productos.Producto;
import java.util.ArrayList;

public class Farmacia {
    private String nombre;
    private String direccion;
    private Inventario inventario;

    public Farmacia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario();
    }

    public void agregarProducto(Producto producto) {
        inventario.agregarProducto(producto);
    }

    public void mostrarInventario() {
        inventario.mostrarProductos();
    }
}
