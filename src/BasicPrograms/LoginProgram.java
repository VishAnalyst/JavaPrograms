package BasicPrograms;

public class LoginProgram {
    public static void main(String[] args) {
        String email = "test@gmail.com";
        String password = "abc@1234";
        
        if (email.equals("test@gmail.com") && password.equals("abc@123")) {
            System.out.println("LOGIN SUCCESSFUL");
        }else {
            System.out.println("Login FAILED");
        }
    }
    
}
