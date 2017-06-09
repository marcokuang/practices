package marco.topics;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReformatTest {
	
	@Test
	public void testFormatString() {
		StringReformat sr = new StringReformat("a5ft-98k9", 4);
		assertEquals("a5ft-98k9", sr.toString());
		
		sr = new StringReformat("a5ft-9k9", 4);
		assertEquals("a5f-t9k9", sr.toString());
	}


}
