<%@page language="java" %>

<html>
    <body>
        <h1>Welcome to the JSP Page</h1>
        <p>This is a simple JSP page.</p>
        <form action="add">
            <label for="aid">AID :</label>
            <input type="number" name="aid" id="aid">
            <br>
            <label for="aname">aname :</label>
            <input type="text" name="aname" id="aname">
            <br>
            <input type="submit" value="Submit">
        </form>
        <!-- <form action="add">
            <label for="input1">Input 1:</label>
            <input type="text" name="input1" id="input1">
            <br>
            <label for="input2">Input 2:</label>
            <input type="text" name="input2" id="input2">
            <br>
            <input type="submit" value="Submit">
        </form> -->
    </body>
</html>
