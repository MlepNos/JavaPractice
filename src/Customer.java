public class Customer {
    String name;
    double creditLimit;
    String Email;

    public Customer(){
        this("nobody", "nobody@gmail");
    }
    public Customer(String name , String Email){
        this(name ,1000,Email);
    }

    public Customer(String name, double creditLimit , String Email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.Email=Email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return Email;
    }


}
