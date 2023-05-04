import java.util.Arrays;
public class Missingnumber {
    public static void main(String args[]){
        int a[]={1,2,3,5};
        Arrays.sort(a);
        int n=a.length;
        int b=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=i+1)
            {
                b=i+1;
                break;
            }
        }
        if(b==0)
        {
            b=n;
        }
       System.out.print(b);
    }
}
