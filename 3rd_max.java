// ==>length not work in collection size() do works
// can't parse from int to collection, collection to collection possible
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {

        Set<Integer> soarr = new TreeSet<>();

        for(int num :nums)
        {
            soarr.add(num);
        }
        ArrayList<Integer> ll = new ArrayList<>(soarr);
        
        if(ll.size()<3)
        {
            return ll.get(ll.size()-1);
        }

        return ll.get(ll.size()-3);
        
    }

    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(ss.thirdMax(new int[]{2, 2, 3, 1})); 
    }
}