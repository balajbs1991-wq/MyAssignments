package org.week3.day1;
import java.util.Arrays;
public class PrintDuplicate {
    public static void main(String[] args) {
        

    int array [] = {2,5,7,7,5,9,2,3};
    Arrays.sort(array);
    for(int i=0; i<array.length-1; i++){    
        if(array[i] == array[i+1]){    
            System.out.println("Duplicate element: " + array[i]);    
        }    
    }                    

}
}
