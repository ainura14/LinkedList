package HomeWorkLMS.Tapshyrma1.service.Impl;

import HomeWorkLMS.Tapshyrma1.dao.Impl.MovieSortDaoImpl;
import HomeWorkLMS.Tapshyrma1.model.Producer;
import HomeWorkLMS.Tapshyrma1.service.MovieSortService;

import java.util.List;

public class MovieSortServiceImpl implements MovieSortService {
    private final MovieSortDaoImpl movieSortDao;

    public MovieSortServiceImpl(MovieSortDaoImpl movieSortDao){
        this.movieSortDao = movieSortDao;
    }

    @Override
    public void sortMovieByName(String ascOrDesc) {
        movieSortDao.sortMovieByName(ascOrDesc);
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        movieSortDao.sortByYear(ascOrDesc);
    }


    @Override
    public List<Producer> sortByProducer(String nameOrlastName) {
        return movieSortDao.sortByProducer(nameOrlastName);
    }
}
