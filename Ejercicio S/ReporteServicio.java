public class ReporteServicio {

    public void generarReportePuntos(Cliente cliente) {
        System.out.println(
                "Puntos acumulados: " + cliente.obtenerPuntos());
    }
}
