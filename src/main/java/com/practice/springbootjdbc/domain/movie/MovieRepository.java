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
        var sql = """
                SELECT id, name, released_date
                FROM movies
                LIMIT 10;
                """;

        return jdbcTemplate.query(sql, new MovieRowMapper());
    }

    @Override
    public Optional<Movie> getMovie(int movieId) {
        String sql = """
                SELECT id, name, released_date
                FROM movies
                WHERE id = ?
                """;

        return jdbcTemplate.query(sql, new MovieRowMapper(), movieId)
                .stream()
                .findFirst();
    }

    @Override
    public int createMovie(Movie movie) {
        String sql = """
                INSERT INTO movies(name, released_date) VALUES (?, ?)
                """;

        return jdbcTemplate.update(
                sql,
                movie.name(), movie.releasedDate()
        );
    }

    @Override
    public int deleteMovie(int movieId) {
        String sql = """
                DELETE FROM movies
                WHERE id = ?
                """;

        return jdbcTemplate.update(sql, movieId);
    }
}
