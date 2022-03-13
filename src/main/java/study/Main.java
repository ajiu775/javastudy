package study;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: java study
 * @description: exam
 * @author: Kelly.Xing
 * @create: 2019-08-14 19:11
 **/
public class Main {
    public static void main(String[] args) {
       Main main = new Main();
       int [][] matrix = new int[][]{{-1,3}};
        System.out.println(matrix.length);
        System.out.println(main.findNumberIn2DArray(matrix,3));


    }


    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean result =false;
        if(matrix.length==0){
            return result;
        }
        for(int j = 0 ; j <matrix[0].length;j++){
            if(matrix[0][j]==target){
                result =true;
                break;
            }
            if(matrix[0][j]<target){
                if(j==matrix[0].length-1){
                    result = downRead(matrix,target,j);
                    break;
                }
                continue;
            }
            if(matrix[0][j]>target){
                if(j>0){
                    result = downRead(matrix,target,j-1);
                    break;
                }else{
                    return result;
                }

            }
        }
        return result;
    }

    public boolean downRead(int[][] matrix, int target,int column){
        boolean result =false;
        for(int i = 1 ;i< matrix.length; i++){
            if(target == matrix[i][column]){
                result = true;
                return result;
            }
        }
        return result;
    }
}