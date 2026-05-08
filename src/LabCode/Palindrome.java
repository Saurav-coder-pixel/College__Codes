
public class Palindrome {
    void check(String data)
    {
        String rdata = "";
        int i,len;
        len = data.length();
        for (i=len-1;i>=0;i--)
            rdata = rdata + data.charAt(i);
        if (data.equals(rdata))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");
    }

    public void check2(String str){
        int i= 0;
        int n= str.length()-1;
        boolean isPalindrom= true;

        while(i< str.length()){
            if(str.charAt(i)!= str.charAt(n)){
                isPalindrom= false;
                break;
            }
            i++;
            n--;
        }
        if (isPalindrom) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }

    public static void main(String[] args){
        Palindrome obj= new Palindrome();
        obj.check2("aaaaaaa");
    }
}

