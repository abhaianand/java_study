package java_study.static_keyword;
import static java_study.static_keyword.Static_Keywords.b;
import static java_study.static_keyword.Static_Keywords.metthod2;
public class Static_keyword_main {
    //static keyword can use for both methods and variables
    // if upu make a variable as static it will be common for all objects
    // aslo if the value of the variable is chang in any of the object it will reflect every where
    // when we use static keyword - if the variable and method are common for all use static variables or method
    public static void main(String[] args){
        // static methods can directly call static variables and static methods without creating any object
        metthod2();
        System.out.println(b);
        //  non static keyword if you want to call inside any static method you have to create obj of the class
        Static_Keywords obj = new  Static_Keywords();
        System.out.println(obj.a);
        obj.method1();
        obj.nonstatic_method();
    }
}
