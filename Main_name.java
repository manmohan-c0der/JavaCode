class Employee{
    int id;
    int salary;
    String name;
    public void setid(int i){
        id=i;
    }
    public void getsal(int val){
        salary=val;
    }
    public void printdetail(){
        System.out.println("My id is : "+id);
        System.out.println("My name is : "+name);
        System.out.println("My salary is : "+salary);
    }
}
public class Main_name{
    public static void main(String[] args){
       System.out.println("Hello, world");
       Employee ms=new Employee();// Initiating a class new object 
       Employee john=new Employee();
        ms.id=9;
        ms.name="manmohan";
        ms.getsal(200000);
        // System.out.println(ms.name);
        // System.out.println(ms.id);
        john.id=2;
        john.name="john singh";
        john.getsal(3400);
        ms.printdetail();
        john.printdetail();
        Employee sm=new Employee();
        sm.setid(34);
        cout<<sm.id<<endl;
    }
}
