package BinarySearch;
public class SquareRootPrecision{
    public static float squareRoot(int num, int pre){
        int start=0;
        int end=num;
        int mid;
        double ans=0;
        while (start<=end) {
            mid=(start+end)/2;
            if(mid*mid==num){
                ans=mid;
                break;
            }
            if(mid*mid<num){
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;
            }
        }
        float inc=0.1f;
            for(int i=0;i<pre;i++){
                while(ans*ans<=num){
                    ans+=inc;
                }
                ans-=inc;
                inc/=10;
            }
        return (float)ans;
    }
    public static void main(String args[]){
        int num=10;
        int pre=3;
        System.out.println(squareRoot(num,pre));
    }
}