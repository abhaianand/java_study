package java_study.polymorphism;

public class Poly_main {
    public static void main(String[] args){


        Poly obj =  new Poly();
        obj.overloading(); //1
        obj.overloading(10,12); //2
        obj.overloading(20,10.5); //3
        obj.overloading(11.5,30); //4
        obj.overloading(11,30.3,12); //5
    }
}
