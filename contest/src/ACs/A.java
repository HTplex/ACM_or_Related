package ACs;

import java.util.Scanner;

/**
 * Created by htplex on 4/6/16.
 */
public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int TESKS = in.nextInt();
    for (int i = 0; i < TESKS; i++) {
      int N = in.nextInt();
      int P = in.nextInt();
      int W = in.nextInt();
      int H = in.nextInt();
      int[] a = new int[N];
      for (int j = 0; j < N; j++) {
        a[j] = in.nextInt();
      }
      int Size = 0;
      for (Size = min(W, H); Size > 0; Size--) {
        int Wchar = W / Size;
        int Hchar = H / Size;
        int totalHchar = Hchar * P;
        int counter = 0;
        for (int j = 0; j < N; j++) {
          counter += (int) (Math.ceil((double) (a[j]) / (double) (Wchar)));
          // System.out.println("h: "+counter+" ");
        }
        if (counter <= totalHchar) break;


      }
      System.out.println(Size);
    }
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }
}
