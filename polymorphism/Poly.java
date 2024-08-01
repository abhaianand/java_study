package java_study.polymorphism;

public class Poly {
    // method overloading
    // 1) method name should be same
    //2) number of parameter should be diffrernt
    //3) data type should be different
    //4) oreder of parameter should be different
    // 5) variable name not consider as a change
    int a = 100;
    int b =2;
    void overloading (){
        System.out.println(a+b); //1
    }
    void overloading(int x,int y){
        System.out.println(x+y); //2
    }
    void overloading(int x,double y){
        System.out.println(x+y); //3
    }
    void overloading(double x,int y){
        System.out.println(x+y); //4
    }
    void overloading(int x,double y,int z){
        System.out.println(x+y+z); //5
    }
}
// return type not consider