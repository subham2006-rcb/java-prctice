<%@ page language="java" import="java.util.*" %>
<html>
<head><title>Your Cart</title></head>
<body align="center">
<%
    List<String> cart = (List<String>) session.getAttribute("cart");
    if (cart == null) {
        cart = new ArrayList<>();
        session.setAttribute("cart", cart);
    }
    String product = request.getParameter("product");
    if (product != null) {
        cart.add(product);
    }
%>

<h2>Shopping Cart</h2>
<%
    if (cart.isEmpty()) {
%>
    <p>Your cart is empty.</p>
<%
    } else {
        for (String item : cart) {
%>
        <%= item %><br>
<%
        }
    }
%>
<a href="product.jsp">Continue Shopping</a>
</body>
</html>