/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit.ist.demo.Exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author admin
 */
public class Task {
   
    public List<Float> arg;                    // список, який зберігає параметри
    public static List<Float> res;
    
    public Task() {
        arg = new LinkedList<>();
        res = new LinkedList<>();    // цей конструктор ми створили, щоб далі ми змогли працювати з методом SetArgs
    }

    public Task(int length) {
        arg = new LinkedList<>();
        res = new LinkedList<>();
        
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arg.add((float) random.nextInt(100));
        }
    }
    
    public void SetArgs(float[] args)     //цей метод створений сугубо для тестів
    {
        this.arg.clear();
        for (int i = 0; i < args.length; i++)
            this.arg.add(args[i]);
    }
    
    public String Calc()
    {
        res.clear();
        int length = arg.size();

        for (int i = 0; i < length; i++)
            res.add (Calculation.Calc(arg.get(i)));
        
        return res.toString();
    }
    
    public String GetArgs()
    {
        return arg.toString();
    }
    
    public static int Search(float index)
    {
        int length = res.size();
        for (int i = 0; i < length; i++)
            if(res.get(i) == index)
                return i + 1;
        
        return -1;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

