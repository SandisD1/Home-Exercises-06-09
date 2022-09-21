package io.codelex.classesandobjects.practice.ex4Movie;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;


    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        //     allMovies.add(new Movie(title, studio, rating));
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
        //   allMovies.add(new Movie(title, studio, this.rating));
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] PGMovies = new Movie[movies.length];
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                PGMovies[i] = movies[i];
            }
        }
        return PGMovies;
    }
}
