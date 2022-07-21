package com.javaproject.lambdaExpression;
  
public class Main {

	public static void main(String[] args) {
		System.out.println("Start.........!!!!!!!!!!!!");
		MyInter mm=new MyInterImpl();
		mm.SayHello();


		MyInter i=() ->
		System.out.println("lambda expresiion");
		i.SayHello();


		MyInter i2=() ->
		System.out.println("2222");
		i2.SayHello();
		
		SumInter ee=(a,b)-> a + b;
		System.out.println("Sum is "   +ee.sum(10, 20));
		System.out.println(ee.sum(22,44));
		};

	}



