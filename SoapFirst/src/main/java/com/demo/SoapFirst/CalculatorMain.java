package com.demo.SoapFirst;

import com.demo.SoapFirst.models.Add;

public class CalculatorMain {

	public static void main(String[] args) {
		Add add=new Add();
		int number1=10;
		int number2=5;
		add.setIntA(number1);
		add.setIntB(number2);
		
		int result=add.getIntA()+add.getIntB();
		System.out.println("result is:"+result);

	}

}
