class Anagram_Valid {
	static boolean findtheanagaram(String s, String t)
	{
		//1st take all alphabet
		int[] arr= new int[26];  //->> Isase actually hoga ye ki sb alphabet store in the form in number i mean A-1,B-2.....Z-26
		for(int i=0; i<s.length(); i++)
		{
			//u have to store in the form in char
			char ch= s.charAt(i);
			arr[ch-'a']++;
		}
		for(int j=0; j<t.length(); j++)
		{
			char ch=t.charAt(j);
			arr[ch-'a']--;
		}
		//now final 
		for(int i=0; i<26; i++)
			
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s= "silent";
		String t= "listen";
		boolean result=findtheanagaram(s,t);
		System.out.println(result);
	}
}