

public class Kanpsack01_UsingRecursion {
    public static int KnapSack(int val[], int w[], int W, int n)
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        if(w[n-1]<=W)//Valid
        {
            int ans1= val[n-1]+KnapSack(val,w,W-w[n-1],n-1);//include
            int ans2= KnapSack(val, w, W, n-1); //Exclude
            return Math.max(ans1, ans2);
        }else{
            return KnapSack(val, w, W, n-1); //Exclude
        }
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int w[]={2,5,1,3,4};
        int W=7;
        System.out.println(KnapSack(val,w,W,val.length));
    }
}
