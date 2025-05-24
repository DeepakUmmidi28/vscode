<%@page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.deepak.model.JobPost"%>

<html>
    <head>
        <title>New Job</title>
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
        <!-- <c:set var="myJobPost" value="${jobPost}" /> -->
        <% JobPost myJobPost = (JobPost) request.getAttribute("jobPost"); %>
        <h2 class="title">New Job</h2>
        <div class="card">
            <h3>${myJobPost.postProfile}</h3>
            <p>Job Description: ${myJobPost.postDesc}</p>
            <p>Required Experience: ${myJobPost.reqExperience} years</p>
            <p>Technical Stack:
                <ul>
                    <c:forEach var="tech" items="${myJobPost.postTechStack}">
                        <li>${tech}</li>
                    </c:forEach>
                </ul>
        </div>
    </body>
</html>