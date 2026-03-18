package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}