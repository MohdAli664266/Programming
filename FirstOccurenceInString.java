class FirstOccurenceInString {
    public static int strStr(String haystack, String needle) 
    {
        if(!haystack.contains(needle))
        {
            return -1;
        }
        for(int i=0; i<=haystack.length()-needle.length(); i++)
        {
            int j=0; 
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==needle.length())
            {
                return i;
            }
        }        
        return -1;
    }
    public static void main(String[] args) {
        int s= strStr("sadhellosad", "sad");
        System.out.println(s);
    }
}