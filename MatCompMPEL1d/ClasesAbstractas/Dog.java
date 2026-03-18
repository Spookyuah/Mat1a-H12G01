package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.ClasesAbstractas;

import es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c.Mammal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog other) {
        System.out.println("Woooof");
    }

}