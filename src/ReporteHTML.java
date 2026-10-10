public class ReporteHTML implements GeneradorReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("=== REPORTE HTML ===");
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Reporte</h1>");
        System.out.println("<p>" + contenido + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
        System.out.println("Reporte HTML exportado con exito.");
    }
}
