public class V2_Student extends V2_Person {
    private String classLevel;
    private String major;

    public V2_Student() {
    }

    public V2_Student(String gNumber, String firstName, String lastName, String classLevel, String major) {
        super(gNumber, firstName, lastName);
        if (classLevel == null || classLevel.equals("")) {
            throw new IllegalArgumentException("Class level must be provided");
        }
        if (major == null || major.equals("")) {
            throw new IllegalArgumentException("Major must be provided");
        }

        this.classLevel = classLevel;
        this.major = major;
    }

    public String getClassLevel() {return this.classLevel;}

    public String getMajor() {return this.major;}

    public void study() {
        //Code inside method
    }
}
