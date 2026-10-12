import java.util.*;
public class Swap {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int i = 0;
        int j = nums.length;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
