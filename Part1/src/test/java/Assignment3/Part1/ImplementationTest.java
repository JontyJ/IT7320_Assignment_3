package Assignment3.Part1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ImplementationTest {

	Compute interfaceObj;
	Implementation implementationObj;
	Employee emp;
	int a,b,c;
	double d;

	@Before
	public void setUp() throws Exception {
		implementationObj = new Implementation();
		a = 100000;
		b = 52;
		c = 26;
		d = 0.03;
		
		
		// Initialized the mock object
		interfaceObj = Mockito.mock(Compute.class);
		Mockito.when(interfaceObj.computeTax(a)).thenReturn(30000);
		Mockito.when(interfaceObj.weeklySalary(emp)).thenReturn(1923);
		Mockito.when(interfaceObj.fortnightSalary(emp)).thenReturn(3846);
		Mockito.when(interfaceObj.computeKiwiSaver(emp)).thenReturn(57.69);
		
				
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
		interfaceObj = null;
		implementationObj = null;
	}

	@Test
	public void testComputeTax() {
		assertEquals(30000, implementationObj.computeTax(a));
	}

	@Test
	public void testWeeklySalary() {
		assertEquals((a/b), implementationObj.weeklySalary(emp));
	}

	@Test
	public void testFortnightSalary() {
		assertEquals((a/c), implementationObj.fortnightSalary(emp));
	}

	@Test
	public void testComputeKiwiSaver() {
		assertEquals((1923*d), implementationObj.computeKiwiSaver(emp), 0);
	}
	
}
