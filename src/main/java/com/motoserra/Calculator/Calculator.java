package com.motoserra.Calculator;
import java.util.ArrayList;

public class Calculator {
	
	  public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
	    return sum;
	  }
	  
	public int evaluateMenos(String expression) {
    int sum = 0;
    int qnt = expression.length();
   
    ArrayList<Character> p = new ArrayList();
    for(int i = 0; i< qnt;  i++){
        p.add(expression.charAt(i));
    }
    sum = Character.getNumericValue(p.get(0));
    
    for (int i = 1; i < qnt; i = i + 2){
        if(p.get(i) == '+'){
            sum += Character.getNumericValue(p.get(i+1));
        }
        else sum -= Character.getNumericValue(p.get(i+1));
    }
       
    
    return sum;
	}
	
}
