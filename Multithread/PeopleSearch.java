import java.util.Scanner;
class Person {
    private String aadharNumber;
    public Person(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
    public String getAadharNumber() {
        return aadharNumber;
    }
}
class Student extends Person {
    private String name;
    private int rollNumber;
    public Student(String name, int rollNumber, String aadharNumber) {
        super(aadharNumber);
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
}
class Employee extends Person {
    private String name;
    private String employeeId;
    public Employee(String name, String employeeId, String aadharNumber) {
        super(aadharNumber);
        this.name = name;
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public String getEmployeeId() {
        return employeeId;
    }
}
public class PeopleSearch {
    public static void main(String[] args) {
        // Creating an array of people with students and employees
        Person[] people = new Person[5];
        people[0] = new Student("Biswajeet", 26, "440499615781");
        people[1] = new Student("Diptesh", 05, "440499874563");
        people[2] = new Employee("Dinu", "12", "12345607892");
        people[3] = new Employee("Saswata", "1", "789456123025");
        people[4] = new Student("Sanjay", 15, "996157824569");
        // Searching for a person based on AADHAR number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter AADHAR number: ");
        String searchAadharNumber = scanner.nextLine();
        boolean found = false;
        for (Person person : people) {
            if (person.getAadharNumber().equals(searchAadharNumber)) {
                if (person instanceof Student) {
                    Student student = (Student) person;
                    System.out.println("Student Details:");
                    System.out.println("Name: " + student.getName());
                    System.out.println("Roll Number: " + student.getRollNumber());
                } else if (person instanceof Employee) {
                    Employee employee = (Employee) person;
                    System.out.println("Employee Details:");
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Employee ID: " + employee.getEmployeeId());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Person not found for the given AADHAR number.");
        }
        scanner.close();
    }
}