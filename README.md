# Emergency-Responder-Service
 Emergency responder service using Spring-boot application

---
## Requirements :
1. JDK 17 <br/>
    - If choosing another version of JDK specify in pom.xml file
2. MySQL Database or any other relational Database.
3. Browser to deploy app on localhost
    - As spring is already loaded with Tomcat server with localhost:8080 no need
      to use external server
    - In Intellij idea properties direct opening in Chrome at localhost:8080 settings already created  
4. Maven dependencies are injected directly to avoid tight coupling in codes.
5. Java directory contains all backend part while resources-> templates contains
   frontend as HTML files with bootstrap css & server-side Java script coupled with Thymeleaf template.

---
## Steps for deployment :
**Admin Console :**
1. User and Admin consoles are different.
2. Admin console is spring boot security protected. 
3. General sign in for admin console is :
   - Username : Admin 
   - Password : admin4567
4. You can also add your own password with MySQL database, for that read DB.sql file.
5. Passwords are Bcrypt encrypted for security purposes.
6. It runs on port: 8086 , for that check application.properties of admin.
7. Admin console provides update and delete feature along with chat API control panel.
</br>

**User Console :**
1. Simple interface and it is *not* password protected.
2. It will take users data and store it to database and arrange it according to priority.
3. For security purposes in user console to avoid web attacks *WebSecurityConfigurerAdapter* is included.
4. It runs on port: 2002 , for that check application.properties of user.

---

**General :**
1. All frontend is developed using HTML5, CSS and Bootstrap CSS.
2. Chat API is JS script included in particular Pages.
3. For any Spring-boot application HTML frontend / files is located in resources directory. 

---

## Used tech stacks
<p>
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white/">
<img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
<img src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white"/>
<img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot"/>
<img src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=whit"/>
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/>
<img src="https://img.shields.io/badge/Font_Awesome-339AF0?style=for-the-badge&logo=fontawesome&logoColor=white"/>
</p>
<hr>

[**Chat-API Live**](https://dashboard.tawk.to/login#/chat)
<br>

---

**Testing :**
1. *Security testing* is done using OWASP ZAP tool. [Security Report](https://github.com/ishanjogalekar/Emergency-Responder-Service/blob/main/Reports/ZAP%20Security%20Report.pdf) <br>
2. *Functional and components testing* , HTML pages testing is done using Lighthouse tool. [Components Report](https://github.com/ishanjogalekar/Emergency-Responder-Service/blob/main/Reports/Lighthouse%20Report%20Document.pdf) 
