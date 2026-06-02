public class JefeDeSoporte implements TrabajadorOficina, Gestor, AtencionClientes {
    // Coordina el equipo en la oficina
    @Override
    public void trabajarEnOficina() {
        System.out.println("Jefe de Soporte: Supervisando equipo en oficina");
    }
    
    // Dirige y coordina al equipo de soporte
    @Override
    public void gestionarEquipo() {
        System.out.println("Jefe de Soporte: Asignando tareas y monitoreando desempeño");
    }
    
    // Atiende clientes importantes y problemas críticos
    @Override
    public void atenderClientes() {
        System.out.println("Jefe de Soporte: Resolviendo incidentes críticos con clientes");
    }
}