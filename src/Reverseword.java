public class Reverseword {
    public static void main(String args[]){
        String S="i.like.this.program.very.much";
        String a[]=S.split("\\.");
        String s1="";
        for(int i=a.length-1;i>=0;i--)
        {
            s1+=a[i]+"";
            if(i!=0)
            {
                s1+='.';
            }
        }
        System.out.print(s1);
    }
}
