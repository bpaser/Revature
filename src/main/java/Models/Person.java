package Models;

public class Person {

    private int id;
    private String name;
    private String password;
    private type pertype;


    public Person(){
        this.name = "";
        this.id = 0;
        this.password = "";
        pertype = null;
    }

    public Person(int id, String name, String password, type pertype) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.pertype = pertype;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPertype(type pertype) {
        this.pertype = pertype;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public type getPertype() {
        return pertype;
    }

    public void displayInfo(){
        System.out.println(getId() + " " + getName() + " " + getPassword() + " " + getPertype());
    }
}
