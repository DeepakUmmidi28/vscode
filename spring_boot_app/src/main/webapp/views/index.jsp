<%@page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>

    <head>
        <title>Job App using SpringBoot</title>
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

        <div class="container">
        <div class="tab">
            <button type="button" onclick=" window.location.href='/viewalljobs' ">View All Jobs</button>
        </div>
        <div class="tab">
            <button type="button" onclick=" window.location.href='/addjob' ">Post a Job</button>
        </div>
    </div>
    </body>

    </html>

    