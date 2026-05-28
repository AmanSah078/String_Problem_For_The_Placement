import java.util.Arrays;

class Group_Anagrams {

    static void tofindtheGroup_Anagrams(String[] str)
    {
        boolean[] visited = new boolean[str.length];

        // first string
        for(int i = 0; i < str.length; i++)
        {
            // already grouped
            if(visited[i] == true)
            {
                continue;
            }

            char[] ch1 = str[i].toCharArray();

            Arrays.sort(ch1);

            String store1 = new String(ch1);

            System.out.print("[" + str[i]);

            visited[i] = true;

            // second string for comparison
            for(int j = i + 1; j < str.length; j++)
            {
                char[] ch2 = str[j].toCharArray();

                Arrays.sort(ch2);

                String store2 = new String(ch2);

                // compare sorted strings
                if(store1.equals(store2))
                {
                    System.out.print("," + str[j]);

                    visited[j] = true;
                }
            }

            System.out.println("]");
        }
    }

    public static void main(String[] args)
    {
        String[] str = {"eat","tea","tan","ate","nat","bat"};

        tofindtheGroup_Anagrams(str);
    }
}