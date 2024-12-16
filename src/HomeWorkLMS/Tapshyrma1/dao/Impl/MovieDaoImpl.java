package HomeWorkLMS.Tapshyrma1.dao.Impl;

import HomeWorkLMS.Tapshyrma1.dao.MovieDao;
import HomeWorkLMS.Tapshyrma1.db.DataBase;
import HomeWorkLMS.Tapshyrma1.enums.Genre;
import HomeWorkLMS.Tapshyrma1.model.Actor;
import HomeWorkLMS.Tapshyrma1.model.Movie;

import java.time.LocalDate;
import java.util.List;

public class MovieDaoImpl implements MovieDao {
    @Override
    public String addMovie(Movie movie) {
        DataBase.movies.add(movie);
        return "Successfully added.";
    }

    @Override
    public List<Movie> getAllMovies() {
        return DataBase.movies;
    }

    @Override
    public Movie findMovieByFullNameOrPartName(String name) {
        for (Movie movie : DataBase.movies) {
            if(movie.getName().equalsIgnoreCase(name)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByActorName(String actorName) {
        for (Movie movie : DataBase.movies) {
            List<Actor> actors = movie.getActors();
            for (Actor actor : actors) {
                if(actor.getActorFullName().equalsIgnoreCase(actorName)){
                    return movie;
                }
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByYear(LocalDate year) {
        for (Movie movie : DataBase.movies) {
            if(movie.getYear().equals(year)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByProducer(String producerFullName) {
        for (Movie movie : DataBase.movies) {
            if(movie.getProducer().equals(producerFullName)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByGenre(Genre genre) {
        for (Movie movie : DataBase.movies) {
            if(movie.getGenre().equals(genre)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        for (Movie movie : DataBase.movies) {
            List<Actor> actors = movie.getActors();
            for (Actor actor : actors) {
                if(actor.getRole().equalsIgnoreCase(role)){
                    return movie;
                }
            }
        }
        return null;
    }
}
