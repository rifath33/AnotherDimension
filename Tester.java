public class Tester{
  public static void main(String[]args){

    // test cases and print statements

    int[][] arr = { {2,4,6}, {8,9,10}, {15,16,19} };

    System.out.println(ArrayOps.arrDeepToString(arr));

    int[][] kut = { {1,2,3}, {45,76,21}, {43,65,12}, {75,1,5}, {2,3,4,5,6}, {7,8,8,10} };

    System.out.println(ArrayOps.arrDeepToString(kut));

  }
}
