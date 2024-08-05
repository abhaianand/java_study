package java_study.inheritance;

 public class Mutliple {

     public static void main(String args[]){

         Child obj = new Child();
         obj.method3();
     }
 }

     class parent1 {

    void method1(){
        System.out.println("parent1");
        }

}

class parent2 {

    void method2(){
        System.out.println("parent2");
    }

}

class Child extends parent1,parent2{  // we can not extend multiple class by extend only one class we can extend
     //multiple inheritance can only achieve by Interface approach

    void method3(){
        System.out.println("child");
    }

}


