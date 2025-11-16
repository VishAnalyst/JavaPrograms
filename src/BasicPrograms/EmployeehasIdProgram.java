package BasicPrograms;

public class EmployeehasIdProgram {
    public static void main(String[] args) {
    boolean humanPresent = false;
    boolean hasId = false;
    int age = 16;

    String employee = "EMPLOYEE Login successful";
    String nonEmployee = "Non-EMPLOYEE Login not allowed";
    String callAssistance = "Lookout for ASSISTANCE";
    String fakeAttempt = "Login FAKE";
    String photoTaken = "Photo taken. Smile Please!!!";

    // Check cases in correct order

    if (humanPresent && hasId && age > 18) {
        System.out.println(employee);

    } else if (humanPresent && hasId && age < 18) {
        System.out.println(nonEmployee);
        System.out.println(callAssistance);

    } else if (humanPresent && !hasId) {
        System.out.println(callAssistance);

    } else if (!humanPresent) {
        System.out.println(fakeAttempt);
        System.out.println(photoTaken);
    }
        }
        
 }
