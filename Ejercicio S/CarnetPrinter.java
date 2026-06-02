public class CarnetPrinter {

    public void imprimirCarnet(Cliente cliente) {
        System.out.println("===== CARNET =====");
        System.out.println("Cliente: " + cliente.obtenerNombre());
        System.out.println("==================");
    }
}
