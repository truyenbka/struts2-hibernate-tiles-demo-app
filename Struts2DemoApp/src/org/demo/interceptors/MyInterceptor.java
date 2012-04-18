package org.demo.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class MyInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception {

		// Pre-processing
		String output = "Pre-processing...";
		System.out.println(output);

		// Call action or next interceptor
		String result = invocation.invoke();

		// Post-processing
		output = "Post-processing...";
		System.out.println(output);

		return result;
	}

}
