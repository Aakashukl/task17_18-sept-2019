<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Employee</h3>
	<hr>
	<form action="UpdateDataMain">
		<pre>
		EmpId		<input type="text" name="empId"  value="${info.empId}"/>
		EmpName	<input type="text" name="empName" value="${info.empName}" />
		EmpAge	<input type="text" name="empAge" value="${info.empAge}" />
		EmpSalary	<input type="text" name="empSalary"
				value="${info.empSalary}" />
					<input type="submit" />
	</pre>
	</form>
	<hr>
</body>
</html>