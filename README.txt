
This is simple microservice created just to facilitate the authentication using user name and password.
The microservice is using mysql as a database and only uses a single schema called - authenticator, where there will be only one table called
User which should at least have one row.

The rest of the other things you can see in application.properties and create your schema.

There are two rest point which are exposed.
1. For authentication which will post the data (user name and password) and token will be return if the user name and password is correct.
2. Second rest point is just for illustration that if we have the token then you can access that HTTP request. Thats all.


You can read more about this on - https://dzone.com/articles/spring-boot-security-json-web-tokenjwt-hello-world
And https://jwt.io/

Please share your ideas or correct the code wherever you feel. Happy to learn more from you!
