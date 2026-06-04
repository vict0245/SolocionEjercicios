package diferentesPatos;
import Models.Pato;

public class PatoMandarin extends Pato{
    public PatoMandarin() {
        super();
        establecerVuelo("volarConAlas");
        establecerGraznido("chillido");
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