package KlasyIInterfejsy_Zadanie2;

public class Movie {
    String tittle;
    String director;
    int dateProduction;
    String type;
    String publisher;


    public Movie(String tittle, String director, int dateProduction, String type, String publisher) {
        this.tittle = tittle;
        this.director = director;
        this.dateProduction = dateProduction;
        this.type = type;
        this.publisher = publisher;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(int dateProduction) {
        this.dateProduction = dateProduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "tittle='" + tittle + '\'' +
                ", director='" + director + '\'' +
                ", dateProduction=" + dateProduction +
                ", type='" + type + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }




    static class MovieCreator {
        String tittle;
        String director;
        int dateProduction;
        String type;
        String publisher;

        public String getTittle() {
            return tittle;
        }

        public String getDirector() {
            return director;
        }

        public int getDateProduction() {
            return dateProduction;
        }

        public String getType() {
            return type;
        }

        public String getPublisher() {
            return publisher;
        }

        public MovieCreator setTittle(String tittle) {
            this.tittle = tittle;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setDateProduction(int dateProduction) {
            this.dateProduction = dateProduction;
            return this;
        }

        public MovieCreator setType(String type) {
            this.type = type;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }


        public Movie createMovie() {
            Movie movie = new Movie(tittle, director, dateProduction, type, publisher);
            return movie;

        }
    }


}
