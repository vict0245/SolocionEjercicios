public class Cliente {

    private String nombre;
    private String correo;
    private int puntos;

    public Cliente(String nombre,
                   String correo,
                   int puntos) {

        this.nombre = nombre;
        this.correo = correo;
        this.puntos = puntos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public int obtenerPuntos() {
        return puntos;
    }
}