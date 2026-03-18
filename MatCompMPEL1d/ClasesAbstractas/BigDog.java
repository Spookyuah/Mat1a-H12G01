package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1d.ClasesAbstractas;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }
    @Override
    public void greets(Dog other) {
        System.out.println("Woooooow");
    }
    public void greets(BigDog other) {
        System.out.println("Wooooooooow");
    }

}
