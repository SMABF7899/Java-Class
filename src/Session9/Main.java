package Session9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Seyed Mohammad Ali");
        employee.setLastName("Bani Fatemi");
        employee.setMonthlySalary(3000000);
        //System.out.println("First Name : " + employee.getFirstName() + "\nLast Name : " + employee.getLastName() + "\nMonthly Salary : " + employee.getMonthlySalary() + "\nYearly Salary : " + employee.getMonthlySalary() * 12);

        Author author = new Author("Milad Nami Karamshahloo", "miladnami@outlook.com", 'm');
        author.setEmail("miladnami@outlook.com");
        //System.out.println("Name : " + author.getName() + "\nEmail : " + author.getEmail() + "\nGender : " + author.getGender());

        Author hafez = new Author("Hafez Shirazi", "Hafez110@gmail.com", 'm');
        Author parvin = new Author("Parvin Etesami", "Parvin110@gmail.com", 'f');

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(parvin);
        authors.add(hafez);

        Book divanH = new Book("Diven Hafez", authors, 15000);
        Book divanP = new Book("Divan Parvin", authors, 20000);
        //Book harryPotter = new Book("Harry Potter", new Author("jj", "jj110@gmail.com", 'm'), 5000);

        System.out.println(parvin.getEmail());
        System.out.println(authors.get(0).getEmail());
    }
}
