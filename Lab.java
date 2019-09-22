package Homework15;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lab {

    private List<Employee> employees = Arrays.asList(
            //Employee is the class, employees is the obj
            new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), 68_109.00, "Male"),
            new Employee("Sheryl Sandberg", LocalDate.of(2014, 7, 1), 87_846.00,"Female"),
            new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), 95_035.00, "Male"),
            new Employee("Susan Wojcick", LocalDate.of(2015, 6, 1), 37_210.00, "Female"),
            new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), 48_450.00, "Male"),
            new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), 74_416.00, "Male")
    );

    private <T> void printList(List<T> list) {
        for (Employee employees: employees){
            System.out.println(employees);
        }
    }

    @Test
    public void getEmployeesOver50k() {
        List<Employee> employeesOver50k =
                employees.stream()
                .filter(salary -> salary.getSalary() > 50_000)
                .collect(Collectors.toList());
        employeesOver50k.forEach(employees -> System.out.println("Employee:" + employees.getName() + " Salary:" +  employees.getSalary()));
//        printList(employeesOver50k);
    }

    @Test
    public void getEmployeeNamesHiredAfter2012() {

        List<String> employeeNamesHiredAfter2012 =
                employees.stream()
//                .filter(date -> date.compareTo(LocalDate.of(2012,01,01)))
                    .filter(employees -> employees.getHireDate().isAfter( LocalDate.of(2012,01,01)))
                .map(employees -> employees.getName())
                .collect(Collectors.toList());
        employeeNamesHiredAfter2012.forEach(employees -> System.out.println(employees));
//        printList(employees);
    }

    @Test
    public void getMaxSalary() {
        double max = this.employees.stream()
//        Optional<Employee> maxSalary=

                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);
//                employees.stream()
//                        .mapToDouble(Employee):: getSalary
//                .max
//                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Max Salary $" + max);
//        System.out.println("Employee with the max is " +  (maxSalary.isPresent()? maxSalary.get():"Not Applicable"));
//        System.out.println("Max:" + max);

    }

    @Test
    public void getMinSalary() {
        double min = this.employees.stream()
          .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0);
        System.out.println("Min Salary $" + min);
    }

    @Test
    public void getAverageSalaries() {
        double averageMale = this.employees.stream()
                .filter( employees -> employees.getGender().startsWith("M"))
               .mapToDouble((Employee::getSalary)).average()
                .orElse(0);
        double averageFemale = this.employees.stream()
                .filter( employees -> employees.getGender().startsWith("F"))
                .mapToDouble((Employee::getSalary)).average()
                .orElse(0);

        System.out.println("Averages: Male $" + averageMale + " Female $" + averageFemale);
    }

    @Test
    public void getMaximumPaidEmployee() {
        Optional<Employee> highest = this.employees.stream()
//                .map(employees -> employees.getSalary())
                .reduce((Employee a,Employee b)-> a.getSalary() < b.getSalary() ? b : a);
            if(highest.isPresent()) {
                System.out.println(highest.get());
            }
    }
}

