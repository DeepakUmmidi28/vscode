import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double Salary;

    Employee(int i,String n, double s){
        this.Salary=s;
        this.id=i;
        this.name=n;
    }
    Employee() {}
        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public double getSalary(){
            return Salary;
        }
    }
    
    class Driver{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Employee emp[]=new Employee[2]; 
            for(int i=0;i<emp.length;i++){
                System.out.print("Enter ID : ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name : ");
                String name=sc.next();
                sc.nextLine();
                System.out.print("Enter Salary : ");
                double salary=sc.nextDouble();
                sc.nextLine();
                emp[i]=new Employee(id, name, salary);
            }
            // System.out.println(Driver.getAvgSalary(emp));
            Employee arr[]=findSecondHighestSalary(emp, 1);
            for (Employee employee : arr) {
                System.out.println(employee.getName());
            }
        }
    
        public static double getAvgSalary(Employee s[]){
            double res=0.0;
            
            for(int i=0;i<s.length;i++){
                res+=s[i].getSalary();
            }
            // res=res/s.length;
            res/=s.length;
            return res;
        }
    
        public static Employee[] findSecondHighestSalary(Employee employees[],int id){
            Employee arr[]=new Employee[0];
            int count=0;
            for(int i=0;i<employees.length;i++){
                if(employees[i].getId()==id){
                    arr=Arrays.copyOf(arr,arr.length+1);
                    arr[arr.length-1]=employees[i];
                }
            }

            return arr;
    }
}
