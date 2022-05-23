package Class2_1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        Applicant app1 = new Applicant();
        app1.setName("Kamal");
        app1.setAge(18);
        app1.setScore(80);

        Applicant app2 = new Applicant();
        app2.setName("Mamat");
        app2.setAge(19);
        app2.setScore(89);

        Applicant app3 = new Applicant();
        app3.setName("Shahrul");
        app3.setAge(18);
        app3.setScore(79);

        Applicant app4 = new Applicant();
        app4.setName("Mursyid");
        app4.setAge(17);
        app4.setScore(70);

        Applicant app5 = new Applicant();
        app5.setName("Pian");
        app5.setAge(19);
        app5.setScore(90);

        Applicant app6 = new Applicant();
        app6.setName("Syafiq");
        app6.setAge(20);
        app6.setScore(95);

        List<Applicant> allApplicants = new ArrayList<>();
        allApplicants.add(app1);
        allApplicants.add(app2);
        allApplicants.add(app3);
        allApplicants.add(app4);
        allApplicants.add(app5);
        allApplicants.add(app6);

    }

    /**
     * 
     * List of Applicants to enroll a university.
     * Only Math subject with score above 80% should pass the interview.
     * Store a new list of Applicants that passed the interview.
     * 
     * Class Applicant
     * Properties: Name, Age, MathScore
     * 
     * [Applicant, Applicant, etc...]
     * 
     * 
     * Applicant (single people)        DONE
     * Interview (process filtering)    DONE
     * MainClass (run system)           DONE
     * 
     */

}
