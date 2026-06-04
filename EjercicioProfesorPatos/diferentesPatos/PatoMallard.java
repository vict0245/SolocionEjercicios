package diferentesPatos;
import Models.Pato;

public class PatoMallard extends Pato{
    public PatoMallard() {
        super();
        establecerVuelo("volarConAlas");
        establecerGraznido("quack");
        nombre = "Pato Mallard";
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
