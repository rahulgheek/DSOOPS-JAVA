package com.Rahul.day44;
import java.util.Arrays;

public class ReplaceDiagonalElements {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int pro = 1;
        for (int i = 0;i< mat.length;i++){
            pro *= mat[i][i];
        }

        for (int i = 0;i< mat.length;i++){
            mat[i][i] = pro;
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
