public class Central extends School {
    public String getType() {
        return "Central School";
    }//ends getter getType()

    public String getLevel() {
        return "Grades 1-12";
    }//ends getter getLevel()

    public void describeLevel() {
        System.out.println("This is a special education school serving grades 1 through 12");
    }//ends describeLevel()
    public String getAdminInfo(){
        return SchoolConstants.ADMIN_SYS_INFO;

    }//ends getter getAdminInfo()
    public void describeLevel1() {
        System.out.println("*Special Ed. Schools in Montgomery County*" +"\n"
                + SchoolConstants.MONTGOMERY_COUNTY_CENTRAL);
    }//ends describeLevel1


}//ends class