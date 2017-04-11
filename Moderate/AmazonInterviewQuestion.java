package Moderate;

public class AmazonInterviewQuestion {

	public static int CountSequences(String input)
    {
        char[] chars = input.toCharArray();
        int count = 0;
        CountSequences(chars, 0, 'a',  count);
        return count;
    }
    //abcabc
    private static void CountSequences(char[] chars, int startIndex, char lookupChar,  int count)
    {
        if (lookupChar > 'c') return;
        for (int currentIndex = startIndex; currentIndex < chars.length; currentIndex++)
        {
            if (chars[currentIndex] == lookupChar) //found a match
            {
                if (lookupChar == 'c')
                {
                    count++;
                }
                else
                {
                    CountSequences(chars, currentIndex + 1, (char)(lookupChar + 1), count);
                }
                CountSequences(chars, currentIndex + 1, lookupChar,  count);
            }
        }
    }
    
    
    public static void main(String args[])
    {
    	System.out.println(CountSequences("abcabc"));
    }
}
