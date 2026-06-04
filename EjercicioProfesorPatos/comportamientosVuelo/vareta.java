package comportamientosVuelo;
import interfaces.comportamientoDeVuelo;

public class vareta implements comportamientoDeVuelo {
    public void volar() {
        System.out.println("¡Estoy volando en neptuno con mi varetita mágica!");
    }

    public void emprenderVuelo() {
        System.out.println("Prendiendo la varetita!!");
        volar();
    }
}