
/*we have to do

A
B B
C C C
D D D D
E E E E E

*/



public class pattern3
 {

  public static void main(String[] args) {
    char last = 'E', alphabet = 'A';

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
      }
      ++alphabet;

      System.out.println();
    }
  }
}