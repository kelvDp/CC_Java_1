package encapConstructors_ex9_1;

public class Customers {
    public String name;
    // public String ssn;

    // Encapsulate this class. Make the ssn read only
    // private String name;
    private String ssn;

    // constructor
    public Customers(String newName) {
        setName(newName);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSSN() {
        return ssn;
    }

}
