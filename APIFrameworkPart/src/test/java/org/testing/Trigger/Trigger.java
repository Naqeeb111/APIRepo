package org.testing.Trigger;

import java.io.IOException;

import test.testing.TestScript.TC1;
import test.testing.TestScript.TC2;
import test.testing.TestScript.TC3;
import test.testing.TestScript.TC4;
import test.testing.TestScript.TC5;

public class Trigger {
	public static void main(String[] args) throws IOException {
		
		 TC1 t= new TC1();
		 t.testcase1();
		 
		 TC5 t5=new TC5();
		 t5.testcase5();
		 
		 TC2 t2=new TC2(); 
		 t2.testcase2();
		  
		 TC3 t3=new TC3(); 
		 t3.testcase3(); 
		 
		 TC4 t4=new TC4(); 
		 t4.testcase4();
		 
	}

}
