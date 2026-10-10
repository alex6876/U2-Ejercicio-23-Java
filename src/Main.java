
public class Main {

    public static void main(String[] args) {

        String datos = "Ventas: $150000, Clientes: 25, Productos: 80";

        // Exportar a PDF
        ReportePDF pdf = new ReportePDF();
        SistemaGestion sistema = new SistemaGestion(pdf);

        sistema.procesarReporte(datos);

        System.out.println();

        // Cambiar a Excel
        ReporteExcel excel = new ReporteExcel();
        sistema.cambiarGenerador(excel);

        sistema.procesarReporte(datos);

        System.out.println();

        // Cambiar a HTML
        ReporteHTML html = new ReporteHTML();
        sistema.cambiarGenerador(html);

        sistema.procesarReporte(datos);
    }
}
