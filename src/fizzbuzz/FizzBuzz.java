/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fizzbuzz;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Andreas Kapp
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
  
    }
    
    public String fizzBuzz(int maxNr) {
        StringBuilder r = new StringBuilder();
        
        List<Integer> nums = numbers(maxNr);
        
        nums.stream().map( p -> p.intValue())
                .forEach(t -> r.append(filter(t)));
        
        return r.toString();
    }
    
    public List numbers(int n) {
        List l = new ArrayList();
        for (int i = 1; i <= n; i++){
            l.add(i);
        }
        return l;
    }
    
    
    public String filter(int num) {
        if (num % 15 == 0) {return "FizzBuzz";}
        else if (num % 5 == 0) {return "Buzz";}
        else if (num % 3 == 0) {return "Fizz";} 
        else return String.valueOf(num);
    }
    
}
