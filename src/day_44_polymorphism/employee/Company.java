package day_44_polymorphism.employee;

import day_44_polymorphism.employee.Developer;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Tester("Anam Zahra", "SDET", 190_000));
        allEmployees.add(new Tester("Husna","SDET",200_000));
        allEmployees.add(new Developer("James", "SDET", 100000));
        allEmployees.add(new Developer("Tatsiana Abramova", "Lead Developer", 500_000));
        allEmployees.add(new Developer("Baz", "Developer", 300000));

        double biggestSalary = allEmployees.get(0).salary; // default salary

        for(Employee each : allEmployees){
            if(each.salary > biggestSalary){
                biggestSalary = each.salary;
            }
        }

        System.out.println(biggestSalary);

        ArrayList<Tester> allTesters = new ArrayList<>();
        ArrayList<Developer> allDevelopers = new ArrayList<>();

        for(Employee each : allEmployees){
            if(each instanceof Tester){
                allTesters.add((Tester)each);
            } else if (each instanceof Developer){
                allDevelopers.add((Developer)each);
            }
        }

        System.out.println(allTesters);
        System.out.println(allDevelopers);


    }
}
