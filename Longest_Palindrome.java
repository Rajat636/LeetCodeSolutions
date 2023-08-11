package My_Package2;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {

	public static int longestPalindrome(String s) {
        // if(s.length()==1)return 1;
        Map<Character,Integer> map = new HashMap<>();
//        for(int i=0; i<s.length(); i++)
//        {
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
        for(char c:s.toCharArray()) {
        	map.put(c, map.getOrDefault(c, 0)+1);
        }
        int count = 0;
        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            System.out.println(e.getValue()+" "+e.getKey());
            if(e.getValue()%2==0)
            {
                count+=e.getValue();
            }
            else
            {
            	System.out.println("else");
                count+=e.getValue()-1;
                map.replace(e.getKey(),1);
            }
        }

        if(map.containsValue(1))
        {
            count++;
            System.out.println(count);
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bb";
		System.out.println(longestPalindrome(s));
	}

}
