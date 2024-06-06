import productos.*;
import farmacia.*;

public class Main {
    public static void main(String[] args) {
        // Crear la farmacia
        Farmacia farmacia = new Farmacia("Farmacia La Esperanza", "Calle 123, Bogotá, Colombia");

        // Crear un medicamento y asignarle una posología
        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "Oral");
        Medicamento.Posologia posologia = medicamento.new Posologia("Adultos y mayores de 16 años", 500, "6 horas", "No debe tomar este medicamento con el estómago vacío.");
        medicamento.setPosologia(posologia);

        // Crear un suplemento
        Suplemento suplemento = new Suplemento("Vitamina C", "Now Foods", "Vitaminas", 1000);

        // Agregar productos al inventario de la farmacia
        farmacia.agregarProducto(medicamento);
        farmacia.agregarProducto(suplemento);

        // Mostrar el inventario de la farmacia
        farmacia.mostrarInventario();

        // Crear un cliente
        Cliente cliente = new Cliente("Juan Perez", "123456789");

        // El cliente compra un producto
        cliente.comprarProducto(medicamento);
    }
}
