package ACs;

import java.util.Scanner;

/**
 * Created by htplex on 4/6/16.
 */
public class C {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    boolean[][] map = new boolean[N][M];
    for (int i = 0; i < N; i++) {
      String s = in.next();
      for (int j = 0; j < M; j++) {
        map[i][j] = s.charAt(j) == '.';
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
    int[][] dp = new int[N][M];


    dp[0][0] = map[0][0] ? 0 : 1;


    for (int i = 1; i < M - 1; i++) {
      dp[0][i] = dp[0][i - 1]/*+(map[0][i+1]?1:0)-(map[0][i]?1:0)*/;
      if (map[0][i + 1]) {
        dp[0][i]++;
        if (!map[0][i]) {
          dp[0][i]--;
        }
      }


      dp[0][i] += map[0][i] ? 0 : 1;
    }
    dp[0][M - 1] = dp[0][M - 2] - (map[0][M - 1] ? 1 : 0);
    if (dp[0][M - 1] < 0) dp[0][M - 1] = 0;

    //dp[0][M-1]=dp[0][M-2]-/*+(map[0][i+1]?1:0)-(map[0][i]?1:0)*/;


//    for (int i = 1; i < N-1; i++) {
//      dp[i][0]=dp[i-1][0]+(map[i][0]?0:1);
//    }


    for (int i = 1; i < N - 1; i++) {
      dp[i][0] = dp[i - 1][0]/*+(map[0][i+1]?1:0)-(map[0][i]?1:0)*/;
      if (map[i + 1][0]) {
        dp[i][0]++;
        if (map[i][0]) {
          dp[i][0]--;
        }
      }


      dp[i][0] += map[i][0] ? 0 : 1;
    }
    dp[N - 1][0] = dp[N - 2][0] - (map[N - 1][0] ? 1 : 0);
    if (dp[N - 1][0] < 0) dp[N - 1][0] = 0;
////


//


    for (int j = 1; j < N - 1; j++) {
      for (int i = 1; i < M - 1; i++) {
        dp[j][i] = dp[j][i - 1]/*+(map[0][i+1]?1:0)-(map[0][i]?1:0)*/;
        if (map[j][i + 1]) {
          dp[j][i]++;
          if (map[j][i]) {
            dp[j][i]--;
          }
        }


        dp[j][i] += map[j][i] ? 0 : 1;
      }
      dp[j][M - 1] = dp[j][M - 2] - (map[j][M - 1] ? 1 : 0);
      if (dp[j][M - 1] < 0) dp[j][M - 1] = 0;

    }
    dp[N - 1][M - 1] = dp[N - 2][M - 1] - (map[N - 1][M - 1] ? 1 : 0);
    if (dp[N - 1][M - 1] < 0) dp[N - 1][M - 1] = 0;


    //
//    for (int i = 1; i < N; i++) {
//      for (int j = 1; j < M; j++) {
//        int down=0;
//        if(j==M-1) down=dp[i-1][j];
//        else down=dp[i-1][j]+(map[i-1][j+1]?1:0);
//        int right=0;
//        if(i==N-1) right=dp[i][j-1];
//        else right=dp[i][j-1]+(map[i+1][j-1]?1:0);
//        dp[i][j]=min(down,right);
//       dp[i][j]+=map[i][j]?0:1;
//      }
//    }


///////
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
//////
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }
}
