//package ACs;
//
//import java.util.Scanner;
//
///**
// * Created by htplex on 4/6/16.
// */
//public class C {
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int N = in.nextInt();
//    int M = in.nextInt();
//    boolean[][] map = new boolean[N][M];
//    for (int i = 0; i < N; i++) {
//      String s = in.next();
//      for (int j = 0; j < M; j++) {
//        map[i][j] = s.charAt(j) == '.';
//      }
//    }
//    for (int i = 0; i < N; i++) {
//      for (int j = 0; j < M; j++) {
//        System.out.print(map[i][j] + " ");
//      }
//      System.out.println();
//    }
//    int[][][] dp = new int[N][M][2];
//    dp[0][0][0] = map[0][0] ? 0 : 1;
//    dp[0][0][1] = map[0][0] ? 0 : 1;
//
//    for (int i = 1; i < M - 1; i++) {
//      dp[0][i][0] = dp[0][i - 1][0] + (map[0][i] ? 0 : 1);
//      dp[0][i][1] = dp[0][i][0] + (map[0][i + 1] ? 1 : 0);
//    }
//    dp[0][M - 1][0] = dp[0][M - 2][0];
//    dp[0][M - 1][1] = dp[0][M - 2][0];
//
//    for (int i = 1; i < N - 1; i++) {
//      dp[i][0][1] = dp[i - 1][0][1] + (map[i][0] ? 0 : 1);
//      dp[i][0][0] = dp[i][0][1] + (map[i + 1][0] ? 1 : 0);
//    }
//    dp[N - 1][0][1] = dp[N - 2][0][1];
//    dp[N - 1][0][0] = dp[N - 2][0][1];
//
//
//
//    //
//    for (int i = 1; i < N - 1; i++) {
//      for (int j = 1; j < M - 1; j++) {
//        int a1 = dp[i - 1][j][1] + (map[i][j] ? 0 : 1);
//        int b1 = dp[i][j - 1][0] + (map[i][j + 1] ? 1 : 0);
//        dp[i][j][1] = min(a1, b1);
//        int a0 = dp[i - 1][j][1] + (map[i + 1][j] ? 1 : 0);
//        int b0 = dp[i][j - 1][0] + (map[i][j] ? 0 : 1);
//        dp[i][j][0] = min(a0, b0);
//      }
//      dp[i][M - 1][0] = min(dp[i - 1][M - 1][1], dp[i][M - 2][0]);
//      dp[i][M - 1][1] = min(dp[i - 1][M - 1][1], dp[i][M - 2][0]);
//      dp[N - 1][][1]=min(dp[i - 1][M - 1][1]);
//    }
//
//
//
/////////
//    for (int i = 0; i < N; i++) {
//      for (int j = 0; j < M; j++) {
//
//
//        System.out.print(dp[i][j][0] + "" + dp[i][j][1] + " ");
//      }
//      System.out.println();
//    }
////////
//  }
//
//  public static int min(int a, int b) {
//    return a < b ? a : b;
//  }
//}
