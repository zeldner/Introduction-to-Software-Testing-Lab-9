package com.business;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.data.api.Frameworks;
import com.data.api.FrameworksStub;

public class ToDoBusinessImplStubTest {

	@Test
	public void testGetFrameworksReact_usingAStub() {
		assertEquals(2, (new ToDoBusinessImpl(new FrameworksStub())).getReactFrameworks("Dummy Test").size());
	}

}
