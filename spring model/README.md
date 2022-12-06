# Spring Web
## Libraries
- Spring Web
- Lombok

## Learning Outcomes
### 1. Use Lombok to create a model quickly
Usually an input model is an immutable object in java
```
@Data
@AllArgsConstructor
public class OutputOb {
    private String message;
    private int dummy;
}

```
### 2. Display Output with Json Format
```
@GetMapping("/out")
public OutputOb output(){
    OutputOb out = new OutputOb("This is a message", 123456789);
    return out;
}
```

### 3. Create Input Object and Set it to Json Input
```
@Data
public class InOb {
    private String message;
    private String dummy;

    public InOb(@JsonProperty("message") String message, @JsonProperty("dummy") String dummy) {
        this.message = message;
        this.dummy = dummy;
    }
}
```
  
 ### 4. Two Methods to Get Input from users
 #### 4.1. Receiving Data with Json Format
 ```
@PostMapping("/in")
public InOb input(@RequestBody InOb inOb){
    return inOb;
}
 ```

#### 4.2 Input Message with Link (Request Body)
```
@GetMapping("/query/{dummy}")
public String query(@PathVariable("dummy") String dummy){
    return dummy;
}
```

### 5. Test with Postman
- Postman isn't a good method to test your API but it support you to test the service quickly
- [Click here to see official documentation of Postman](https://learning.postman.com/docs/getting-started/introduction/)

Example:


## File System
e.g. 
- Java
  - controller
  - model
  - MainApplication
 
