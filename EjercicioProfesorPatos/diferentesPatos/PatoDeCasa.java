package diferentesPatos;
import Models.Pato;

public class PatoDeCasa extends Pato{
    public PatoDeCasa() {
        this.establecerComportamientoDeVuelo("sinVuelo");
        this.establecerComportamientoDeGraznido("mudo");
        this.nombre = "Pato de Casa";
    }

    @Override
    public void dibujar() {
        System.out.println("  __");
        System.out.println("<(O> )___");
        System.out.println(" ( ._>- /");
        System.out.println("  `---'");
        System.out.println("~~~~~~~~~~" + nombre + "~~~~~~~~~~~~");
    }

}
