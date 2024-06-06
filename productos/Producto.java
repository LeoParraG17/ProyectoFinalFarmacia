package productos;

public abstract class Producto {
    protected String nombre;
    protected String fabricante;

    public Producto(String nombre, String fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public abstract void imprimir();
}
