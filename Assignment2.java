public class Assignment2 {
    public static void main(String[] args) {
        // Part I
        String userType1="admin";
        String userType2="teacher";
        String userType3="student";
        String userType4="technical assistance";

        if(userType1 == "admin"){
            System.out.println("Opening Admin dashboard");
        }
        else if(userType2 == "teacher"){
            System.out.println("Opening Teacher dashboard");
        }
        else if(userType3 == "student"){
            System.out.println("Opening Student dashboard");
        }
        else if(userType4 == "technical assistance"){
            System.out.println("Opening Technical Assistance dashboard");
        }
        else {
            System.out.println("Invalid user type");
        }

        // Part II

        double studentGrade=96.8;
        double studentAttendancePercent = 70;
        boolean hackedTheSystem = true;

        if((studentGrade >= 80) && (studentAttendancePercent >= 90)
                || (hackedTheSystem))
        {
            System.out.println("Student passed");
        }
        else {
            System.out.println("Student did not pass");
        }

    }
}


