import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class MyProgTest extends TestCase{
	MyProg m;

	@Before
	public void setUp() throws Exception {
		m=new MyProg();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("finito");
	}

	@Test
	public void testMulti() {
		assertEquals(10,m.multi(2,5));
		
	}
	
	public void testEcho() {
		assertEquals("echo 3", "Echo Echo Echo ", m.echo("Echo", 3));
	}

}
