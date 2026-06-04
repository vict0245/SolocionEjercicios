package comportamientosVuelo;
import interfaces.comportamientoDeVuelo;

public class volarConAlas implements comportamientoDeVuelo {
    public void volar() {
        System.out.println("¡Estoy volando con mis alas!");
    }

    public void emprenderVuelo() {
        System.out.println("¡Despegando con mis alas!");
        volar();
    }
}
