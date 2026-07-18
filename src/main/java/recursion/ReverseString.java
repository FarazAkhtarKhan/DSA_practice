package recursion;

public class ReverseString {
    public boolean reverse(String str,int start, int end) {
        //Brute Force
        int n = str.length()-1;
        for (int i = 0; i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i))
                return false;
        }
        return true;

        //Recursive Call
//        if(start>=end) return true;
//        if(str.charAt(start) != str.charAt(end))
//            return false;
//        return reverse(str,start+1,end-1);
    }
}