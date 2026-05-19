package Dsa_Once_Again.String_Problem;

public class Valid_Palindrome {
    static boolean tofindvalidpalindrome(String str){

        int i=0;
        int j=str.length()-1;
        while(i<j){
//            if(str[i].equals(str[j])){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
//        String []str= "racecar"; for the multiple string u can use like this
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();
        str=str.replaceAll("[^a-z0-9]", "");
      boolean result= tofindvalidpalindrome(str);
      System.out.println(result);
    }
}
