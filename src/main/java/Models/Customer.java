package Models;

public class Customer extends Person {

    private int id;
    private String password;

    public Customer(){
        super();
    }

    public Customer(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
