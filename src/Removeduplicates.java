public class Removeduplicates {
    public static void main(String args[]){
        String S="zvvo";
        char ch[]=S.toCharArray();
        String s2="";
        for(int i=0;i<ch.length;i++)
        {
            int j;
            for(j=0;j<i;j++)
            {
                if(ch[i]==ch[j])
                {
                    break;
                }
            }
            if(j==i)
            {
                s2+=ch[i];
            }
        }
        System.out.println(s2);
    }
}
