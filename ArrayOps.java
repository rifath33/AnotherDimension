public class ArrayOps{

  public static String arrToString(int[] arr){

    String addedArray = "";
    String result = "";

    for(int i=0; i < arr.length; i++){

      if(i != arr.length - 1)
      result = result + arr[i] + ", ";

      if(i == arr.length - 1)
      result = result + arr[i];

    }

    addedArray = "{" + result + "}";

    return addedArray;

  }

  public static String arrDeepToString(int[][] arr) {

    String result = "";

    for(int f = 0; f < arr.length; f++){

      if(f != arr.length-1)
      result = result + ArrayOps.arrToString(arr[f]) + ", ";

      if(f == arr.length-1)
      result = result + ArrayOps.arrToString(arr[f]);

    }

    return "{" + result + "}";

    }

  public static int[][] create2DArray(int rows, int cols, int maxValue){

  /*
  create2DArray(6,2,3) could return the 2D array:  (6 rows, 2 columns, values from 0-3)
  {{2, 0}, {1, 3}, {2, 1}, {3, 2}, {2, 1}, {1, 0}}
  */

    int[][]x = new int[rows][cols];

    return x;

  }

}
