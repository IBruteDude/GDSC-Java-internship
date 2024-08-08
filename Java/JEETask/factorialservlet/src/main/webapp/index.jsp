<html>
<head>
	<title>Factorial Table</title>
</head>
<body>
	<table border="1">
		<thead><td>Number</td><td>Factorial</td></thead>
		<tbody>
			<%
				int currentFactorial = 1;

				out.println("<tr><td>"+0+"</td><td>"+1+"</td></tr>");
				for (int i = 1; i <= 10; i++) {
					currentFactorial *= i;
					out.println("<tr><td>"+i+"</td><td>"+currentFactorial+"</td></tr>");
				}
			%>
		</tbody>
	</table>
</body>
</html>
