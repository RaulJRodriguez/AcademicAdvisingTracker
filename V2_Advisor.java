public class V2_Advisor extends V2_Person {
    private V2_Student[] advisees;
    private double salary;
    public static final double MIN_SALARY = 0.0;

    public V2_Advisor() {
        advisees = new V2_Student[30];
    }

    public V2_Advisor(String gNumber, String firstName, String lastName, double salary) {
        super(gNumber, firstName, lastName);
        if (salary <= MIN_SALARY) {
            throw new IllegalArgumentException("Salary must be provided");
        }

        advisees = new V2_Student[30];
        this.salary = salary;
    }

    public double getSalary() {return this.salary;}

    public void addAdvisee(V2_Student advisee) {
        for (int i = 0; i < advisees.length; i++) {
            if (advisees[i] == null) {
                advisees[i] = advisee;
                break;
            }
        }
    }

    public V2_Student[] getAdvisees() {
        return this.advisees;
    }
}


