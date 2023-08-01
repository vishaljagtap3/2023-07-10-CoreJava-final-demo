public class Main {
    public static void main(String[] args) {

        Story s1 = new SportsStory(
                101,
                "Vishal Jagtap",
                "How to master the game",
                "Cricket"
        );

        s1.credits();

        System.out.println();

        Vehicle v = new HondaCar("MH12MF9205", 459834);
        System.out.println( v.setPassingNo("BOND007"));
        System.out.println(v.getPassingNo());


    }
}
