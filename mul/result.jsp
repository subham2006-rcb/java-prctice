<%@ page import="com.demo.bean.TableBean" %>

<html>
<body>

<h2>Multiplication Table</h2>

<%
TableBean bean = (TableBean)request.getAttribute("bean");

if(bean != null){
int num = bean.getNumber();

for(int i=1;i<=10;i++){
%>

<p><%=num%> x <%=i%> = <%=num*i%></p>

<%
}
}
%>

</body>
</html>