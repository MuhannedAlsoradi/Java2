 class Student extends Person{
   private int successHours;
    Student(int successHours,String name,int no){
        super(no, name);
        this.successHours =successHours;
    }
    @Override
    public void print() {
        System.out.println("Success hours is: "+successHours);
        super.print();
    }
@Override
public boolean equals(Object pr) {
    if(this == pr)
    return true;
    if(pr instanceof Student)
    {
        return (super.equals(pr)&&((Student)pr).successHours==this.successHours);
    }
   else{
    return false;
   }
}
}
