import java.util.*;
public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        for(int i=1 ; i<n; i++){
            int num = sc.nextInt();
            if(num>max){
                max = num;
            }
        }
        System.out.println("maximum number :" + max);
    }
  
    
}
