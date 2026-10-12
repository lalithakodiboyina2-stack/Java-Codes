public class Hello {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int max = arr[0];
        int secmax=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>secmax){
                secmax= arr[i];
            }

        }
        System.out.println(secmax);
    }
    
}
