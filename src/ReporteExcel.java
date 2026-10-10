public class ReporteExcel implements GeneradorReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("=== REPORTE EXCEL ===");
        System.out.println("Generando archivo Excel...");
        System.out.println("| Datos del reporte |");
        System.out.println("| " + contenido + " |");
        System.out.println("Reporte Excel exportado con exito.");
    }
}
