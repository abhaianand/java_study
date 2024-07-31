package java_study.methods_constructor.methods;

public class GreethingsMain {


    public static void main(String[] args){

        Greetings gr = new Greetings();
        gr.method1(); // 1) no params no return
         String s1 = gr.method2(); // 2) no params  have return values - so if the method return any value it should be store in a variable
        System.out.println(s1);
        gr.method3("ajith"); // 3) take params but no return
                                  // method dont have any return value so no variable assign
        String s2 = gr.method4("parameter pass from object in current class");
        System.out.println(s2); // 4) take params and  return values
    }
}
