package java_study.encapsulation;
public class Account {
    // warpping up of data and method into a single unit(class)
    // all variables should be private
    // for  every variables there should be 2 methods(get and set)
    // variables can operated only through methods
    // "this" always represent class
    private int account_number;
    private String name;
    private double amount;

    void setAccount_number(int account_number) {
        this.account_number = account_number;
        // if we use "this" keyword the program can understand which that mentioned variables is the class variable
    }
    int getAccount_number() {
        return (account_number);
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setAmount(double amount) {
        this.amount = amount;
    }
    double getAmount() {
        return amount;
    }
}

