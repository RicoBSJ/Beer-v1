<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>

<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
		<%
		@SuppressWarnings("rawtypes")
		List styles = (List) request.getAttribute( "styles" );
		@SuppressWarnings("rawtypes")
		Iterator it = styles.iterator();
		while ( it.hasNext() ) {
		    System.out.println( ( "try: " + it.next() ) );
		}
		%>
	
</body>
</html>