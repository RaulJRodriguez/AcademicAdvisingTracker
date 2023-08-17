import javax.swing.JOptionPane;

public class AdvisorAssignmentSystem {
    private V2_Advisor[] advisors;
    private int advisorCount;

    public AdvisorAssignmentSystem() {
        advisors = new V2_Advisor[10];
        advisorCount = 0;
    }

    public void addAdvisor(V2_Advisor advisor) {
        advisors[advisorCount] = advisor;
        advisorCount++;
    }

    public void run() {
        JOptionPane.showMessageDialog(null, "Welcome to the Advisor Assignment System program!!! \nManage advisors and their advisees with this Java GUI program :) \n-Input details for up to 10 advisors, each with their GNumber, first name, last name, and salary.\n-For each advisor, add information for up to 30 advisees including their GNumber, first name, last name, class level, and major.\n-Display a comprehensive report showcasing advisor assignments and their corresponding advisees using a JOptionPane dialog.");
        do{
            String gNumber = JOptionPane.showInputDialog("Enter advisor GNumber");
            if (gNumber.equalsIgnoreCase("end")) {
                break;
            }

            String firstName = JOptionPane.showInputDialog("Enter advisor first name:");
            String lastName = JOptionPane.showInputDialog("Enter advisor last name:");

            double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter advisor salary:"));

            V2_Advisor advisor = new V2_Advisor(gNumber, firstName, lastName, salary);

            addAdvisees(advisor);

            addAdvisor(advisor);
            String addAnother = JOptionPane.showInputDialog("Do you want to add another advisor? (yes/no):");
        if (addAnother.equalsIgnoreCase("no")) {
            break;
        }
        }while(advisorCount < 10);  

        printReport();
    }

    private void addAdvisees(V2_Advisor advisor) {
    int filledPositions = 0;
        while (filledPositions < 30) {
            String gNumber = JOptionPane.showInputDialog("Enter advisee GNumber for advisor " + advisor.getFirstName() + " " + advisor.getLastName() + " or 'end' to finish:");
            if (gNumber.equalsIgnoreCase("end")) {
                break;
            }

            String firstName = JOptionPane.showInputDialog("Enter advisee first name:");
            String lastName = JOptionPane.showInputDialog("Enter advisee last name:");
            String classLevel = JOptionPane.showInputDialog("Enter advisee class level:");
            String major = JOptionPane.showInputDialog("Enter advisee major:");

            V2_Student advisee = new V2_Student(gNumber, firstName, lastName, classLevel, major);
            advisor.addAdvisee(advisee);
            filledPositions++;
        }
    }

    private void printReport() {
        StringBuilder report = new StringBuilder();
        report.append("Advisor Assignments Report:\n\n");

        for (int i = 0; i < advisorCount; i++) {
            V2_Advisor advisor = advisors[i];
            report.append("Advisor: ").append(advisor.getFirstName()).append(" ").append(advisor.getLastName()).append("\n");
            report.append("Advisees:\n");
            for (V2_Student advisee : advisor.getAdvisees()) {
               if (advisee != null) {
                report.append("- ").append(advisee.getFirstName()).append(" ").append(advisee.getLastName()).append(" (").append(advisee.getGNumber()).append(")\n");
                }
            }
            report.append("\n");
        }

        JOptionPane.showMessageDialog(null, report.toString());
    }

    public static void main(String[] args) {
        AdvisorAssignmentSystem assign = new AdvisorAssignmentSystem();
        assign.run();
    }
}