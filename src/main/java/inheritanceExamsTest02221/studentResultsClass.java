package inheritanceExamsTest02221;

public class studentResultsClass {
    private String Full_Name;
    private String Exam_Name;
    private String Exam_Grade;
    private String Exam_Score;

    studentResultsClass() {
     Full_Name = "No Name Given";
     Exam_Name = "Unknown";
     Exam_Score = "No Score";
     Exam_Grade = "Unknown";
    }

String fullName(String aName) {

        Full_Name = aName;
        return Full_Name;
}

String examName(String examCode) {
    if (examCode.equals("VB")) {
        Exam_Name = "Visual Basic .Net";

    } else if (examCode.equals("JV")) {
        Exam_Name = "Java";
    } else if (examCode.equals("C#")) {
        Exam_Name = "C# .net";

    } else if (examCode.equals("PH")) {
        Exam_Name = "PHP";

    } else {
        Exam_Name = "No Exam Given";
    }
    return Exam_Name;
} //end of String examName(String examCode)

    String examScore (int aScore) {

        Exam_Score = aScore + "out of 50";
        return Exam_Score;

    }

    String examGrade (int aScore) {
        Exam_Grade = this.getGrade(aScore);
        return Exam_Grade;
    }
     private String getGrade(int aScore) {

         String examGrade = "";

         if (aScore >= 0 && aScore <= 10) {
             examGrade = "F";

         } else if (aScore >= 11 && aScore <= 20) {
             examGrade = "D";

         } else if (aScore >= 21 && aScore <= 30) {
             examGrade = "C";

         } else if (aScore >= 31 && aScore <= 40) {
             examGrade = "B";

         } else if (aScore >= 41) {
             examGrade = "A";
         }
         return "Grade is " + examGrade;
     }
}//end of class