package java_study;

public class Arrays_two_dimensional_arrays {

    public static void main(String[] args){
        //declare approach1
       /* int a[][] = new int[3][2]; // rows and column

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600; */

        // approach 2

        int b[][] = {{100,200},
                    {300,400},
                    {500,600}
        };

            //find the size of array
         System.out.println("number of row = "+b.length);  // print the length of (number)  the rows in the array
         System.out.println("number of colum = "+b[0].length); // print the number of column in the first row
         System.out.println(b[2][1]); //600 locate the ondex of the matrix
        //read single value from an array  - need two for lop (nested for loop)

        for (int row =0 ; row <=b.length-1; row++ ) //0,1,2    //wehn only after the inner for loop get fasl the outer for loop will start after first step
        {
            for (int column = 0;  column <=b[row].length-1;column++) //0,1
            {
                System.out.print(b[row][column]+" ");
            }
            System.out.println();
        }
    }
}
