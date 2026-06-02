public class CorreoServicio {

    public void enviarCorreoBienvenida(Cliente cliente) {
        System.out.println(
                "Enviando correo a: " + cliente.obtenerCorreo());
    }
}
