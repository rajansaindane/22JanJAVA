package aggrigation;

/**
 * Created by rajan on 2/2/18.
 */
public class Company {

    int deptId;
    String deptName;
    Employee employee;

    Company(int deptId,String deptName,Employee employee)
    {
        this.deptId=deptId;
        this.deptName=deptName;
        this.employee=employee;
    }

    void showData()
    {
        System.out.println("dept id : "+deptId+
                " dept name : "+deptName+
                " employee id : "+employee.id+
                " employee name : "+employee.employeeName+
                " employee city : "+employee.city
        );
    }

    public static void main(String[] args) {
        Employee employee=new Employee(1,"Vivek","Nasik");
        Company company=new Company(101,"Android Developer",employee);
        company.showData();
    }
}
