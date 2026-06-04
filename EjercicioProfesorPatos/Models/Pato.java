package Models;
import interfaces.comportamientoDeVuelo;
import interfaces.comportamientoDeGraznido;
import comportamientosVuelo.volarConAlas;
import comportamientosVuelo.sinVuelo;
import comportamientosVuelo.vareta;
import comportamientosGraznido.quakear;
import comportamientosGraznido.chillido;
import comportamientosGraznido.mudo;
import comportamientosGraznido.mijooo;
import java.util.HashMap;
import java.util.Map;

public abstract class Pato {

    protected comportamientoDeVuelo tipoVuelo;
    protected comportamientoDeGraznido tipoGraznido;
    protected String nombre;

    private static final Map<String, comportamientoDeVuelo> comportamientoVuelo = new HashMap<>();
    private static final Map<String, comportamientoDeGraznido> comportamientoGraznido = new HashMap<>();

    static {
        comportamientoVuelo.put("volarConAlas", new volarConAlas());
        comportamientoVuelo.put("sinVuelo", new sinVuelo());
        comportamientoVuelo.put("vareta", new vareta()); // Reutilizando volarConAlas para "vareta"

        comportamientoGraznido.put("quack", new quakear());
        comportamientoGraznido.put("chillido", new chillido());
        comportamientoGraznido.put("mudo", new mudo());
        comportamientoGraznido.put("mijooo", new mijooo());
    }

    public void hacerQuack(){
        tipoGraznido.quak();
    }

    public void nadar(){
        System.out.println("PATO NADANDO...");
    }

    public void dibujar(){
        System.out.println("Desenhando um pato...");
    }

    public void volar(){
        tipoVuelo.volar();
    }

    public void emprenderVuelo(){
        tipoVuelo.emprenderVuelo();
    }

    protected void establecerComportamientoDeVuelo(String cv){  
        this.tipoVuelo = comportamientoVuelo.get(cv);
    }

    protected void establecerComportamientoDeGraznido(String cg){
        this.tipoGraznido = comportamientoGraznido.get(cg);
    }

    public void mostrarNombre(){
        System.out.println("SOY UN PATO: " + nombre);
    }

}