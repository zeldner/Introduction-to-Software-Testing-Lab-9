package com.data.api;

import java.util.Arrays;
import java.util.List;

public class FrameworksStub implements Frameworks{
	@Override
	public List<String> getFrameworks(String user) {
		return Arrays.asList("React Native", "Next.js", "Storybook", "Semantic UI React");
	}
}
