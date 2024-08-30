public class Jump2 {
    public static int minJumps(int arr[])
    {
        int l=0,r=0,jumps=0, n=arr.length-1;
        while(r<n)
        {
            int far=0;
            for(int i=l;i<=r;i++)
            {
                far=Math.max(far, i+arr[i]);
            }
            jumps+=1;
            l=r+1;
            r=far;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(minJumps(arr));
    }
}
