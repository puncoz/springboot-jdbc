package com.practice.springbootjdbc.domain.movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {

    List<Movie> getMoviesList();

    Optional<Movie> getMovie(int movieId);

    int createMovie(Movie movie);

    int deleteMovie(int movieId);

}
