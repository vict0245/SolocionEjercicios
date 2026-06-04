package Models;
import interfaces.comportamientoVuelo;
import interfaces.comportamientoGraznido;
import java.util.HashMap;
import java.util.Map;

public abstract class Pato {

    private comportamientoVuelo cv;
    private comportamientoGraznido cg;
    protected comportamientoVuelo tipoVuelo;
    protected comportamientoGraznido tipoGraznido;
    protected String nombre;

    private static final Map<String, comportamientoVuelo> comportamientosVuelo = new HashMap<>();
    private static final Map<String, comportamientoGraznido> comportamientosGraznido = new HashMap<>();

    static {
        comportamientosVuelo.put("volarConAlas", new comportamientosVuelo.volarConAlas());
        comportamientosVuelo.put("sinVuelo", new comportamientosVuelo.sinVuelo());

        comportamientosGraznido.put("quack", new comportamientosGraznido.quakear());
        comportamientosGraznido.put("chillido", new comportamientosGraznido.chillido());
        comportamientosGraznido.put("mudo", new comportamientosGraznido.mudo());
    }

    public void hacerQuack(){
        cg.quak();
    }

    public void nadar(){
        System.out.println("PATO NADANDO...");
    }

    public void dibujar(){
        System.out.println("Desenhando um pato...");
    }

    public void volar(){
        cv.volar();
    }

    public void emprenderVuelo(){
        cv.emprenderVuelo();
    }

    protected void establecerVuelo(String cv){
        this.cv = comportamientosVuelo.get(cv);
    }

    protected void establecerGraznido(String cg){
        this.cg = comportamientosGraznido.get(cg);
    }

    public void mostrarNombre(){
        System.out.println("SOY UN PATO: " + nombre);
    }
}