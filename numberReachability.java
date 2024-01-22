/**
 *
 * @author Vishal
 */
 
public class CheckReachable 
{
    public static void main(String args[])
    {
        System.out.println(reachable(1, 104, "1"));
    }
    
    // method to check if a number is reachable by addition (+5) and multiuplication(*3)
    public static String reachable(int start, int num, String history)
    {
        // base cases of recursion
        if(start==num)
            return history;
        if(start > num)
            return null;
        
        // check for both cases recursively and return the result
        String result1 = reachable((start+5), num, "("+history+"+5)");
        
        // if result is not null perform the multiplication
        if(result1!=null)
            return result1;
            
        // return the final result
        return reachable((start*3), num, "("+history+"*3)");
    }
}
