package diferentesPatos;
import Models.Pato;

public class PatoMallard extends Pato{
    public PatoMallard() {
        this.establecerComportamientoDeVuelo("volarConAlas");
        this.establecerComportamientoDeGraznido("quack");
        this.nombre = "Pato Mallard";
    }

    @Override
    public void dibujar() {
        System.out.println("  __");
        System.out.println("<(o )~~~");
        System.out.println(" ( ._> /´");
        System.out.println("  `---'");
        System.out.println("~~~~~~~~~~" + nombre + "~~~~~~~~~~~~");
    }
}
