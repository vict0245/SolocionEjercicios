package Models;
import interfaces.comportamientoVuelo;
import interfaces.comportamientoGraznido;

public abstract class Pato {

    protected comportamientoVuelo cv;
    protected comportamientoGraznido cg;
    protected String nombre;
    
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

    public void establecerVuelo(comportamientoVuelo cv){
        this.cv = cv;
    }

    public void establecerGraznido(comportamientoGraznido cg){
        this.cg = cg;
    }

    public void mostrarNombre(){
        System.out.println("SOY UN PATO: " + nombre);
    }
}