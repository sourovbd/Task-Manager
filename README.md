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

For testing REST API I hvae used Postman API testing tool.   
For getting API response need to create user at first. I have added a script for adding users.   
Location: `resources/scripts/user.sql`   

Till now, following API's are availale. I shall add remaining API's within gradually within a short time.    
`/user/save`,  
`/project/save`,  
`/project/getAll`,  
`/delete/{projectId}`  

Credentials:

USER:
username: user
password: 1234

ADMIN
username: sourov
password: 1234
