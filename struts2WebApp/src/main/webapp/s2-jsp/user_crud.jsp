<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>users (crud)</title>
</head>
<body>
  <h2>users (crud)</h2>

<s:form action="saveOrUpdateUser">
	<s:push value="user">
		<s:hidden name="id" />
		<s:textfield name="name" label="User Name" />
		<s:radio name="gender" label="Gender" 
        	list="{'Male','Female'}" />
		<s:select name="country" list="{'India','USA','UK','France'}" 
        	headerKey="" headerValue="Select" 
            label="Select a country" />
		<s:textarea name="aboutYou" label="About You" />
		<s:checkbox name="wishToBeInMailingList"
			label="Would you like to join our mailing list?" />
		<s:submit value="submit (save or update)" />
	</s:push>
</s:form>
 <s:debug />
<s:if test="userList.size() > 0">
	<div class="content">
	<table class="userTable" border="1" cellpadding="5px">
		<tr class="even">
			<th>Name</th>
			<th>Gender</th>
			<th>Country</th>
			<th>About You</th>
			<th>wishToBeInMailingList</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="userList" status="userStatus">
			<tr
				class="<s:if test="#userStatus.odd == true ">odd</s:if> <s:else>even</s:else>">
				<td><s:property value="name" /></td>
				<td><s:property value="gender" /></td>
				<td><s:property value="country" /></td>
				<td><s:property value="aboutYou" /></td>
				<td><s:property value="wishToBeInMailingList" /></td>
				<td>
                <s:url id="editURL" action="selectUserToEdit">
					<s:param name="id" value="%{id}"></s:param>
				</s:url>
                <s:a href="%{editURL}">Select to Edit</s:a>
                </td>
				<td>
                <s:url id="deleteURL" action="deleteUser">
					<s:param name="id" value="%{id}"></s:param>
				</s:url>
                <s:a href="%{deleteURL}">Delete</s:a>
                </td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
 <hr/>
	<s:url id="welcome_url" action="welcome"></s:url>
    <s:a href="%{welcome_url}" >retour vers welcome</s:a><br/>

</body>
</html>