package diferentesPatos;
import Models.Pato;

public class PatoMandarin extends Pato{
    public PatoMandarin() {
        this.establecerComportamientoDeVuelo("volarConAlas");
        this.establecerComportamientoDeGraznido("chillido");
        this.nombre = "Pato Mandarin";
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