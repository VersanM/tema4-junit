import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class OperatiiSiruriTest {

	private OperatiiSiruri op;
    private Sorter s;
	
	@Before
    public void setUp() throws Exception {
        s = createNiceMock(Sorter.class);
        op = new OperatiiSiruri(s);
    }
	
	@Test
	public void testInterclasare() {
		
		int[] a={5, 2, 8, 3, 1, 4};
		expect(s.sort(a)).andReturn(new int[]{2, 3, 4, 5, 8});
        
		int[] b = {6, 1, 7, 9};
        	expect(s.sort(b)).andReturn(new int[]{1, 6, 7, 9});
        	replay(s);
        
        	int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        	assertArrayEquals( op.interclasare(a, b),c);
         
	}

}
