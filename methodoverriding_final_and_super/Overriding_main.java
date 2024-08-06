package java_study.methodoverriding_final_and_super;

public class Overriding_main {
    public static void main(String args[])
    {
        Sbi obj1 = new Sbi();
        Hdfc obj2 = new Hdfc();

        System.out.println(obj1.roi());
        System.out.println(obj2.roi());
    }
}
