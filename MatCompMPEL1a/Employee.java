package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1a;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int newSalary){
        this.salary=newSalary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary+salary*percent;
    }
    public String toString(){
        return "Employee[ID="+id+", Name="+firstName+" "+lastName+", salary=" + salary+"]";
    }
}
