package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class StaffTest {
    public static void main(String[] args){
        Staff t1= new Staff("Pucci","EEUU","Green dolphin street", 1540.0);
        System.out.println(t1);
        t1.setSchool("Heaven");
        t1.setPay(99999.99);
        t1.setAddress("New universe");
        System.out.println("Name:"+t1.getName());
        System.out.println("Address:"+t1.getAddress());
        System.out.println("School:"+t1.getSchool());
        System.out.println("Pay:"+t1.getPay());
    }
}