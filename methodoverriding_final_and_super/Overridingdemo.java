package java_study.methodoverriding_final_and_super;
public class Overridingdemo {

}
class Bank{
    double roi(){
        return (0);
    }
}
    class Sbi extends Bank{

       double roi(){  //same method but diff operations
            return(10.5);
        }

    }
class Hdfc extends Bank{

    double roi(){
        return(11.2); //same method but diff operations
    }

}







