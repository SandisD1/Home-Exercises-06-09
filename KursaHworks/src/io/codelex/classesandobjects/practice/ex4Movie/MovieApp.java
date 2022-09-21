package io.codelex.classesandobjects.practice.ex4Movie;

import java.util.ArrayList;

public class MovieApp {
    public static void main(String[] args) {
        ArrayList<Movie> allMovies = new ArrayList<>();
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        allMovies.add(movie1);
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        allMovies.add(movie2);
        Movie movie3 = new Movie("CSpider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
        allMovies.add(movie3);

        Movie[] allMoviesArr = allMovies.toArray(new Movie[allMovies.size()]);
        Movie[] PGmovies = Movie.getPG(allMoviesArr);

    }
}
