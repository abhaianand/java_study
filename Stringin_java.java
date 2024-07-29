package java_study;

public class Stringin_java {

    public static void main (String[] args){
        String s = "welcome";      //approach 1
        String a = new String("test");
        String c = "demo";

        System.out.println(s);
        System.out.println(a);

        //methods() - 1
        //length - means number of things
        System.out.println(s.length());
        System.out.println("haii".length());

        //methods - 2
        //concat() -  joining strings
        System.out.println(a+s);
        System.out.println(s.concat(a));
        System.out.println(a+s+c);
        System.out.println(s.concat(a).concat(c)); //concat - add more than two values

        //method - 3
        //contains()
        System.out.println(s.contains("wel")); //true
        System.out.println(s.contains("Wel")); //flase - w is capital


    }
}
