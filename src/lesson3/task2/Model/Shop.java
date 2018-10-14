package lesson3.task2.Model;

import lesson3.task2.Comparator.NameComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    private String name;
    private ArrayList<Department> departments;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments() {
        this.departments = new ArrayList<>();
        departments.add(new Department("Electronics", "Tools", "Sells", 100));
        departments.add(new Department("SuperMarket", "Food", "Sells", 2));
        departments.add(new Department("NewPost", "Letters and Post", "Sending and getting", 3));
        departments.add(new Department("RepairCenter", "Spare parts", "Selling and repearing", 4));
    }

    public void departmentCreations() {
        System.out.println("Create new department");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String nameOfDepartment = scanner.nextLine();
        System.out.println("Enter the type of sells: ");
        String typeOfSells = scanner.nextLine();
        System.out.println("Enter the type of service: ");
        String service = scanner.nextLine();
        System.out.println("Position will be added automatically");
        int position = departments.size()+1;
        departments.add(new Department(nameOfDepartment, typeOfSells, service, position));
    }

    public void deleteDepartment(String name) {
        for (Department department : departments) {
            if (department.nameOfDepartment.equals(name)) {
                departments.remove(department);
            }
        }
    }

    public void sortDepartmentByTypeOfSells() {
        departments.sort(new NameComparator());
        for (Department department:departments){
            System.out.println(department);
        }
    }

    public void showShop() {
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public class Department {
        private String nameOfDepartment;
        private String typeOfSells;
        private String service;
        private int position;

        public Department(String nameOfDepartment, String typeOfSells, String service, int position) {
            this.nameOfDepartment = nameOfDepartment;
            this.typeOfSells = typeOfSells;
            this.service = service;
            this.position = position;
        }

        public String getNameOfDepartment() {
            return nameOfDepartment;
        }

        public void setNameOfDepartment(String nameOfDepartment) {
            this.nameOfDepartment = nameOfDepartment;
        }

        public String getTypeOfSells() {
            return typeOfSells;
        }

        public void setTypeOfSells(String typeOfSells) {
            this.typeOfSells = typeOfSells;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        @Override
        public String toString() {
            return "Department: " +
                    "nameOfDepartment is " + nameOfDepartment +
                    ", type of goods: " + typeOfSells +
                    ", type service: " + service +
                    ", position at the shop's map - " + position;
        }
    }
}
