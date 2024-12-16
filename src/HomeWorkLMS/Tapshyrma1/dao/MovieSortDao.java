package HomeWorkLMS.Tapshyrma1.dao;

import HomeWorkLMS.Tapshyrma1.model.Producer;

import java.util.List;

public interface MovieSortDao {
    void sortMovieByName(String ascOrDesc);

    List<Producer> sortByProducer(String nameOrlastName);

    void sortByYear(String ascOrDesc);

}
