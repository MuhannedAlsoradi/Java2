
class Manager extends Employee1{
    String department;
    Manager(int id , String name,double salary,String department){
        super(id, name, salary);
        this.department = department;
    }
    @Override 
    void print(){
        super.print();
        System.out.println("Department is "+department);
    }
}