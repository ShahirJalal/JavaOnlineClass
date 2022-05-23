package Class2_1;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    
    // Process filtering
    // Input - Process - Output
    // All Applicants (List) - {process()} - Passed Applicants (List) 
    
    private List<Applicant> allApplicants = new ArrayList<>();
    private List<Applicant> passedApplicants = new ArrayList<>();

    public void process() {
        for (int i = 0; i < allApplicants.size(); i++) {
            Applicant applicant = allApplicants.get(i);
            if (applicant.getScore() >= 80) {
                passedApplicants.add(applicant);
            }
        }
    }

    public void setAllApplicants(List<Applicant> applicants) {
        allApplicants = applicants;
    }

    public List<Applicant> getPassedApplicants() {
        return passedApplicants;
    }

}
