package leetcode.in;

public class DigitSum {
	 public static int btod(String s)
	    {
	        char[] ch = s.toCharArray();
	        int d=0;
	        int pow = ch.length-1;
	        for(int i=0;i<ch.length;i++)
	        {
	        	System.out.println(ch[i]-'0');
	        	int num = Character.getNumericValue(ch[i]);
	            d +=num*Math.pow(2,pow--);
	        }
	        return d;
	    }
	    public int dtob(int a)
	    {
	        if(a==0)
	        {
	            return 0;
	        }
	        return (a%2+10*dtob(a/2));
	    }
	public  String addBinary(String a, String b) {
		int a1 = btod(a);
        int b1 =btod(b);
        System.out.println("a1:: "+a1);
        System.out.println("b1:: "+b1);
        int c = a1+b1;
        System.out.println("c:: "+c);
        int ans = dtob(c);
        System.out.println("ans:: "+ans);
        return Integer.toString(ans);
	}
	public static void main(String[] args) {
		DigitSum obj = new DigitSum();
		System.out.println("HH");
		String s = obj.addBinary("1010","1011");
		System.out.println(s);
		}
}
