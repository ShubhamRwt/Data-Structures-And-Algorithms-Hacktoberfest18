package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class saktan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int q = input.nextInt();
            if (q <= 300) {
                boolean a[][] = new boolean[n][m];
                int result = 0;


                for (int i = 0; i < q; i++) {
                    int x = input.nextInt();
                    int y = input.nextInt();
                    boolean initial = a[x - 1][y - 1];
                    for (int j = 0; j < m; j++) {
                        boolean temp = a[x - 1][j];
                        a[x - 1][j] = !temp;
                        if (temp == false) {
                            result++;
                        } else result--;


                    }
                    for (int j = 0; j < n; j++) {
                        boolean temp = a[j][y - 1];
                        a[j][y - 1] = !temp;
                        if (temp == false) {
                            result++;
                        } else result--;


                    }


                }

                System.out.println(result);

            } else {


                int a[][] = new int[n][m];
                boolean row[] = new boolean[n];
                boolean col[] = new boolean[m];
                for (int i = 0; i < q; i++) {
                    int x = input.nextInt();
                    boolean temp = row[x - 1];
                    row[x - 1] = !temp;
                    int y = input.nextInt();
                    boolean temp2 = col[y - 1];
                    col[y - 1] = !temp2;


                }
                for (int i = 0; i < n; i++) {
                    if (row[i] == true) {
                        for (int j = 0; j < m; j++) {
                            a[i][j]++;

                        }
                    }
                }
                for (int i = 0; i < m; i++) {

                    if (col[i] == true) {
                        for (int j = 0; j < n; j++) {
                            a[j][i]++;

                        }
                    }

                }
                int result = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (a[i][j] % 2 != 0) {
                            result++;
                        }

                    }

                }
                System.out.println(result);
            }
        }
    }
}
