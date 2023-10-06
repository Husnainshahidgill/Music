public class Demo {
    public static void main(String[] args) {
        //String Print = String.format("Title: %s, Date: %s , Duration: %d, Genre: %s,Album: %s, Artist: %s,",mName,mfc.addDate(),duration,genre,mAlbum,art.addArt());
        Date d1 = new Date(24,9,2016);
        Artist a1 = new Artist("Weekend","Pakistani",1);
        Music m1 = new Music("StarBoy",2,"StarBoy",new Date(24,9,2016),"Pop",new Artist("Weekend","Pakistani",1));
        Music m2 = new Music("Reminder",3,"StarBoy",new Date(17,6,2018),"Pop",new Artist("Weekend","Pakistani",1));
        Music m3 = new Music("Nothing without you",1,"StarBoy",new Date(4,4,2020),"Pop",new Artist("Weekend","Pakistani",1));
        Music m4 = new Music("Die for you",4,"StarBoy",new Date(30,8,2021),"Pop",new Artist("Weekend","Pakistani",1));
        Music m5 = new Music("Rockin'",5,"StarBoy",new Date(20,1,2023),"Pop",new Artist("Weekend","Pakistani",1));

        Music list[] = new Music[5];
        list[0] = m1;
        list[1] = m2;
        list[2] = m3;
        list[3] = m4;
        list[4] = m5;

        for (int i = 0; i < 5; i++){
            System.out.println(list[i]);
        }


        /*System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);

//        //System.out.println(a1);
       /* Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Song Title: ");
        String mName = s1.nextLine();

        System.out.println("Enter Song Genre: ");
        String Genre = s1.nextLine();

        System.out.println("Enter Album name: ");
        String mAlbum = s1.nextLine();

        System.out.println("Enter Artist name: ");
        Artist art = s1.nextLine();

        System.out.println("Enter Artist Nationality: ");
        String nationality = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter Releasing Date:");
        System.out.println("Enter day: ");
        int day = s2.nextInt();

        System.out.println("Enter month: ");
        int month = s2.nextInt();

        System.out.println("Enter year: ");
        int year = s2.nextInt();

        System.out.println("Enter Song Duration: ");
        int duration = s2.nextInt();

        System.out.println("Enter Musician Rank: ");
*/
    }


}
