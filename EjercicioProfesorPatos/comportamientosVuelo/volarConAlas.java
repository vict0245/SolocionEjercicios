package comportamientosVuelo;
import interfaces.comportamientoVuelo;

public class volarConAlas implements comportamientoVuelo {
    public void volar() {
        System.out.println("¡Estoy volando con mis alas!");
    }

    public void emprenderVuelo() {
        System.out.println("¡Despegando con mis alas!");
        volar();
    }
}
