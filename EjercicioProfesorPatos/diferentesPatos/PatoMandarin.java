package diferentesPatos;
import Models.Pato;

public class PatoMandarin extends Pato{
    public PatoMandarin() {
        super();
        cv = new comportamientosVuelo.volarConAlas();
        cg = new comportamientosGraznido.mudo();
        nombre = "Pato Mandarin";
    }

    @Override
    public void dibujar() {
        System.out.println("  _^_");
        System.out.println("<(o- )___");
        System.out.println(" ( ._> /");
        System.out.println("  `---'");
        System.out.println("~~~~~~~~~~" + nombre + "~~~~~~~~~~~~");
    }

}
