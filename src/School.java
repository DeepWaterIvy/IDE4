abstract public class School {
    private int enrollment;

    public abstract String getType();
    public abstract String getLevel();
    public  abstract String getAdminInfo();

    public abstract void describeLevel();
    public abstract void describeLevel1();


    public void setEnrollment(int students) {
        enrollment = students;
    }//ends setter for enrollment

    public int getEnrollment() {
        return enrollment;
    }//ends getter got enrollment
}//ends abstract class