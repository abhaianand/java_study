package java_study.exception_handling;
// if we dont know which exception will throw into picture during running we can go for this method

public class Exception_unknown {
    static int a =0;
    static int b =100;

    public static void main(String args[]){
        System.out.println("starting of the code");

        try {
            int c=b/a;
            System.out.println(c);

        }
        catch(Exception v) {
            System.out.println("catch is handled");
            System.out.println(v.getMessage());


        }
        System.out.println("rest of the code");
    }
}
}
