package poemanalyzer;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kris Lane To count word frequencies found in a file
 */

public class PoemAnalyzer {

    public static void main(String[] args) 
    {   
        
        String file = "https://www.gutenberg.org/files/1065/1065-h/1065-h.htm";
        Scanner s = new Scanner(file);       
        
        String[] POEM = {"a" , "b", "a", "a" , "c", "d",};
        
        Map<String, Integer> frequency = new HashMap<>(); //map to store words
   
        for (String word : POEM) 
            frequency.compute(word, (k,v) -> (v == null) ? v = 1 : v + 1);        

        for (String key : frequency.keySet())     
            System.out.println(key + ", " + frequency.get(key));
    }
}
    