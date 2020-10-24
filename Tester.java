public class Tester{
  public static void main(String[]args){

    // test cases and print statements

    /*
    int[][] arr = { {2,4,6}, {8,9,10}, {15,16,19} };

    System.out.println(ArrayOps.arrDeepToString(arr));

    int[][] kut = { {1,2,3}, {45,76,21}, {43,65,12}, {75,1,5}, {2,3,4,5,6}, {7,8,8,10} };

    System.out.println(ArrayOps.arrDeepToString(kut));
    */

    /*
    create2DArray(6,2,3) could return the 2D array:  (6 rows, 2 columns, values from 0-3)
    {{2, 0}, {1, 3}, {2, 1}, {3, 2}, {2, 1}, {1, 0}}
    */

    System.out.println(ArrayOps.arrDeepToString(ArrayOps.create2DArray(6,2,3)));

    // random num between 0 and 5 exclusive

    double lol = Math.random()*5;
    System.out.println((int)(Math.round( lol * 10.0) / 10));

  }
}
