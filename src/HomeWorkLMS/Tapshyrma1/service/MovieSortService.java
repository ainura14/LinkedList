package HomeWorkLMS.Tapshyrma1.service;

import HomeWorkLMS.Tapshyrma1.model.Producer;

import java.util.List;

public interface MovieSortService {
    void sortMovieByName(String ascOrDesc);

    void sortByYear(String ascOrDesc);

    List<Producer> sortByProducer(String nameOrlastName);
}
