class Employee{
    int eid;
    String ename;
    int esalary;
    public void details(){
        System.out.println("My name is "+ename+" and my salary is "+esalary);
    }
}
public class OopsSecondDemo {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.eid=101;
        emp.ename="Spoorthy";
        emp.esalary=250000;
        emp.details();

    }
}
