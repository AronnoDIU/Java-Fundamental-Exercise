package CollectionsFramework.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Reversing an arraylist of user-defined objects: An Employee class is
 * created for creating user defined objects with employeeID, employeeName,
 * departmentName as class variables which are initialized in the constructor.
 * An arraylist is created that takes only Employee(user defined) Objects.
 * These objects are added to the arraylist using add() method.
 * The arraylist is reversed using In-built reverse() method of Collections class.
 * The printElements() static method is used only to avoid writing one more
 * class in the program.
 */
public class ReverseArrayListEx4 {
    public static void main(String[] args) {
        // Declaring arraylist without any initial size
        ArrayList<Employee> employeeArrayList = getEmployees();

        System.out.print("Elements before reversing: ");
        printElements(employeeArrayList);

        // Collections.reverse method takes a list as a
        // parameter and reverse the list
        Collections.reverse(employeeArrayList);
        System.out.print("\nElements after reversing: ");
        printElements(employeeArrayList);
    }

    private static ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        // Creating user defined objects
        Employee emp1 =
                new Employee(123, "Rama", "Facilities");
        Employee emp2 =
                new Employee(124, "Lakshman", "Transport");
        Employee emp3 =
                new Employee(125, "Ravan", "Packing");

        // Appending all the objects for arraylist
        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);
        return employeeArrayList;
    }

    // Iterate through all the elements and print
    static void printElements(ArrayList<Employee> employeeArrayList) {
        for (Employee employee : employeeArrayList) {
            System.out.print("\n EmpID:" + employee.empID + ", EmpName:"
                    + employee.empName + ", Department:" + employee.deptName);
        }
    }
}

class Employee {
    int empID;
    String empName;
    String deptName;

    // Constructor for initializing the class variables
    public Employee(int empID, String empName, String deptName) {
        this.empID = empID;
        this.empName = empName;
        this.deptName = deptName;
    }
}

/*Expected Output:

Elements before reversing:
 EmpID:123, EmpName:Rama, Department:Facilities
 EmpID:124, EmpName:Lakshman, Department:Transport
 EmpID:125, EmpName:Ravan, Department:Packing
Elements after reversing:
 EmpID:125, EmpName:Ravan, Department:Packing
 EmpID:124, EmpName:Lakshman, Department:Transport
 EmpID:123, EmpName:Rama, Department:Facilities

* */