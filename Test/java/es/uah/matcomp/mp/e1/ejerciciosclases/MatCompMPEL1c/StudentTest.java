package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1c;

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Jotaro", "Japan", "Marine biology", 3, 1440.0);
        System.out.println(s1);
        s1.setAddress("EEUU");
        s1.setFee(56000.0);
        s1.setProgram("Doctorate");
        s1.setYear(6);
        System.out.println("Name:"+s1.getName());
        System.out.println("New address:"+s1.getAddress());
        System.out.println("New fee:"+s1.getFee());
        System.out.println("Program:"+s1.getProgram());
        System.out.println("Year:"+s1.getYear());
    }
}