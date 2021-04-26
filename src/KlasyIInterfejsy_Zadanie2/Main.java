package KlasyIInterfejsy_Zadanie2;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
        .setTittle("Tytuł")
        .setDirector("Błaszczyk")
        .setDateProduction(1665)
        .setType("Adventure")
        .setPublisher("NZOSA")
        .createMovie();
        System.out.println(movie);


    }


}
