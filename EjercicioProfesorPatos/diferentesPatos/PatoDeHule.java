package diferentesPatos;
import Models.Pato;

public class PatoDeHule extends Pato{
    public PatoDeHule() {
        this.establecerComportamientoDeVuelo("sinVuelo");
        this.establecerComportamientoDeGraznido("chillido");
        this.nombre = "Pato de Hule";
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
