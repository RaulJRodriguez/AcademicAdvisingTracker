public class V2_Person {
    private String gNumber;
    private String firstName;
    private String lastName;

    public V2_Person() {

    }

    public V2_Person(String gNumber, String firstName, String lastName) {
        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First name must be provided");
        }
        if (lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Last name must be provided");
        }
        if (gNumber == null || gNumber.equals("")) {
            throw new IllegalArgumentException("GNumber name must be provided");
        }

        this.gNumber = gNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {return this.firstName;}

    public String getGNumber() {return this.gNumber;}

    public String getLastName() {return this.lastName;}

    public String hello() {
        return this.getFirstName() + " " + this.getLastName() + " says hello!";
    }

    public String goodbye() {
        return this.getFirstName() + " " + this.getLastName() + " says goodbye!";
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First name must be provided");
        }
        this.firstName = firstName;
    }

    public void setGNumber(String gNumber) {
        if (gNumber == null || gNumber.equals("")) {
            throw new IllegalArgumentException("GNumber name must be provided");
        }
        this.gNumber = gNumber;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Last name must be provided");
        }
        this.lastName = lastName;
    }

    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " (" + this.getGNumber() + ")";
    }
}



