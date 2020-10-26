import java.util.Arrays;

public class Tester{
  public static void main(String[]args){

    int[][]  A = { {  1,  0, 12, -10 },
                   {  7, -2,  2,  1 },
                   { -5, -2,  2, -9 }
               };
    int[][]  B  =  { {  1, 3, 5 },
                      { 3,1,-1 }
                  };

    //System.out.println(
    //ArrayOps.isLocationMagic(A, 0, 0)
    //);

    int[][]E = {
    {  2,  4, 2 },
    {  2, 2, 2 } };

    System.out.println(ArrayOps.isLocationMagic(E, 0, 1)); // false 2 + 4 + 2  !=  4 + 2
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1)); // true  2 + 2 + 2 == 4 + 2

  }
}
