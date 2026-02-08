### HOLA MUNDO
```
markthepage
├─ .mvn
│  └─ wrapper
│     └─ maven-wrapper.properties
├─ mvnw
├─ mvnw.cmd
├─ pom.xml
├─ README.md
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ markthepage
   │  │        ├─ application
   │  │        │  ├─ book
   │  │        │  ├─ question
   │  │        │  ├─ review
   │  │        │  └─ user
   │  │        │     └─ CreateUserService.java
   │  │        ├─ domain
   │  │        │  ├─ book
   │  │        │  ├─ question
   │  │        │  ├─ review
   │  │        │  └─ user
   │  │        │     ├─ exception
   │  │        │     │  ├─ EmailAlreadyExistsException.java
   │  │        │     │  ├─ InvalidPasswordException.java
   │  │        │     │  └─ UsernameAlreadyExistsException.java
   │  │        │     └─ User.java
   │  │        ├─ infrastructure
   │  │        │  ├─ book
   │  │        │  ├─ GlobalExceptionHandler.java
   │  │        │  ├─ question
   │  │        │  ├─ review
   │  │        │  └─ user
   │  │        │     ├─ dtos
   │  │        │     │  ├─ CreateUserRequest.java
   │  │        │     │  └─ ErrorResponse.java
   │  │        │     └─ UserController.java
   │  │        ├─ interfaces
   │  │        │  └─ http
   │  │        │     ├─ book
   │  │        │     ├─ question
   │  │        │     ├─ review
   │  │        │     └─ user
   │  │        └─ MarkThePageApplication.java
   │  └─ resources
   │     ├─ application.properties
   │     ├─ static
   │     └─ templates
   └─ test
      └─ java
         └─ com
            └─ markthepage
               └─ markthepage
                  └─ MarkThePageApplicationTests.java

```