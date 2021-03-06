package lab;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int mod = 10000;
    int n = in.nextInt();
    //for(int i=1;i<n;i++)
    System.out.println(getFeb(n, mod) % mod);
  }

  public static long getFeb(int a, int mod) {
    if (a == 1) return 1;//F(n+1)*F(n)+F(n)*(F(n+1)-F(n))
    if (a == 2) return 1;
    long m = getFeb(a / 2, mod);
    long n = getFeb(a / 2 + 1, mod);
    if (a % 2 != 0) return (m * m % mod + n * n % mod) % mod;
    if (a % 2 == 0) return (m * (2 * n - m + mod)) % mod;
    return 0;
  }
}
