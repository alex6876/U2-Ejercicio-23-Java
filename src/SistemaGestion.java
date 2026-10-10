public class SistemaGestion {

    private GeneradorReporte generador;

    public SistemaGestion(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void procesarReporte(String contenido) {
        generador.exportar(contenido);
    }

    public void cambiarGenerador(GeneradorReporte generador) {
        this.generador = generador;
    }
}
