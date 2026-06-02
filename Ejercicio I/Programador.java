public class Programador implements TrabajadorOficina, TrabajadorRemoto, DesarrolladorSoftware {
    // Trabaja de forma presencial en la oficina
    @Override
    public void trabajarEnOficina() {
        System.out.println("Programador: Trabajando en oficina con el equipo");
    }
    
    // Trabaja desde cualquier lugar
    @Override
    public void trabajarRemoto() {
        System.out.println("Programador: Conectado y trabajando desde casa");
    }
    
    // Realiza desarrollo de software
    @Override
    public void escribirCodigo() {
        System.out.println("Programador: Escribiendo código de calidad");
    }
}