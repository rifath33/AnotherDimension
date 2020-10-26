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

  // sumRows() takes a 2D array of int, and returns a 1D array of int with
  // each element being the sum of the individual rows of the 2D array.

  public static int[] sumRows(int[][] matrix){
    int[]result = new int[matrix.length];
    for(int f = 0; f < matrix.length; f++){
      int sumOfRowI = 0;
      for(int i = 0; i < matrix[f].length; i++){
        sumOfRowI = sumOfRowI + matrix[f][i];
      }
      result[f] = sumOfRowI;
    }
    return result;
  }

  // largestInRows() takes a nonempty 2D array of int, the inner arrays cannot
  // be empty either, and returns a 1D array of int with each element being the
  // largest element of the individual rows  of the 2D array.

  public static int[] largestInRows(int[][] matrix){
    int [] result = new int[matrix.length];
    for(int m = 0; m<matrix.length;m++){
      result[m]=ArrayOps.largest(matrix[m]);
    }
    return result;
  }

  // sum() takes a 2D array of int, and returns the sum of all the
  // individual values in all of the arrays.

  public static int sum(int[][] arr) {
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      result = result + ArrayOps.sumRows(arr)[i];
    }
    return result;
  }

  //////////////////////////////////////////////////////////////////////////////

  // sum of a column

  public static int sumOfAColumn(int[][] matrix, int columnNumber){
    int result = 0;
    for(int i = 0; i<matrix.length; i++){
      result = result + matrix[i][columnNumber];
    }
    return result;
  }

  // sumCols takes a 2D array that must be rectangular
  // (all rows have the same length) and returns a 1D array of int with each
  // element being the sum of the individual columns of the 2D array.

  public static int[] sumCols(int[][] matrix) {
    int[] result = new int[matrix[0].length];
    for(int i = 0; i<matrix[0].length; i++){
      result[i] = ArrayOps.sumOfAColumn(matrix, i);
    }
    return result;
  }


}
