# Task-Manager-REST-API  

This is a REST API based project. No frontend is added yet.   
Technology used:   
#Java 11  
#Spring Boot  
#Spring Security  
#MySql     
#Maven  
So, after cloning need to maven build and then run.  

Build Spring Boot Project with Maven  
`mvn clean install`
 
Run Spring Boot app using Maven:  
`mvn spring-boot:run`

Before maven build for the first time,    
1. Create a database named `taskmanager` in mysql.    
2. After that, make the following configuration value as `create` in `application.properties` file for running the app for the first time ever.  

`spring.jpa.hibernate.ddl-auto=create`    

Then make the value as `update`. This should remain same always.    

`spring.jpa.hibernate.ddl-auto=update`    

For testing REST API I hvae used Postman API testing tool.     
For getting API response need to create user at first. I have added a script for adding users.   
Location: `resources/scripts/user.sql`   

Till now, following API's are availale(also workable). I shall add remaining API's within gradually within a short time. 

User is permitted for the following actions:
Create project : `/project/save`,    
Get all projects : `/project/getAll`,     
Delete project : `/delete/{projectId}`     
  



Admin is permitted for the following actions:  
Save user : `/user/save`,     
Create project : `/project/save`,    
Get all projects : `/project/getAll`,     
Delete project : `/delete/{projectId}`       

API testing format link:  
https://docs.google.com/document/d/1se70zAJEeJZa2weVtX6TO2eH3hOccP6EVSxwDvMebt4/edit?usp=sharing   

Credentials:  

USER:  
username: user  
password: 1234  

ADMIN  
username: admin  
password: 1234  

Till now I have implemented:   
1. Create, Get, Delete project REST API.  
2. Spring security (basic). Two users having different roles (USER and ADMIN).    
3. Authentication credentials is stored into DB.
4. A JsonUtil class is added for data interchange in json format.
5. Automatic DB creation during application startup.
6. API test format via Postman is added.
 
Remaining:  
1. Task related operations and search.  
2. REST API validation.  
3. JSON form data interchange.

