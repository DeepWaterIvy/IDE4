public class MiddleSchool extends School {
    public String getType() {
        return "Middle School";
    }//ends getter for type

    public String getLevel() {
        return "Grades 6-8";
    }//ends getter for Level

    public void describeLevel() {
        System.out.println("This is a middle school serving grades 6 through 8");
    }//ends describeLevel
    public String getAdminInfo(){
        return SchoolConstants.ADMIN_SYS_INFO;
    }//ends getter for AdminInfo constant

    public void describeLevel1() {
        System.out.println("*Montgomery County Middle Schools*" +"\n"
                + SchoolConstants.MONTGOMERY_COUNTY_MIDDLE);
    }//ends describeLevel 1


}//ends Mid/School child class.