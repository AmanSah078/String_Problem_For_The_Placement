class Reverse_String_words {
	static void reverse(String str)
	{
//to remove the extraspace
		str= str.replaceAll("\\s+", " ").trim();
//to break the sen in to words form
//and it store in the form in arr like
//blue
//is
//sky
//the

		String[] arr=str.split(" ");
		
		//now reverse the words
	
		for(int i=arr.lenght-1; i>=0; i--)
		{
			System.out.println(arr[i]+ " ");
		} 
	}
	public static void main(String[] args)
	{
		String str="the sky is blue";
		reverse(str);
	}
}