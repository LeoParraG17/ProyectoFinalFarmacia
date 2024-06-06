package productos;

public class Suplemento extends Producto implements Calculable {
    private String tipo;
    private int dosis;

    public Suplemento(String nombre, String fabricante, String tipo, int dosis) {
        super(nombre, fabricante);
        this.tipo = tipo;
        this.dosis = dosis;
    }

    @Override
    public int calcularDosis() {
        return dosis;
    }

    @Override
    public String recomendar() {
        return "Recomendación de suplemento: " + nombre + " - " + tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre del suplemento = " + nombre);
        System.out.println("Fabricante del suplemento = " + fabricante);
        System.out.println("Tipo = " + tipo);
        System.out.println("Dosis = " + dosis + " mg");
    }
}
