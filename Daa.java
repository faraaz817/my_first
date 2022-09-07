import java.io.PrintStream;
import java.util.*;
class Daa{
    static int mirror(String str)
    {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        
        int counter = 0;
       
        for(Map.Entry<Character,Integer> e : map.entrySet())
        {
            if(e.getValue()%2 == 0)
            {
                counter += e.getValue();
            }
            else
            {
                if(e.getValue() == 1)
                {
                    continue;
                }
                else
                {
                    counter += (e.getValue()-1);
                }
            }
        }
        if(str.length()>counter)
        {
            counter += 1;
        }
        return counter;
        
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(mirror(s));
    }
}
