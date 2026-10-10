public class ReportePDF implements GeneradorReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("=== REPORTE PDF ===");
        System.out.println("Generando archivo PDF...");
        System.out.println("Contenido: " + contenido);
        System.out.println("Reporte PDF exportado con exito.");
    }
}
