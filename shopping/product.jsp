<%@ page language="java" %>
<html>
<head><title>Products</title></head>
<body align="center">
<h2>Choose a product</h2>
<form action="cart.jsp" method="post">
    <select name="product">
        <option value="Laptop">Laptop</option>
        <option value="Phone">Phone</option>
        <option value="Headphones">Headphones</option>
        <option value="shirt">shirt</option>
        <option value="pant">pant</option>
        <option value="book">book</option>
        <option value="freefire">freefire</option>

    </select>
    <input type="submit" value="Add to Cart">
</form>
<a href="cart.jsp">View Cart</a>
</body>
</html>