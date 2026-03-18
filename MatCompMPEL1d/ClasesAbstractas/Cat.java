package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.ClasesAbstractas;

import es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c.Mammal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}