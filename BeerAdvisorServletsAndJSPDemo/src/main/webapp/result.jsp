
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*"%>
<!DOCTYPE html>
<html>
    <body>
        <h1 align="center">Beer Recommandations JSP</h1>
        <p>
            <%
                List styles =  (List)request.getAttribute("styles");
                Iterator it = styles.iterator();
                while (it.hasNext()){
                    out.print("<br>try: " + it.next());
                }
                    
            %>
        </p>
    </body>
</html>
