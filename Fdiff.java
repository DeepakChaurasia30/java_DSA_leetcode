import java.util.ArrayList;
import java.util.List;

class Fdiff {
       public char findTheDifference(String s, String t) {

		char n = t.charAt(0);

		List<Character> sl = new ArrayList<Character>();
		List<Character> tl = new ArrayList<Character>();

		for(char c :s.toCharArray())
		{
			sl.add(c);
		}
		for(char c :t.toCharArray())
		{
			tl.add(c);
		}

		for(Character c :sl)
        {
			if(tl.contains(c))
			{
				tl.remove(c);
				n =tl.get(0);
				
			}
		}



		return n ;
    }

	public static void main(String[] args) {
		Fdiff f = new Fdiff();
	     System.out.println(f.findTheDifference("", "t"));
	}
}




