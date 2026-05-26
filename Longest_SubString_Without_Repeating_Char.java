class Longest_SubString_Without_Repeating_Char {
	static void toknowthelongestsubstring(String str)
	{
			int max=0;
		for(int i=0; i<str.length(); i++)
		{
			int [] arr= new int[26];
			int count=0;
		
			//this is inner lloop to check the freq eleemnta and store in the count
			
			for(int j=i; j<str.length(); j++)
			{
				char ch= str.charAt(j);
			    arr[ch-'a']++;
				
				//when repeated ->leave
				if(arr[ch-'a']>1)
				{
					break;
				}
				count++;
				max=Math.max(max,count);
			}
			
		
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		String str= "abcabcbb";
		toknowthelongestsubstring(str);
	}
	
}