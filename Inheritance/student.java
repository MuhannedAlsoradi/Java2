

class Student1 extends Person1{
    double avg;
    Student1(int id,String name,double avg){
        super(id, name);
        this.avg=avg;
    }
    @Override
    void print(){
        super.print();
        System.out.println("The average is :"+avg);
    }
}
