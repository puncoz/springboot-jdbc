package com.practice.springbootjdbc.domain.movie;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> listMovies() {
        return movieService.getMovies();
    }

    @GetMapping("{id}")
    public Movie getMovieById(@PathVariable("id") Integer movieId) {
        return movieService.getMovieById(movieId);
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable("id") Integer id) {
        movieService.deleteMovie(id);
    }

}
