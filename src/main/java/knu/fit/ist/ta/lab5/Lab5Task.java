/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.Random;
import knu.fit.ist.ta.lab4.Text;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class Lab5Task {
    
        
    Random rnd = new Random();
     public String list(String nStr){
         /*  if(nStr.equals(" ")) return "Enter the number of objects";*/
        int n = Integer.parseInt(nStr);
        if(n<=0) return "Enter the positive integer value";
        int seed = rnd.nextInt();

        ListOfObj.setSeed(seed);

        SortObj.setList(ListOfObj.listOfObj(n));
        
        return SortObj.listObj().toString();
    }
    
   
    
    
    public String sortStr(){
        return SortObj.sortApproach1().toString();
    }
    
    public String sortShr(){
        return SortObj.sortApproach2().toString();
    }
    
    public String sortedList(){
        return SortObj.sortApproach1All(SortObj.sortApproach1(), SortObj.sortApproach2()).toString();
    }
    
    public String searchWord(String word){
        
          
            if(SearchWord.linearSearch(word,Text.cleanText(Text.text)).isEmpty()){   
                return "This text does not contain the search word";    
            }
            else{ 
                return "Position of the search word: "+ SearchWord.linearSearch(word,Text.cleanText(Text.text)).toString();
            }
        }
      
       
    }

        
        
       

        
    
     


