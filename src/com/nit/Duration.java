package com.nit;

import java.time.LocalDate;
import java.time.Period;

public class Duration {

	public static void main(String[] args) {
		
       LocalDate join=LocalDate.of(1996, 8, 15);
       
       LocalDate today=LocalDate.now(); 
       
       Period p=Period.between(join, today);
      
       System.out.printf("Age is %d years %d months %d Days",p.getYears(),p.getMonths(),p.getDays());
		
	}

}
