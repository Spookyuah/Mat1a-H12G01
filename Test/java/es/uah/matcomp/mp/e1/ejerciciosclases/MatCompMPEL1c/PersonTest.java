package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class PersonTest {
    public static void main(String[] args){
        Person p1= new Person("Joseph", "Great Britain");
        System.out.println(p1);
        p1.setAddress("New York");
        System.out.println("Name:"+p1.getName());
        System.out.println("Address:"+p1.getAddress());
    }
}