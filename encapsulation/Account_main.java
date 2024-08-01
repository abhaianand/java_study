package java_study.encapsulation;

public class Account_main {
    public static void main(String[] args){

        Account acc = new Account();
        acc.setAccount_number(100);
        acc.setAmount(5000.1);
        acc.setName("ajith");
        int a = acc.getAccount_number();
        System.out.println(a);
        System.out.println(acc.getAmount());
        System.out.println(acc.getName());
    }
}
