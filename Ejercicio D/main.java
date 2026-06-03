// Clase principal que RECIBE la dependencia, no la crea
public class main {
    private Persona persona;

    // ✅ Inyección de dependencias: recibe la abstracción como parámetro
    public main(Persona persona) {
        this.persona = persona;
    }

    public void mostrarDeuda() {
        System.out.println("La deuda de " + persona.getNombre() + " es: " + persona.deuda());
    }

    public static void main(String[] args) {
        // ✅ La instanciación ocurre en el punto de entrada (composition root)
        // Aquí podría venir de un contenedor o factory
        Persona persona = new Carlos();
        main app = new main(persona);
        app.mostrarDeuda();
    }
}