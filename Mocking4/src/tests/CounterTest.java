/**
 * 
 */
package tests;

import org.junit.Test;
import org.mockito.InOrder;

import code.Counter;
import static org.mockito.Mockito.*;


/**
 * @author oded
 *
 */
public class CounterTest {

	@Test
	public void test1() {
		// Testing in order with only one object
				
		// Mocked object
		Counter mockedCounter = mock(Counter.class);
		
		// Four mock object invocations
		mockedCounter.getValue(1);
		mockedCounter.getValue(2);

		// created an in order verifier for mockedCounter 
		InOrder inOrder = inOrder(mockedCounter);	

		inOrder.verify(mockedCounter).getValue(1);
		inOrder.verify(mockedCounter).getValue(2);
		
	}

	@Test
	public void test2() {
		// Testing in order with only one object
				
		// Two mocked objects
		Counter mockedCounter1 = mock(Counter.class);
		Counter mockedCounter2 = mock(Counter.class);
		
		// Four mock object invocations
		mockedCounter1.getValue(1);
		mockedCounter2.getValue(2);

		// created an in order verifier for mockedCounter1 and mockedCounter2
		InOrder inOrder = inOrder(mockedCounter1,mockedCounter2);	

		inOrder.verify(mockedCounter1).getValue(1);
		inOrder.verify(mockedCounter2).getValue(2);
		
	}

}
