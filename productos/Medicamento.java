package productos;

public class Medicamento extends Producto {
    private String viaAdministracion;
    private Posologia posologia;

    public Medicamento(String nombre, String fabricante, String viaAdministracion) {
        super(nombre, fabricante);
        this.viaAdministracion = viaAdministracion;
    }

    public void setPosologia(Posologia posologia) {
        this.posologia = posologia;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre del medicamento = " + nombre);
        System.out.println("Fabricante del medicamento = " + fabricante);
        System.out.println("Vía de administración = " + viaAdministracion);
        if (posologia != null) {
            posologia.imprimir();
        }
    }

    public class Posologia {
        private String usuarios;
        private int dosis;
        private String periodo;
        private String recomendaciones;

        public Posologia(String usuarios, int dosis, String periodo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendaciones = recomendaciones;
        }

        public void imprimir() {
            System.out.println("Usuarios = " + usuarios);
            System.out.println("Dosis = " + dosis);
            System.out.println("Periodo = " + periodo);
            System.out.println("Recomendaciones = " + recomendaciones);
        }
    }
}
