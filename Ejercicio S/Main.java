public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente(
                        "Carlos Pérez",
                        "carlos@gmail.com",
                        150);

        CarnetPrinter carnetPrinter = new CarnetPrinter();
        carnetPrinter.imprimirCarnet(cliente);

        CorreoServicio correoServicio = new CorreoServicio();
        correoServicio.enviarCorreoBienvenida(cliente);

        ReporteServicio reporteServicio = new ReporteServicio();
        reporteServicio.generarReportePuntos(cliente);
    }
}