<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee - Hibernate Example</title>
<s:head />
</head>
<body>
	<s:form action="addEmployee">
		<s:textfield name="firstName" label="First Name" />
		<s:textfield name="lastName" label="Last Name" />
		<s:textfield name="salary" label="Salary" />
		<s:submit />
		<hr />
		<table>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Salary</td>
			</tr>
			<s:iterator value="employees">
				<tr>
					<td><s:property value="firstName" />
					</td>
					<td><s:property value="lastName" />
					</td>
					<td><s:property value="salary" />
					</td>
				</tr>
			</s:iterator>
		</table>
	</s:form>
</body>
</html>