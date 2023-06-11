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


// HAS-A Relation
public class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  
public class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Emp e=new Emp(111,"varun",address1);  
Emp e2=new Emp(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  
