package TEMA_6.NIVEL_1.EJERCICIO_1;

public class NoGenericMethods {
    Coche coche1;
    Coche coche2;
    Coche coche3;

    public NoGenericMethods(Coche coche1, Coche coche2, Coche coche3) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.coche3 = coche3;
    }

    @Override
    public String toString() {
        return "Somos unos coches de la marca " + coche1.getMarca() +
                " el 2 es de la marca.." + coche2.getMarca() +
                " y el coche 3 de la marca: " + coche3.getMarca();
    }
}
