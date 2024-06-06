package farmacia;

import productos.Producto;

public class Cliente {
    private String nombre;
    private String cedula;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void comprarProducto(Producto producto) {
        System.out.println(nombre + " ha comprado el producto: ");
        producto.imprimir();
    }
}
