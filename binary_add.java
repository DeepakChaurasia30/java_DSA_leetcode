
// char - '0' ==> ascii value in integer 
// binary sum ==> sum%2 carry ==> sum/2
class Solution {
    public String addBinary(String a, String b) {

        StringBuilder res =new StringBuilder();
        StringBuilder ab =new StringBuilder(a);
        StringBuilder bb =new StringBuilder(b);

        int carry=0;
        int largest = (a.length()>b.length()?a.length():b.length());
        
        if(largest!=a.length())
        {
            ab.insert(0,"0".repeat(largest-a.length()));
        }
        if(largest!=b.length())
        {
            bb.insert(0,"0".repeat(largest-b.length()));
        }
        for(int i=largest-1;i>=0;i--)
        {   
            int sum =0;
            int vala = ab.charAt(i)-'0';
            int valb = bb.charAt(i)-'0';
            sum =vala+valb+carry;

            res.append(sum%2);
            carry = sum/2;
        }

        if(carry==1)
        {
           res.append(carry);
        }

        res = res.reverse();

        return res.toString();

        
    }

    public static void main(String[] args) {
        Solution ab = new Solution();
        System.out.println(ab.addBinary("11100","1000"));
    }
}