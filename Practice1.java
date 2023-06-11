// Class and Objects <-----------Bank Account System
class BankAccount{
    int acc;
    String name;
    float balance=0;
    
    void insert(int acc,String name,float balance){
        this.acc=acc;
        this.name=name;
        this.balance=balance;
    }
    void display(){
        System.out.println("Account NO:"+acc+" Name:"+name+" balance:"+balance);
    }
    void checkBalance(){
        System.out.println("Your Balance is :"+balance);
    }
    void deposite(float amount){
        balance+=amount;
        System.out.println("Deposited , Your total Balance is Now:"+balance);
    }
    void withdraw(float amount){
        if(amount>balance){
            System.out.println("Not Enough Balance");
        }else{
            balance-=amount;
            System.out.println("WithDraw , Your total Balance is Now:"+balance);
        }
    }
}
class Main{
    public static void main(String[]args){
        BankAccount user1=new BankAccount();
        user1.checkBalance();
        user1.insert(101,"aakash",1000);
        user1.display();
        user1.checkBalance();
        user1.deposite(80000);
        user1.checkBalance();
        user1.withdraw(40000);
    }
}
