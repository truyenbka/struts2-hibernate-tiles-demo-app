<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
<s:head />
<sx:head />
</head>
<body>

	<h2>Invokes DemoActio.java</h2>
	<form action="HelloWorld">
		<s:textfield name="userName" label="User Name" />
		<s:submit />
	</form>
	<h2>Invokes DemoAction2.java</h2>
	<form action="hello">
		<label for="name">Please enter your name</label><br /> <input
			type="text" name="name" /> <input type="submit" value="Say Hello" />
	</form>
 
	<s:form>
		<sx:autocompleter label="Favourite Colour"
			list="{'red','green','blue'}" />
		<br />
		<sx:datetimepicker name="deliverydate" label="Delivery Date"
			displayFormat="dd/MM/yyyy" />
		<br />
		<s:url id="url" value="/hello.action" />
		<sx:div href="%{#url}" delay="2000">
           Initial Content
      </sx:div>
		<br />
		<sx:tabbedpanel id="tabContainer">
			<sx:div label="Tab 1">Tab 1</sx:div>
			<sx:div label="Tab 2">Tab 2</sx:div>
		</sx:tabbedpanel>
	</s:form>
</body>
</html>