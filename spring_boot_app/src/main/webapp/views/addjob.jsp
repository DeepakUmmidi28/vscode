<%@page language="java" %>
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <html>

            <head>
                <title>Post a Job</title>
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
                <h2 class="title">Post a Job</h2>
                <div class="card">
                    <form action="/handleForm" method="post">
                        <label for="postId" class="form-label">Post ID</label>
                        <input type="text" class="form-control" id="postId" name="postId" required>
                        <label for="postProfile" class="form-label">Post Profile</label>
                        <input type="text" class="form-control" id="postProfile" name="postProfile" required>
                        <label for="postDesc" class="form-label">Post Description</label>
                        <textarea class="form-control" id="postDesc" name="postDesc" rows="2" required></textarea>
                        <label for="reqExperience" class="form-label">Required
                            Experience</label>
                        <input type="number" class="form-control" id="reqExperience" name="reqExperience" required>
                        <label for="postTechStack" class="form-label">Tech Stack</label>
                        <select multiple class="form-select" id="postTechStack" name="postTechStack" required>
                            <option value="Java">Java</option>
                            <option value="JavaScript">JavaScript</option>
                            <!-- Additional options -->
                            <option value="Swift">Swift</option>
                            <option value="TypeScript">TypeScript</option>
                            <option value="Go">Go</option>
                            <option value="Kotlin">Kotlin</option>
                            <option value="Rust">Rust</option>
                            <option value="PHP">PHP</option>
                            <option value="HTML5">HTML5</option>
                            <option value="CSS3">CSS3</option>
                            <option value="GraphQL">GraphQL</option>
                            <option value="Raspberry Pi">Raspberry Pi</option>
                            <option value="Arduino">Arduino</option>
                            <option value="IoT (Internet of Things)">IoT (Internet
                                of Things)</option>
                            <option value="Apache Kafka">Apache Kafka</option>
                            <option value="Elasticsearch">Elasticsearch</option>
                            <option value="Unity">Unity</option>
                            <option value="Game Development">Game Development</option>
                            <option value="Vue.js">Vue.js</option>
                            <option value="Angular">Angular</option>
                            <option value="React Native">React Native</option>
                            <option value="Flutter">Flutter</option>
                            <option value="Node.js">Node.js</option>
                            <option value="Express.js">Express.js</option>
                            <option value="Django">Django</option>
                            <option value="Flask">Flask</option>
                            <option value="Ruby on Rails">Ruby on Rails</option>
                            <option value="Laravel">Laravel</option>
                            <option value="TensorFlow">TensorFlow</option>
                            <option value="PyTorch">PyTorch</option>
                            <option value="Kubernetes">Kubernetes</option>
                            <option value="Docker">Docker</option>
                            <option value="Jenkins">Jenkins</option>
                            <option value="AWS (Amazon Web Services)">AWS (Amazon
                                Web Services)</option>
                            <option value="Azure">Azure</option>
                            <option value="Google Cloud">Google Cloud</option>
                            <option value="DevOps">DevOps</option>
                            <option value="Blockchain">Blockchain</option>
                            <option value="Machine Learning">Machine Learning</option>
                            <option value="Artificial Intelligence">Artificial
                                Intelligence</option>
                            <option value="Cybersecurity">Cybersecurity</option>
                            <option value="CISSP (Certified Information Systems Security Professional)">CISSP
                                (Certified Information Systems Security Professional)</option>
                            <option value="CompTIA Security+">CompTIA Security+</option>
                            <option value="Certified Ethical Hacker (CEH)">Certified
                                Ethical Hacker (CEH)</option>
                            <option value="Scrum">Scrum</option>
                            <option value="Agile">Agile</option>
                            <option value="Kanban">Kanban</option>
                            <option value="GraphQL">GraphQL</option>
                            <option value="Vue.js">Vue.js</option>
                            <option value="Angular">Angular</option>
                            <option value="React Native">React Native</option>
                            <option value="Flutter">Flutter</option>
                            <option value="Node.js">Node.js</option>
                            <option value="Express.js">Express.js</option>
                            <option value="Django">Django</option>
                            <option value="Flask">Flask</option>
                            <option value="Ruby on Rails">Ruby on Rails</option>
                            <option value="Laravel">Laravel</option>
                            <option value="TensorFlow">TensorFlow</option>
                            <option value="PyTorch">PyTorch</option>
                            <option value="Kubernetes">Kubernetes</option>
                            <option value="Docker">Docker</option>
                            <option value="Jenkins">Jenkins</option>
                            <option value="AWS (Amazon Web Services)">AWS (Amazon
                                Web Services)</option>
                            <option value="Azure">Azure</option>
                            <option value="Google Cloud">Google Cloud</option>
                            <option value="DevOps">DevOps</option>
                            <option value="Blockchain">Blockchain</option>
                            <option value="Machine Learning">Machine Learning</option>
                            <option value="Artificial Intelligence">Artificial
                                Intelligence</option>
                            <option value="Cybersecurity">Cybersecurity</option>
                            <option value="CISSP (Certified Information Systems Security Professional)">CISSP
                                (Certified Information Systems Security Professional)</option>
                            <option value="CompTIA Security+">CompTIA Security+</option>
                            <option value="Certified Ethical Hacker (CEH)">Certified
                                Ethical Hacker (CEH)</option>
                            <option value="Scrum">Scrum</option>
                            <option value="Agile">Agile</option>
                            <option value="Kanban">Kanban</option>
                            <option value="GraphQL">GraphQL</option>
                            <option value="Raspberry Pi">Raspberry Pi</option>
                            <option value="Arduino">Arduino</option>
                            <option value="IoT (Internet of Things)">IoT (Internet
                                of Things)</option>
                            <option value="Apache Kafka">Apache Kafka</option>
                            <option value="Elasticsearch">Elasticsearch</option>
                            <option value="Unity">Unity</option>
                            <option value="Game Development">Game Development</option>
                            <option value="Swift">Swift</option>
                            <option value="TypeScript">TypeScript</option>
                            <option value="Go">Go</option>
                            <option value="Kotlin">Kotlin</option>
                            <option value="Rust">Rust</option>
                            <option value="PHP">PHP</option>
                            <option value="HTML5">HTML5</option>
                            <option value="CSS3">CSS3</option>
                            <option value="GraphQL">GraphQL</option>
                            <option value="Raspberry Pi">Raspberry Pi</option>
                            <option value="Arduino">Arduino</option>
                            <option value="IoT (Internet of Things)">IoT (Internet
                                of Things)</option>
                            <option value="Apache Kafka">Apache Kafka</option>
                            <option value="Elasticsearch">Elasticsearch</option>
                            <option value="Unity">Unity</option>
                            <option value="Game Development">Game Development</option>
                        </select>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
            </body>

            </html>