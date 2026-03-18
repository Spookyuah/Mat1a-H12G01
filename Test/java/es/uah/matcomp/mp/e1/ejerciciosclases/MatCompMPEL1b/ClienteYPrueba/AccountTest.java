package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1b.ClienteYPrueba;

class AccountTest {
    public static void main(String[] args){
        //Test Customer
        Customer c1 = new Customer(77, "Jonathan", 'm');
        System.out.println(c1);
        System.out.println("Name:"+c1.getName());
        System.out.println("Id:"+c1.getId());
        System.out.println("Gender:"+c1.getGender());
        //Test Account
        Account a1 = new Account(34, c1);
        System.out.println(a1);
        Account a2 = new Account(34, c1, 999);
        System.out.println(a2);
        a2.setBalance(505);
        System.out.println(a2);
        a2.deposit(50.559);
        System.out.println(a2); // .559 rounds to .56
        a2.withdraw(1234);
        a2.withdraw(777);
        System.out.println(a2);
        System.out.println("Account id:"+a2.getId());
        System.out.println("Account balance:"+a2.getBalance());
        System.out.println("Account customer:"+a2.getCustomer());
        System.out.println("Account customer name:"+a2.getCustomerName());
        System.out.println("Account customer id:"+a2.getCustomer().getId());
        System.out.println("Account customer gender:"+a2.getCustomer().getGender());
    }
}