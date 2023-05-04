import java.net.SocketOption;

public class Indexelement {
    public static void main(String args[]){
        int a[]= {2,4,6,8,9,10,12};
        int b[]= {2,4,6,8,10,12};
        int n=a.length;
        int x=-1;
        boolean res=false;
        int k=0;
        for(int i=0;i<b.length;i++)
        {
            if(a[i]!=b[i])
            {
                x=i;
                break;

            }
        }
        if(x==-1)
        {
            System.out.print(n-1);
        }
        else
        {
            System.out.print(x);
        }

    }
}
