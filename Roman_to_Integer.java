import java.util.HashMap;
import java.util.Map;

class Roman_to_Integer {
	static int converromantointeger(String str)
	{
		int sum=0;
		   HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		  // Roman mapping
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			
			hm.get(ch);
			
			sum=sum+hm.get(ch);
		}
		
		return sum;
	}
	public static void main(String[] args)
	{
		//String str="III";
		String str="LVIII";
		int result=converromantointeger(str);
		System.out.println(result);
	}
}