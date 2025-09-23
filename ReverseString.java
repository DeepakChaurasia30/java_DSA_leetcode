public class ReverseString {
	
	    public void reverseString(char[] s) {

			int stlen = s.length-1;
			for(int i=0;i<=stlen/2;i++)
			{
				char first=s[i]; //1 //2 
				char last=s[stlen-i]; // 3 //2
				s[i]=last; //0-3 1-2
				s[stlen-i]=first; //2-1 1-2
			}
			for(Character c : s)
                System.out.print(c);
        
    }

	public static void main(String[] args) {
		ReverseString ss = new ReverseString();
		ss.reverseString(new char[]{'1','2','3','4','5'});
	}
}
