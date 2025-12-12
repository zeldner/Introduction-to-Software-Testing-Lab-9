//Ilya Zeldner
package com.business;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.Test;
public class ListTest {

	@Test
	public void testCallListzSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(3, listMock.size()); // return 3
	}
	
	@Test
	public void testCallListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn(2).thenReturn("ok");
		assertEquals(2, listMock.get(0));
		assertEquals("ok", listMock.get(0));
		assertEquals(null, listMock.get(1)); // return null
	}
	
	@Test(expected=RuntimeException.class)
	public void testCallListGetMethod_throwAnException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("ok")).thenReturn(4);
		listMock.get(0);
		assertEquals(3, listMock.get(1)); // unreachable code
	}
	
}

