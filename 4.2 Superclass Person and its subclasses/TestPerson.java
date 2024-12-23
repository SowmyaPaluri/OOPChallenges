public class TestPerson {
    public static void main(String[] args) {
        // Test Person class
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person);
        person.setAddress("456 Elm St");
        System.out.println("Updated address: " + person.getAddress());

        // Test Student class
        Student student = new Student("Alice", "789 Pine St", "Computer Science", 2024, 15000);
        System.out.println(student);
        student.setProgram("Mathematics");
        student.setYear(2025);
        student.setFee(12000);
        System.out.println("Updated student: " + student);

        // Test Staff class
        Staff staff = new Staff("Bob", "321 Oak St", "High School", 5000);
        System.out.println(staff);
        staff.setSchool("Middle School");
        staff.setPay(5500);
        System.out.println("Updated staff: " + staff);
    }
}
