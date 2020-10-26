import java.util.Arrays;

public class Tester{
  public static void main(String[]args){

    int[][] kutha = { {1,2,3}, {7,8,9}, {2,3} };

    System.out.println(
    Arrays.toString
    (
    ArrayOps.sumRows(kutha)
    )
    );

  }
}
