class Longest_Common_Prefix {

    static String findlongestcommonprefix(String[] str)
    {
        // first string ko base/reference banaya
        String first = str[0];

        // common prefix store karne ke liye
        StringBuilder sb = new StringBuilder();

        // first string ke har character pe traversal
        for(int i = 0; i < first.length(); i++)
        {
            // current character from first string
            char ch = first.charAt(i);

            // remaining strings se compare
            for(int j = 1; j < str.length; j++)
            {
                // mismatch condition
                // OR agar kisi string ki length choti ho
                if(i >= str[j].length() || str[j].charAt(i) != ch)
                {
                    // common prefix finished
                    return sb.toString();
                }
            }

            // agar sab strings me same character mila
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        String[] str = {"apple","ape","april"};

        String result = findlongestcommonprefix(str);

        System.out.println(result);
    }
}