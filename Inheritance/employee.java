class Employee1 extends Person1{
    double salary;
    Employee1(int id , String name , double salary){
        super(id, name);
        this.salary = salary;
    }
    @Override
    void print(){
        super.print();
        System.out.println("The salary is: "+salary);
    }
}