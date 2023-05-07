public class HighSchool extends School {
    public String getType() {
        return "High School";
    }//ends getter

    public String getLevel() {
        return "Grades 9-12";
    }//ends getter Level

    public void describeLevel() {
        System.out.println("This is a high school serving grades 9 through 12");
    }//ends describeLevel
    public String getAdminInfo(){
        return SchoolConstants.ADMIN_SYS_INFO;
    }//ends getter for constant
    public void describeLevel1() {
        System.out.println("*Montgomery County High Schools*" +"\n"
                + SchoolConstants.MONTGOMERY_COUNTY_HIGH);
    }//ends describeLevel1 for constant 2


}//ends High/School child class

