/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import java.util.Random;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class Calculation {
    
     Random random = new Random();

    public static int[] arrayTask(int arrayLength) {

        int[] intArray = new int[arrayLength];

        for (int j = 0; j < arrayLength; j++) {
            intArray[j] = (int) (Math.random() * (100 - 10) + 10);
        }

        return intArray;
    }
    
     public static String arrayPrint(int[] intArray) {
        String result = "{";

        for (int i : intArray) {
            result += i + ", ";
        }
        result=result.substring(0, result.length()-2);
        result += "}";
        return result;
    }
    
     public static int[] task(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sum(intArray[i]);
        }
        return intArray;
    }

    public static int sum(int n) {
        int res = 0;
        while (n > 0) {
            res += Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }
     
}    


    
    

