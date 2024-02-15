package com.practice.springbootjdbc.domain.movie;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository implements MovieDao {
    @Override
    public List<Movie> getMoviesList() {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public int createMovie(Movie movie) {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public int deleteMovie(int movieId) {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public Optional<Movie> getMovie(int movieId) {
        throw new UnsupportedOperationException("not implemented");
    }
}
