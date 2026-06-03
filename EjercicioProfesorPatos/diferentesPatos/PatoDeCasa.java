package diferentesPatos;
import Models.Pato;

public class PatoDeCasa extends Pato{
    public PatoDeCasa() {
        super();
        cv = new comportamientosVuelo.volarConAlas();
        cg = new comportamientosGraznido.quakear();
        nombre = "Pato de Casa";
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
