import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class MissingN
{
     public List<Integer> findDisappearedNumbers(int[] nums) 
	 {

        HashSet<Integer> ns = new HashSet<Integer>();
		List<Integer> ol = new ArrayList<>();

        for(int i :nums)
        {
            ns.add(i);
        }

		for(int i=1;i<=nums.length;i++)
		{
             if(!ns.contains(i))
			 {
				ol.add(i);
			 }
		}

		return ol;
        
    }

	public static void main(String[] args) {
		MissingN kk = new MissingN();
		System.out.println(kk.findDisappearedNumbers(new int[]{
			4,3,2,7,8,2,3,1
}));
	}
}
