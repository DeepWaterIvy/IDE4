public class ElementarySchool extends School {
    public String getType() {
        return "Elementary School";
    }//ends getter Type

    public String getLevel() {
        return "Grades 3-5";
    }//ends getter Level

    public void describeLevel() {
        System.out.println("This is an elementary school serving grades 3 through 5");
    }//ends describeLevel
    public String getAdminInfo(){
        return SchoolConstants.ADMIN_SYS_INFO;
    }//ends getAdminInfo
    public void describeLevel1() {
        System.out.println("*Montgomery County Elementary Schools*" +"\n"
                + SchoolConstants.MONTGOMERY_COUNTY_ELEMENTARY);
    }//ends describeLevel1

}//ends Mid/School class
