package com.practice.springbootjdbc.domain.movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {

    List<Movie> getMoviesList();

    int createMovie(Movie movie);

    int deleteMovie(int movieId);

    Optional<Movie> getMovie(int movieId);

}
