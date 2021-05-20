/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

/**
 *
 * @author admin
 */
public class Lab3View {
    
    private int [] initialArray;

    public String showInitialArray(String arrayLengString) {

        if (arrayLengString.equals("")) {return "Please enter the length of massiv";}
        int arrayLeng = Integer.parseInt(arrayLengString);

        if (arrayLeng < 0) {return "Wrong length";} 
        else if (1 < 1) {return "";}
        else {
            return (Calculation.arrayPrint(initialArray));
        }
    }

    
    public String showResult() {
     return (Calculation.arrayPrint(Calculation.task(initialArray)));

   }
}
