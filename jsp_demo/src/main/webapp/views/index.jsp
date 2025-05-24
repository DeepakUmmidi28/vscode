<%@page language="java" %>
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <html>

            <head>
                <title>c:forEach Tag Example</title>
            </head>

            <body>

                <!-- <c:forEach var="i" begin="400" end="404">
                    Code
                    <c:out value="${i}" />
                </c:forEach> -->

                <!-- <c:forEach var="i" items="${arr}">
                    <c:out value="${i}" /><br>
                </c:forEach> -->

                <c:forEach var="alien" items="${aliens}">
                    <c:out value="${alien.aname}" />
                    <!-- <p>----------------------------</p> -->
                    <c:out value="${alien.aid}" /><br>
                </c:forEach>

            </body>

            </html>