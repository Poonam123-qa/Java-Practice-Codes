package NestedClasses;

public class University {

    public static class Department{

         String departmentName;
         int facultyCount;

        Department(String deptName, int fcount) {
            // Constructor to initialize Department
            this.departmentName=deptName;
            this.facultyCount=fcount;
        }

        public void displayInfo() {
            // Method to display department information
            System.out.println("Department: " + departmentName);
            System.out.println("Number of Faculty Members: " + facultyCount);
        }
    }
    public static void main(String args[]){
        // Creating an instance of the static nested class Department
        University.Department UP=new University.Department("IT", 10);  //First outer class then inner class name

        // Calling the displayInfo method
        UP.displayInfo();
    }
}
