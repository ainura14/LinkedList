package HomeWorkLMS.Tapshyrma1.service;

import HomeWorkLMS.Tapshyrma1.enums.Genre;
import HomeWorkLMS.Tapshyrma1.model.Movie;

import java.time.LocalDate;
import java.util.List;


public interface MovieService {
    String addMovie(Movie movie);
    List<Movie> getAllMovies();

    Movie findMovieByFullNameOrPartName(String name);

    Movie findMovieByActorName(String actorName);

    Movie findMovieByYear(LocalDate year);

    Movie findMovieByProducer(String producerFullName);

    Movie findMovieByGenre(Genre genre);

    Movie findMovieByRole(String role);
}
