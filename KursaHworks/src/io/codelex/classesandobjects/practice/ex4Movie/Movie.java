package io.codelex.classesandobjects.practice.ex4Movie;

import java.util.ArrayList;
import java.util.List;

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
        List<Movie> PGs = new ArrayList<>();

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                PGs.add(movies[i]);
            }
        }
        Movie[] PGMovies = new Movie[PGs.size()];
        return PGs.toArray(PGMovies);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return title.equals(movie.title) && studio.equals(movie.studio) && rating.equals(movie.rating);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
