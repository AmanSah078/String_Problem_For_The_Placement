class  String_Compression {
	static void toknowtheString_Compression(String str)
	{
		int count=1; //Becasuse every char once came na dude
		for(int i=0; i<str.length()-1; i++)
{
    char ch = str.charAt(i);

    // same character
    if(str.charAt(i) == str.charAt(i+1))
    {
        count++;
    }

    // group finished
    else {

        System.out.println(ch + "" + count);

        count = 1;
    }
}
		//for the last
		System.out.println(str.charAt(str.length()-1) + "" + count);
	}
	public static void main(String[] args)
	{
		String str= "aabbccc";
		toknowtheString_Compression(str);
	}
}