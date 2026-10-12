public class Reverse {
    public static void main(String[] args){
        int [] arr = {5,4,8,9,2};
        int [] ans = new int [arr.length];
        int j =0;
        for(int i=arr.length-1;i>=0;i--){
            ans[j++]= arr[i];

        }
        System.out.println(Arrays.toString(ans));
    }
}
    
