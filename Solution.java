
import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r = people.length-1;
        int boat=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                boat++;
                l++;
                r--;
            }
            else{
                boat++;
                r--;
            }
        }
            return boat;
        
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(sol.numRescueBoats(people,limit));
    }
}
