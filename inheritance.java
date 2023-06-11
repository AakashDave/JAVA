class Employee{
    float salary=8000;
}
class Developer extends Employee {
    float bonus=1000;
    public static void main(String[] args) {
        Developer dev=new Developer();
        System.out.println("Developers Salary is:"+dev.salary);
        System.out.println("Developers Bonus is:"+dev.bonus);

    }
}
