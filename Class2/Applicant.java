package Class2;


public class Applicant {
    public String AppName;
    public int AppAge;
    public int AppScore;

    public void setName(String newName) {
        AppName = newName;
    }

    public void setAge(int newAge) {
        AppAge = newAge;
    }

    public void setScore(int newScore) {
        if (newScore >= 80) {
            AppScore = newScore;
        }
    }



    // Kamal, 18, 80%
    // Mamat, 19, 89%
    // Shahrul, 18, 79%
    // Mursyid, 17, 70%
    // Pian, 19, 90%
    // Syafiq, 20, 95%
}