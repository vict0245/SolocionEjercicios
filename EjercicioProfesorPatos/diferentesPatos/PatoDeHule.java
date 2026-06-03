package diferentesPatos;
import Models.Pato;

public class PatoDeHule extends Pato{
    public PatoDeHule() {
        super();
        cv = new comportamientosVuelo.sinVuelo();
        cg = new comportamientosGraznido.chillido();
        nombre = "Pato de Hule";
    }

    @Override
    public void dibujar() {
        System.out.println("  __");
        System.out.println("<(o )___");
        System.out.println(" ( ._> /");
        System.out.println("  `---'");
        System.out.println("~~~~~~~~~~" + nombre + "~~~~~~~~~~~~");
    }

}
