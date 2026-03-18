package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class AnimalsTest {
    public static void main(String[] args) {

        Animal a1 = new Animal("Generic animal");
        System.out.println(a1);

        Mammal m1 = new Mammal("Generic mammal");
        System.out.println(m1);

        Cat c1 = new Cat("Stray cat");
        System.out.println(c1);
        c1.greets();

        Dog d1 = new Dog("Danny");
        System.out.println(d1);
        d1.greets();

        Dog d2 = new Dog("Bond");
        d1.greets(d2);
    }
}
