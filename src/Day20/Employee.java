package Day20;

// Class representing an Employee
public class Employee {
    private String name;
    private String email;
    private double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }
}

// Class responsible for generating PDF reports
 class PdfReportGenerator {
    public void generatePdfReport(Employee employee) {
        // Code to generate PDF report for the employee
        System.out.println("Generating PDF report for: " + employee.getName());
        // Actual PDF generation logic would go here
    }
}

// Class responsible for sending emails
 class EmailSender {
    public void sendEmail(Employee employee) {
        // Code to send email to the employee
        System.out.println("Sending email to: " + employee.getEmail());
        // Actual email sending logic would go here
    }
}

// Main class to demonstrate functionality
 class Main {
    public static void main(String[] args) {
        // Create an Employee instance
        Employee employee = new Employee("John Doe", "john.doe@example.com", 50000);

        // Create a PdfReportGenerator instance and generate a report
        PdfReportGenerator reportGenerator = new PdfReportGenerator();
        reportGenerator.generatePdfReport(employee);

        // Create an EmailSender instance and send an email
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(employee);
    }
}
