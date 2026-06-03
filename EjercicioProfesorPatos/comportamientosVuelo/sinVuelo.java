package comportamientosVuelo;
public class sinVuelo implements interfaces.comportamientoVuelo {
    public void volar() {
        System.out.println("No puedo volar.");
    }

    public void emprenderVuelo() {
        System.out.println("No puedo despegar, no tengo alas.");
        volar();
    }
}
