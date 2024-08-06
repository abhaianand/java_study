package java_study.methodoverriding_final_and_super;



public class Overriding_with_overloading {

//method overriding
    //1) possible only in multiple class(inheritance
    // 2) we should not change rhe signature , only method body change
    //3)belongs to inheritance
 // overloading
 //1) single and multiple cass
 //change signature not the body
 //3)belongs to polymorphism
}
class ABC{
    int a =100;
    int b =100;
   void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }

}
class Xyz extends ABC{
    int c = 300;
    void m1(int a){
        System.out.println(a*a); //overriding same method from parent but different in implementation
    }
    void m2(int b,int c){ //overloading , different parameters
        System.out.println(b*c);
    }
}
