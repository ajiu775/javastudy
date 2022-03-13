public class Solution {

    public static boolean validPalindrome(String s) {
        //双指针
        //判断临界条件
        if(s == null || s.length()==0){
            return true;
        }

        int n = s.length();

        int left = 0;
        int right = n-1;
        boolean result = true;
        int recordflag = 0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                recordflag++;
                int flag1 =isPalindrome(s.substring(left,right),recordflag);
                if(flag1 ==1){
                    return true;
                }
                int flag2 =isPalindrome(s.substring(left+1,right+1),recordflag);
                if(flag2 == 1){
                    return true;
                }
                return false;
            }
            ++left;
            --right;
        }
        return result;
    }

    public static int isPalindrome(String s,int recordflag){
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                recordflag++;
                return recordflag;
            }
        }
        return recordflag;
    }

    public static void main(String[] args) {
        String a = "deeee";
        System.out.println(Solution.validPalindrome(a));
    }
}
