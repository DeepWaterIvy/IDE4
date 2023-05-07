public class Primary extends School {
    public String getType() {
        return "Primary School";
    }//ends getter getType()

    public String getLevel() {
        return "Grades 1-2";
    }//ends getter getLevel

    public void describeLevel() {
        System.out.println("This is a primary school serving grades 1 through 2");
    }//ends describeLevel()
    public String getAdminInfo(){
        return SchoolConstants.ADMIN_SYS_INFO;
    }//ends getter getAdminInfo()
    public void describeLevel1() {
        System.out.println("*Montgomery County Primary Schools*" +"\n"
                + SchoolConstants.MONTGOMERY_COUNTY_PRIMARY);
    }//ends describeLevel1()

}