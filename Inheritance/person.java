class Person1 {
    int id ;
    String name;
    
Person1(){
 super();
}
Person1(int id,String name){
    this.id=id;
    this.name=name;
}
void print() {
    System.out.println("The id is " +id + " name is "+name);
}
}
