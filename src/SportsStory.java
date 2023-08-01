public class SportsStory extends Story {
    private String sport;

    public SportsStory(int id, String author, String title, String sport) {
        super(id, author, title);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    /*@Override
    public void credits() {
        System.out.println("Author: Priya");
    }*/
}
