package hw9AF18;

public class App {
    public static void main(String[] args) {


    Picture pc1=new Picture("Spring flowers","JPG",0.89,"Flowers");
    Picture pc2=new Picture();
    pc2.setName("Wild wolf");
    pc2.setTheme("Animals");
    pc2.setType("JPG");
    pc2.setWeight(1.12);

    pc1.infoPicture();
    pc2.infoPicture();
        System.out.println("----------------------");

        Project pr1=new Project("School presentation",23,"Presentations",13);
        Project pr2=new Project();
        pr2.setName("New system of motivation");
        pr2.setSlides(18);
        pr2.setTheme("Motivation");
        pr2.setWeight(8);

        System.out.println(pr1.infoProject());
        pr1.presenter("Mary");
        System.out.print(pr2.infoProject());
        pr2.presenter("Ivan");
        System.out.println("---------------------");

        Song sg1=new Song("Unbreaking heart","MP3",9,2.94);
        Song sg2=new Song();
        sg2.setName("Shape of you");
        sg2.setLength(4.02);
        sg2.setType("MP4");
        sg2.setWeight(10);

        sg1.infoSong();
        System.out.println(sg1.duration());
        sg2.infoSong();
        System.out.println(sg2.duration());
        System.out.println("---------------------");

        Video vd1=new Video("Funny cat","MP4",4,2);
        Video vd2=new Video();
        vd2.setName("Sea");
        vd2.setLength(3);
        vd2.setType("MOV");
        vd2.setWeight(5);

        System.out.println(vd1.infoVideo());
        System.out.println(vd2.infoVideo());

}}
