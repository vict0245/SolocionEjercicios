package diferentesPatos;
import Models.Pato;

public class PatoVendedoraDeRosa extends Pato {
    public PatoVendedoraDeRosa() {
        this.establecerComportamientoDeVuelo("vareta");
        this.establecerComportamientoDeGraznido("mijooo");
        this.nombre = "Pato Vendedora de Rosas";
    }

    @Override
    public void dibujar() {
        System.out.println("             __");
        System.out.println("         .-''  ''-.");
        System.out.println("       .'  _    _  '.");
        System.out.println("      /   (o)  (o)   \\");
        System.out.println("     |                |");
        System.out.println("     |   \\       /   |");
        System.out.println("      \\  '.____.'    /");
        System.out.println("       '.          .'");
        System.out.println("         '-.____.-'");
        System.out.println("            /  \\");
        System.out.println("           /____\\");
        System.out.println("          (______ )");
        System.out.println("~~~~~~~~~~" + nombre + "~~~~~~~~~~~~");
    }
}