package week1.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

public static void main(String[] args) {
        
        String str = 
            "We learn java basics as part of java sessions in java week1";
        
        System.out.println("Original String: ");
        System.out.println(str);
        //converting the string to array with .split()
        String[] strWords = str.split(" ");
            
        //convert String array to LinkedHashSet to remove duplicates
        LinkedHashSet<String> lhSetWords = new LinkedHashSet<String>( Arrays.asList(strWords) );
        
        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0)
                sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }
        
        str = sbTemp.toString();
        
        System.out.println("String after removing duplicate words: ");
        System.out.println(str);
 
    }
}



