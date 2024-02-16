package com.practice.springbootjdbc.domain.movie;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository implements MovieDao {

    private final JdbcTemplate jdbcTemplate;

    public MovieRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
