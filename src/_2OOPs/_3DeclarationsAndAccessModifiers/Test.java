package _2OOPs._3DeclarationsAndAccessModifiers;

import static java.lang.Integer.MAX_VALUE;

import java.lang.*;
import java.lang.reflect.Constructor;
import static java.lang.Byte.*;

  public class Test {

	public  class Student {
		
	}

	public static void main(String args[]) {

		System.out.println(MAX_VALUE);// CTE, error: reference to MAX_VALUE is
										// ambiguous
		System.out.println(MAX_VALUE);

		new Test().m1();
		
		int i=0,j=0;
		while(i<2){
			while(j<2){
				if(i+j==2) break;
				j++;
			}
			i++;
		}
		System.out.println(i+" "+j);
		
	}

	private void m1() {

		Student student = this.new Student();
		for(Constructor constructor: student.getClass().getConstructors()){
			System.out.println(constructor.getModifiers());
		}
	}
}