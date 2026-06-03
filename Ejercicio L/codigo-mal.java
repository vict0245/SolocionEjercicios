// ✅ SOLUCIÓN: Crear una jerarquía correcta que respete Liskov

// 1. Clase base genérica para todas las aves
class Ave {
    protected String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}

// 2. Subclase especializada para aves que vuelan
class AveVoladora extends Ave {
    public AveVoladora(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println(nombre + " está volando alto.");
    }
}

// 3. Subclase correcta que hereda de AveVoladora (cumple el contrato)
class Aguila extends AveVoladora {
    public Aguila(String nombre) {
        super(nombre);
    }
}

// 4. Subclase correcta que hereda de Ave (NO hereda el método volar)
class Pinguino extends Ave {
    public Pinguino(String nombre) {
        super(nombre);
    }

    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}

// cada clase e interfaz deberia de ir en un archivo separado, pero para fines de demostracion y ligeresa los dejare en el mismo archivo