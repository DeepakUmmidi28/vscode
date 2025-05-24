<%@page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>View All Jobs</title>
        <link rel="stylesheet" href="/Styles.css">
    </head>
    <body>
        <div class="navbar">
            <h2>Job Seeker</h2>
            <ul>
                <li><a href="/home">Home</a></li>
                <li><a href="/viewalljobs">All Jobs</a></li>
            </ul>
        </div>

        <h2 class="title">All Jobs</h2>
        <c:forEach var="jobPost" items="${jobPosts}">
            <h4>${jobPost.postProfile}</h4>
            <p>Job Description: ${jobPost.postDesc}</p>
            <p>Required Experience: ${jobPost.reqExperience} years</p>
            <p>Technical Stack: 
                <ul>
                    <c:forEach var="tech" items="${jobPost.postTechStack}">
                        <li>${tech}</li>
                    </c:forEach>
                </ul>
            </p>
        </c:forEach>
    </body>
</html>