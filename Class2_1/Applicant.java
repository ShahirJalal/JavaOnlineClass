package Class2_1;

public class Applicant {

    private String AppName;
    private int AppAge;
    private int AppScore;

    public void setName(String newName) {
        AppName = newName;
    }

    public void setAge(int newAge) {
        AppAge = newAge;
    }

    public void setScore(int newScore) {
        AppScore = newScore;
    }

    public String getName() {
        return AppName;
    }

    public int getAge() {
        return AppAge;
    }

    public int getScore() {
        return AppScore;
    }


    // Kamal, 18, 80%
    // Mamat, 19, 89%
    // Shahrul, 18, 79%
    // Mursyid, 17, 70%
    // Pian, 19, 90%
    // Syafiq, 20, 95%
}
