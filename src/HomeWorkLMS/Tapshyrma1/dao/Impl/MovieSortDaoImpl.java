package HomeWorkLMS.Tapshyrma1.dao.Impl;

import HomeWorkLMS.Tapshyrma1.dao.MovieSortDao;
import HomeWorkLMS.Tapshyrma1.db.DataBase;
import HomeWorkLMS.Tapshyrma1.model.Movie;
import HomeWorkLMS.Tapshyrma1.model.Producer;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MovieSortDaoImpl implements MovieSortDao {

    @Override
    public void sortMovieByName(String ascOrDesc) {
        if(ascOrDesc.equalsIgnoreCase("asc")) {
            DataBase.movies.sort(new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            DataBase.movies.sort(new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    return o2.getName().compareTo(o1.getName());
                }
            });
        }
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        if(ascOrDesc.equalsIgnoreCase("asc")){
            DataBase.movies.sort(new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    return o1.getYear().compareTo(o2.getYear());
                }
            });
        }else if(ascOrDesc.equalsIgnoreCase("desc")){
            DataBase.movies.sort(new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    return o2.getYear().compareTo(o1.getYear());
                }
            });
        }
    }



    @Override
    public List<Producer> sortByProducer(String nameOrlastName) {
        List<Producer> producerList = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            producerList.add(movie.getProducer());
        }
        producerList.sort(new Comparator<Producer>() {
            @Override
            public int compare(Producer o1, Producer o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        return producerList;

    }
}
