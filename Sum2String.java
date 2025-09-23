public class Sum2String {

	public String addStrings(String num1, String num2) {
        int carry =0;
        StringBuilder str = new StringBuilder();

        int n1len =num1.length()-1;
        int n2len =num2.length()-1;

        
        while(n1len>=0 || n2len>=0)
        {   
            int sum=0;
            // //Learn Logic to save the issue of indexout of bound due to uneven
			// size of two or more string


            int n1= n1len>-1 ? num1.charAt(n1len)-'0':0 ;
            int n2= n2len>-1 ?num2.charAt(n2len)-'0' :0;
            sum = n1+n2+carry;
            carry = sum/10;
            str.append(sum%10);
            n1len--;
            n2len--;
        }
        if(carry>0)
         str.append(carry);

         return str.reverse().toString();
        
    }

	public static void main(String[] args) {
		Sum2String ss = new Sum2String();
		
		System.out.println(ss.addStrings("123", "25"));;
	}

}
