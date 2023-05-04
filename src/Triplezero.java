import java.util.Arrays;
public class Triplezero {
    public static void main(String args[]){
        int arr[]={0, -1, 2, -3, 1};
        Arrays.sort(arr);
        boolean res=false;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        res=true;
                        break;
                    }
                    if(arr[i]+arr[j]+arr[k]>0)
                        break;
                }
            }
        }
        if(res){
            System.out.println(res);
        }
        else{
            System.out.println(res);
        }
    }
}
