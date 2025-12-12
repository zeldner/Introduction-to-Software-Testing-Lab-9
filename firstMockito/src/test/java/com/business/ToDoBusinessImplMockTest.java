// Ilya Zeldner
package com.business;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.data.api.Frameworks;

// Mockito is a java based mocking framework, used in conjunction with other testing frameworks such as JUnit and TestNG. 
// It internally uses Java Reflection API and allows to create objects of a service.
// Java Reflection provides ability to inspect and modify the runtime behavior of application. Reflection in Java is one of the advance topic of core java. 
// Using "java reflection" we can inspect a class, interface, enum, get their structure, methods and fields information at runtime even though class is not accessible at compile time. 
// We can also use reflection to instantiate an object, invoke it’s methods, change field values
// A mock object returns a dummy data and avoids external dependencies. 
// It simplifies the development of tests by mocking external dependencies and apply the mocks into the code under test.

public class ToDoBusinessImplMockTest {
	@Test
	public void testGetFrameworksReact_usingAMock() {
		Frameworks frameworksReactMock = mock(Frameworks.class);
		List<String> frameworks = Arrays.asList("React Native", "Next.js", "Storybook", "Semantic UI React");
		when(frameworksReactMock.getFrameworks("First Test")).thenReturn(Arrays.asList("React"));
		when(frameworksReactMock.getFrameworks("Dummy Test")).thenReturn(frameworks);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(frameworksReactMock);
		assertEquals(1, toDoBusinessImpl.getReactFrameworks("First Test").size());
		assertEquals(2, toDoBusinessImpl.getReactFrameworks("Dummy Test").size());
	}
	
	@Test
	public void testGetFrameworksReact_empty()  {
		Frameworks frameworksReactMock = mock(Frameworks.class);
		List<String> frameworks = Arrays.asList();
		when(frameworksReactMock.getFrameworks("Dummy Test")).thenReturn(frameworks);
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(frameworksReactMock);
		assertEquals(0, toDoBusinessImpl.getReactFrameworks("Dummy Test").size());
	}

}
