package java_study.wrapperclass_dataconversion_accessmodifiers;
// string to int,boolean,double,char
// char to string is not possible , because the  string is the collection of char, so we cant assign char collection into a single char
public class Data_conversion {
    public static void main(String args[]){

        String s1 ="10";
        String s2 ="110";
        String s3 ="hai"; // not possible data is not numerical value even if we convert so not possible
        String s4 ="101.1";
        String s5 ="101.2";

        //string to int

        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
        //Integer - is the wrapper class
        //parseInt is the conversion keyword to convert into int

        //string to double
        System.out.println(Double.parseDouble(s4)+Double.parseDouble(s4));

   // int,double,char  to String // String.valueof();

        int a =10;

        System.out.println(String.valueOf(a));
    }
}
