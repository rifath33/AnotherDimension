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

}


// code that doesn't do what we want... ugh
/*
    for(int f = 0; f < arr.length; f++){

      for(int i=0; i < arr[f].length; i++){

        if( (i == arr[f].length - 1) && (f == arr.length - 1) )
        result = result + arr[f][i];
        else result = result + arr[f][i] + ", ";

        }

      }
*/
