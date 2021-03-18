package homework11;

public class App {
    public static void main(String[] args){

        Student lisa = new Student("Lisa", new Subjects[]{Subjects.English, Subjects.Algebra, Subjects.Drawing, Subjects.Statistics}, Standings.freshman);
        Teacher Bob = new Teacher("Bob", Professors.assistant);

        String lisaInfo = lisa.toString();
        System.out.println(lisaInfo);
        String bobInfo = Bob.toString();
        System.out.println(bobInfo);
    }
}
