class RevInt
{
	   public int reverse(int x) {
       long r= 0;
       while(x!=0) {
        int ld = x%10;
        r = (r*10)+ld;
        x = x/10;
       }

       if (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) r;
    }

		public static void main(String[] args) {

			RevInt rr = new  RevInt();

			System.out.println(rr.reverse(1534236469));
			System.out.println(rr.reverse(-2589));

		}

}