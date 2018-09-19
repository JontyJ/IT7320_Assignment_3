package Assignment3.Part1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ImplementationTest {

	Compute interfaceObj;
	Implementation implementationObj;
	int x;
	double a, b;
	
	@Before
	public void setUp() throws Exception {
		implementationObj = new Implementation();
		x = 100000;
		
		// Initialized the mock object
		interfaceObj = Mockito.mock(Compute.class);
		Mockito.when(interfaceObj.computeTax(x)).thenReturn(30000);
				
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
		interfaceObj = null;
		implementationObj = null;
	}

	@Test
	public void testComputeTax() {
		assertEquals(30000, implementationObj.computeTax(x));
	}

	@Test
	public void testWeeklySalary() {
		fail("Not yet implemented");
	}

//	@Test
//	public void testFortnightSalary() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testComputeKiwiSaver() {
//		fail("Not yet implemented");
//	}
//	
	
//	public int calculateTax ( int amount) {
//		if(amount <= 14000) {
//			amount = (int) (amount / 10.5) * 100; 
//		}
//		else 
//			if(amount > 14000 && amount <= 48000) {
//				amount = (int) (amount / 17.5) * 100;
//			}
//		else
//				if(amount > 48000 && amount <= 70000 ) {
//					amount = (amount / 30) * 100;
//				}
//				else
//					if(amount > 70000) {
//						amount = (amount / 33) * 100; 
//					}
//		return amount;
//	}

}
