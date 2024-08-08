package java_study.exception_handling;

public class Exception_handle_main {
    static int a =0;
    static int b =100;

    public static void main(String args[]){
    	System.out.println("starting of the code");
    	
        try {
        	 int c=b/a;
             System.out.println(c);
        	
        }
        catch(ArithmeticException v) {
        	System.out.println("catch is handled");
        	
        }
        System.out.println("rest of the code");
        
    }
}

