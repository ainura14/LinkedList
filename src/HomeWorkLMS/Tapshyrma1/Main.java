package HomeWorkLMS.Tapshyrma1;

import HomeWorkLMS.Tapshyrma1.dao.Impl.MovieDaoImpl;
import HomeWorkLMS.Tapshyrma1.dao.Impl.MovieSortDaoImpl;
import HomeWorkLMS.Tapshyrma1.db.Generator;
import HomeWorkLMS.Tapshyrma1.enums.Genre;
import HomeWorkLMS.Tapshyrma1.model.Actor;
import HomeWorkLMS.Tapshyrma1.model.Movie;
import HomeWorkLMS.Tapshyrma1.model.Producer;
import HomeWorkLMS.Tapshyrma1.service.Impl.MovieServiceImpl;
import HomeWorkLMS.Tapshyrma1.service.Impl.MovieSortServiceImpl;
import HomeWorkLMS.Tapshyrma1.service.MovieSortService;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieDaoImpl movieDao = new MovieDaoImpl();
        MovieServiceImpl movieService = new MovieServiceImpl(movieDao);

        MovieSortDaoImpl movieSortDao = new MovieSortDaoImpl();
        MovieSortServiceImpl movieSortService = new MovieSortServiceImpl(movieSortDao);

        Producer producer = new Producer(Generator.setProducerID(), "Ruslan", "Akun");
        Actor actor = new Actor(Generator.setActorID(), "Tamara Akylbaeva", "Glavniy");
        List<Actor> actorList = new LinkedList<>();
        actorList.add(actor);

        movieService.addMovie(new Movie(Generator.setMovieID(), "Ak keme", LocalDate.of(2023, 12, 9), Genre.ROMANCE, producer, actorList));
        movieService.addMovie(new Movie(Generator.setMovieID(), "Erte kelgen turnalar", LocalDate.of(2022, 10, 8), Genre.DRAMA, producer, actorList));
        System.out.println(movieService.addMovie(new Movie(Generator.setMovieID(), "Salam New York2", LocalDate.of(2009, 9, 9), Genre.HYMOR, producer, actorList)));

        Scanner scannerInt = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean stoppedAll = true;
        while(stoppedAll) {
            boolean isTrue = true;
            while (isTrue) {
                System.out.println("""
                        1. get All Movies
                        2. find Movie By Full Name Or PartName
                        3. find Movie By Actor Name
                        4. find Movie By Year
                        5. find Movie By Producer
                        6. find Movie By Genre
                        7. find Movie By Role
                        8. log out
                        """);
                int num = scannerInt.nextInt();
                scanner.nextLine();

                switch (num) {
                    case 1 -> {
                        System.out.println("Method get all movies: ");
                        System.out.println(movieService.getAllMovies());
                    }
                    case 2 -> {
                        System.out.println("Method find Movie By Full Name Or PartName: ");
                        System.out.println("Write the name or part name of the movie: ");
                        System.out.println(movieService.findMovieByFullNameOrPartName(scanner.nextLine()));
                    }
                    case 3 -> {
                        System.out.println("Method find Movie By Actor Name: ");
                        System.out.println("Write the name of the actor: ");
                        System.out.println(movieService.findMovieByActorName(scanner.nextLine()));
                    }
                    case 4 -> {
                        System.out.println("Method find Movie By Year");
                        System.out.println("Write the year: ");
                        String year = scanner.nextLine();
                        LocalDate localDate = LocalDate.parse(year);
                        System.out.println(movieService.findMovieByYear(localDate));
                    }
                    case 5 -> {
                        System.out.println("Method find Movie By Producer: ");
                        System.out.println("Write the name of producer: ");
                        System.out.println(movieService.findMovieByProducer(scanner.nextLine()));
                    }
                    case 6 -> {
                        try {
                            System.out.println("Method find Movie By Genre: ");
                            String g = scanner.nextLine().toUpperCase();
                            Genre genre = Genre.valueOf(g);
                            System.out.println(movieService.findMovieByGenre(genre));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Illegal value input.");
                        }
                    }
                    case 7 -> {
                        System.out.println("Method find Movie By Role: ");
                        System.out.println("Write the role: ");
                        System.out.println(movieService.findMovieByRole(scanner.nextLine()));
                    }
                    case 8 -> {
                        isTrue = false;
                    }
                }
            }

            boolean isCheck = true;
            while (isCheck) {
                System.out.println("""
                        1. sort movie by name asc/desc
                        2. sort movie by year asc/desc
                        3. sort movie by producer name
                        4. log out
                        """);

                int n = scannerInt.nextInt();
                scanner.nextLine();
                switch (n) {
                    case 1 -> {
                        try {
                            System.out.println("Write asc or desc to sort: ");
                            movieSortService.sortMovieByName(scanner.nextLine());
                        } catch (InputMismatchException e) {
                            throw new IllegalArgumentException("Please enter only asc ot desc values!");
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.println("Write asc or desc to sort: ");
                            movieSortService.sortByYear(scanner.nextLine());
                        } catch (InputMismatchException e) {
                            throw new IllegalArgumentException("Please enter only asc ot desc values!");
                        }
                    }
                    case 3 -> {
                        System.out.println("Write name or surname of producer: ");
                        movieSortService.sortByProducer(scanner.nextLine());
                    }
                    case 4 -> {
                        isCheck = false;
                    }
                }
            }
        }
    }
}
