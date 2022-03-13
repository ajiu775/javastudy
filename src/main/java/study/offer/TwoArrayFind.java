package study.offer;

import java.util.*;

/**
 * @program: javastudy
 * @description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 * @author: Kelly.Xing
 * @create: 2019-09-22 15:50
 **/
public class TwoArrayFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入目标数:");
        int target = Integer.valueOf(scanner.nextLine());
        System.out.println("请输入数组规格:");
        String rule = scanner.nextLine();
        System.out.println("请输入数组:");
        String[] sizes = rule.split("x");
        int hangShu = Integer.valueOf(sizes[0]);
        int lieShu = Integer.valueOf(sizes[1]);
        int[][] nums = new int[hangShu][lieShu];
        for (int i = 0; i < hangShu; i++) {
            for (int j = 0; j < lieShu; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        solution(target, nums);

    }

    public static void solution(int target, int[][] nums) {
        if (nums.length == 0 || nums[0].length == 0) {
            System.out.println("条件输入不对");
        } else {
            int n = 0;
            int m = nums[0].length - 1;
            int temp = nums[n][m];
            while (target != temp) {
                if (temp > target) {
                    m = m - 1;
                    temp = nums[n][m];
                } else {
                    n = n + 1;
                    temp = nums[n][m];
                }
            }
            System.out.println("目标整数所在位置为第" + n + "行第" + m + "列");
        }
    }
}
