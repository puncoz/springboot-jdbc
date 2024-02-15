package com.practice.springbootjdbc.domain.movie;

import com.practice.springbootjdbc.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieDao movieDao;

    public MovieService(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public List<Movie> getMovies() {
        return movieDao.getMoviesList();
    }

    public void addMovie(Movie movie) {
        int result = movieDao.createMovie(movie);

        if (result != 1) {
            throw new IllegalStateException("oops something went wrong");
        }
    }

    public void deleteMovie(Integer movieId) {
        Optional<Movie> movies = movieDao.getMovie(movieId);
        movies.ifPresentOrElse(movie -> {
            int result = movieDao.deleteMovie(movieId);
            if (result != 1) {
                throw new IllegalStateException("oops could not delete movie");
            }
        }, () -> {
            throw new NotFoundException(String.format("movie with id %s not found", movieId));
        });
    }

    public Movie getMovieById(int movieId) {
        return movieDao.getMovie(movieId)
                .orElseThrow(() -> new NotFoundException(String.format("movie with id %s not found", movieId)));
    }

}
