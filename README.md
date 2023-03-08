#Dokumentation
Dette er min egen dokumentation af Java Webstack.
Vi skal lave et internet og vil burge denne
dokumentation, til at bedre kunne huske hvad vi lavede.
- 06-03-2023
## Start af et nyt webprojekt
1. Opet nyt projekt i IntlliJ 2021.3
2. Java + Maven
3. Servlet Depdincies
4. Vælg Java EE projektskabelon
5. Opsæt Tomcat i run.
![img.png](img/img.png)
6. Tjek om tomcat kører i "Tjenester", i tilfælde af at prorammet ikke kører.

## Arkitektur
Vi anvender en slags MVC-pattern.

![img.png](img/img_1.png)
####MVC
- M(odel) - Entiteter, hjælpe-metoder og klasser. Business-logic
- V(iew) - JSP og frontend (css, bootstrap mm.)
- C(ontrol) - Servlets (tjenere)

Husk! View og model må ikke tale sammen, medmindre det er via controlleren.
 
## Opret Git repo
Find først din mappe i din stifinder, og højreklik på den ved at åbne den med "Git Bash Here"
```shell
git init
git add .
git commit -m "first commit"
git remote add origin https://github.com/Kussemar/intranet.git
git push -u origin main
genindlæs siden :-)

Tilføj nye ting
git add .
git commit -m "commit"
git push -u origin main
genindlæs siden :-)
```

## Scopes (virkefelter)
- request scope: gemme objekter: request.setAttribute(key, value)
- session scope: gemme objekter: session.setAttribute(key, value)
- application scope (context)

## Sende form-parametere fra en jsp-side til en servlet
I servletten: request.getParameter(key)
I jsp: lav en form og sæt name = "paramter" for de værdier som skal sende afsted over http.
```html
<form action="Login" method="post">
    Login: <input type="text" name="login"/> <br/>
    Password: <input type="password" name="password"/><br/>
    <button type="submit">Log ind</button>
    <br/>
</form>
```

```java
String login = request.getParameter("login");
        String password = request.getParameter("password");
```
## Forward til websider
```java
request.getRequestDispatcher("index.jsp").forward(request, response);
```
## JSTL
Husk at sætte JSTL dependency i pomfil:
```xml
  <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
            <version>1.2</version>
        </dependency>
```
Indsæt følgende i toppen af jsp-siden:
```html
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```
- if
- forEach
## Expression Language
- ${}