package CollectionsFramework.GreedyAlgorithm;

public class MinSwapsBracketBalancing {
    // Function to calculate swaps required
    static int swapCount(String s) {

        //To store answer
        int ans = 0;

        //To store count of '['
        int count = 0;

        //Size of string
        int n = s.length();

        //Traverse over the string
        for (int i = 0; i < n; i++) {
            //When '[' encounters
            if (s.charAt(i) == '[')
                count++;
                //when ']' encounters
            else
                count--;
            //When count becomes less than 0
            if (count < 0) {
                //Start searching for '[' from (i+1)th index
                int j = i + 1;
                while (j < n) {
                    //When jth index contains '['
                    if (s.charAt(j) == '[')
                        break;
                    j++;
                }

                //Increment answer
                ans += j - i;

                //Set Count to 1 again
                count = 1;

                //Bring character at jth position to ith position
                //and shift all character from i to j-1
                //towards a right
                char ch = s.charAt(j);
                StringBuilder newString = new StringBuilder(s);
                for (int k = j; k > i; k--) {
                    newString.setCharAt(k, s.charAt(k - 1));
                }
                newString.setCharAt(i, ch);
                s = newString.toString();
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println(swapCount(s));

        s = "[[][]]";
        System.out.println(swapCount(s));
    }
}
