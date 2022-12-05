# Spring Web
## Libraries
- Spring Web

## Learning Outcomes
### 1. Set up the project
Use IDE (IntellJ) to set up the project (Suggested)
Download configuration from [Spring.io](https://start.spring.io/)
### 2. Create the first API
Code:
```
@RestController
@RequestMapping("/test")
public class Helloworld {
    @GetMapping("/helloworld")
    public String helloworld(){
        return "Hello World!!!";
    }
}
```
### 3. Understand the file system of Spring
e.g. 
- Java
  - controller
  - MainApplication
  
 ### 4. Test API
 http://localhost:8080/test/helloworld
 
 ### 5. Remarks
 You can download note.docx in this project to see more details
 
