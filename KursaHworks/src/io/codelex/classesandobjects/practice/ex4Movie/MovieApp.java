package io.codelex.classesandobjects.practice.ex4Movie;

import java.util.ArrayList;
import java.util.List;

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
        Movie[] pGmovies = getPG(allMoviesArr);

        for (int i = 0; i < allMoviesArr.length; i++) {
            System.out.println(allMoviesArr[i].toString());

        }

        for (Movie pG : pGmovies) {
            System.out.println(pG.toString());
        }

    }

    public static Movie[] getPG(Movie[] movies) {
        List<Movie> pGs = new ArrayList<>();

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("PG")) {
                pGs.add(movies[i]);
            }
        }
        return pGs.toArray(new Movie[0]);
    }
}
