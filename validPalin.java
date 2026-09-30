public class validPalin {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        StringBuilder rev=new StringBuilder (s);
        rev.reverse();
        String res=rev.toString();
      
        if(s.equals(res)){
            return true;
        }
        else{
            return false;
        }

    }
} 