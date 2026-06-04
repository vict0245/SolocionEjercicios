import diferentesPatos.*;

import Models.Pato;

public class Main {
    public static void main(String[] args) {
        patoo(new PatoMallard());
        esperar(2);
        patoo(new PatoDeHule());
        esperar(2);
        patoo(new PatoDeCasa());
        esperar(2);
        patoo(new PatoMandarin());
        esperar(2);
        patoo(new PatoVendedoraDeRosa());
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void patoo(Pato pato) {
        pato.mostrarNombre();
        System.out.println("------------------------------");
        pato.dibujar();
        System.out.println("------------------------------");
        pato.emprenderVuelo();
        System.out.println("------------------------------");
        pato.nadar();
        System.out.println("------------------------------");
        esperar(2);
        pato.hacerQuack();
        System.out.println("------------------------------\n\n");
    }
}