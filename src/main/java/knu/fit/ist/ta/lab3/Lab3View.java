/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class Lab3View {
    
    private int [] initialArray;

    public String showInitialArray(String arrayLengthString) {

       
        if (arrayLengthString.equals(" ")) {return "Please enter the length of massiv";}
        int arrayLength = Integer.parseInt(arrayLengthString);

        if (arrayLength < 0) {return "Wrong length";} 
        else if (1 < 1) {return "";}
        else {
          initialArray = Calculation.arrayTask(arrayLength);
          return (Calculation.arrayPrint(initialArray));
        }
    }

    
    public String showResult() {
     return (Calculation.arrayPrint(Calculation.task(initialArray)));

   }
}

