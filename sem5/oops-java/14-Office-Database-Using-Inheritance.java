class Employee {
    String empCode, empName, address, phone;
    double da = 0.1, hra = 0.2, basicPay;

    public Employee(String empCode, String empName, String address, String phone, double basicPay) {
        this.empCode = empCode;
        this.empName = empName;
        this.address = address;
        this.phone = phone;
        this.basicPay = basicPay;
    }

    public double calculateSalary() {
        return basicPay + (da * basicPay) + (hra * basicPay);
    }

    public void display() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Salary: " + calculateSalary());
    }
}
class Teaching extends Employee {
    String subjectSpecialization, designation;

    public Teaching(String empCode, String empName, String address, String phone, double basicPay, String subjectSpecialization, String designation) {
        super(empCode, empName, address, phone, basicPay);
        this.subjectSpecialization = subjectSpecialization;
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject Specialization: " + subjectSpecialization);
        System.out.println("Designation: " + designation);
    }
}
class Office extends Employee {
    String position;

    public Office(String empCode, String empName, String address, String phone, double basicPay, String position) {
        super(empCode, empName, address, phone, basicPay);
        this.position = position;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Position: " + position);
    }
}
class Faculty extends Teaching {
    String researchArea;

    public Faculty(String empCode, String empName, String address, String phone, double basicPay, String subjectSpecialization, String designation, String researchArea) {
        super(empCode, empName, address, phone, basicPay, subjectSpecialization, designation);
        this.researchArea = researchArea;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Area: " + researchArea);
    }
}
class Technical extends Office {
    String techExpertArea;

    public Technical(String empCode, String empName, String address, String phone, double basicPay, String position, String techExpertArea) {
        super(empCode, empName, address, phone, basicPay, position);
        this.techExpertArea = techExpertArea;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tech Expert Area: " + techExpertArea);
    }
}
public class OfficeDatabase {
    public static void main(String[] args) {
        Teaching teachingStaff = new Teaching("T01", "Alice", "123 Street", "555-1234", 50000, "Computer Science", "Professor");
        Office officeStaff = new Office("O01", "Bob", "456 Avenue", "555-5678", 40000, "Manager");
        Faculty facultyStaff = new Faculty("F01", "Charlie", "789 Boulevard", "555-9012", 55000, "Mathematics", "Associate Professor", "Graph Theory");
        Technical technicalStaff = new Technical("Tech01", "David", "321 Road", "555-3456", 45000, "Supervisor", "Networking");

        teachingStaff.display();
        System.out.println();
        officeStaff.display();
        System.out.println();
        facultyStaff.display();
        System.out.println();
        technicalStaff.display();
    }
}
