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

Before maven build for the first time, need to check the following line in `application.properties` file.
spring.jpa.hibernate.ddl-auto=`create`

After that, always it should be_
spring.jpa.hibernate.ddl-auto=`update`

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

Till now I have implemented: 
1. Create, Get, Delete project API.
2. Spring security (basic). Two users having different roles (USER and ADMIN)

Remaining: 
4. Task related operations and search.
5. REST API validation.
