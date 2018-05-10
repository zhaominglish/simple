/**
 * 
 */
package simple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * @author zhaom
 *
 */
public class MyTest {
	@Test
	public void testMethod() {
		String str = "test";
		assertNotNull(str);
	}
	
	@Test
	public void testMethod1() {
		String str = "111";
		assertEquals("111", str);
	}
}
