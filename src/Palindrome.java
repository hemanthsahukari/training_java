public class Palindrome {
    public static void main(String args[]){
        String s="abba";
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        if(a.equals(s)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
