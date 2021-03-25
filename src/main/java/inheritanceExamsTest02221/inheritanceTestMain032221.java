package inheritanceExamsTest02221;

public class inheritanceTestMain032221 {
    public static void main(String[] args) {
        System.out.println("Hi There");
        certificatesClass c1 = new certificatesClass();
        String exam = c1.examName("VB");
        String award = c1.certificateAwarded(50);
        String fullName = c1.fullName("Bill Gates");
        String examScore = c1.examScore(45);
        System.out.println(exam + " " + award);
    }
}
