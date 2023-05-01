public class student{
    int roll;
    String name;
    double score;
    public static void main(String args[]){
        student std1 = new student(1,"Anupama Halder",78.9);
        student std2 = new student(5,"Priya Nath");
        student std3 = new student(17);
        student std4 = new student();
        student std5 = new student();
        std1.copyobj(std5);
        std1.display();
        std2.display();
        std3.display();
        std4.display();
    }
    student(){}
    student(int roll,String name,double score){
        this.roll = roll;
        this.name = name;
        this.score = score;
    }
    student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
    student(int roll){
        this.roll = roll;
    }
    void display(){
        System.out.println("The value of atrributes are--");
        System.out.println("Roll number :"+roll);
        System.out.println("Name of student :"+name);
        System.out.println("Total score :"+score);
    }
    void copyobj(student obj){
        obj.roll = this.roll;
        obj.name = this.name;
        obj.score = this.score;
    }
}