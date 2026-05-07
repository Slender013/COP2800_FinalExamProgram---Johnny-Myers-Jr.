public class TestPeople {
    public static void main(String[] args) {

        Person p = new Person("John Doe", "Street 1", "111-111", "john@email.com");

        Student s = new Student("Alice", "Street 2", "222-222", "alice@email.com",
                Student.FRESHMAN);

        Employee e = new Employee("Bob", "Street 3", "333-333", "bob@email.com",
                "Office 101", 50000, new MyDate(2024, 0, 10));

        Faculty f = new Faculty("Dr. Smith", "Street 4", "444-444", "smith@email.com",
                "Office 202", 80000, new MyDate(2023, 5, 1),
                "9-5", "Professor");

        Staff st = new Staff("Jane", "Street 5", "555-555", "jane@email.com",
                "Office 303", 40000, new MyDate(2022, 3, 15),
                "Administrator");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);
    }
}