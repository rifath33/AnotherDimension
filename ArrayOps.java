public class ArrayOps{

  /*
  public static int sum(int[] arr)
  public static  int largest(int[]arr)
  public static int[] sumRows(int[][] matrix)
  public static  int[] largestInRows(int[][] matrix)
  public static  int sum(int[][] arr)
  public static int[] sumCols(int[][] matrix)
  public static boolean isRowMagic(int[][] matrix)
  public static boolean isColMagic(int[][] matrix)
  public static boolean isLocationMagic(int[][] matrix, int row, int col)
  */

  // sum() takes an array of int, and returns a sum of the individual
  // values in the array.

  public static int sum(int[] arr){
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      result = result + arr[i];
    }
    return result;
  }

  // largest() takes a non-empty array of int, and returns the largest
  // element of the array.

  public static int largest(int[] arr){
    int result = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > result)
      result = arr[i];
    }
    return result;
  }

}
