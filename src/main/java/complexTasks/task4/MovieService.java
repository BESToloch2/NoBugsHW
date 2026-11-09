package complexTasks.task4;

import complexTasks.task3.InvalidGradeException;

import javax.management.openmbean.InvalidKeyException;
import java.util.*;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> movies;

    public MovieService() {
        movies = new HashMap<>();
    }

    public synchronized void addGrade(Movie movie, Rating<T> grade) {

        if (grade.getGrade().doubleValue() < 1 || grade.getGrade().doubleValue() > 10) {
            throw new InvalidGradeException("Grade must be from 1 to 10");
        }

        if (movies.containsKey(movie)) {
            movies.get(movie).add(grade);
        } else {
            List<Rating<T>> ratings = new ArrayList<>();
            ratings.add(grade);
            movies.put(movie, ratings);
        }
    }

    public synchronized double avgGradeByMovie(String title) {
        Movie movie = new Movie(title);

        if (!movies.containsKey(movie)) {
            throw new InvalidKeyException("No such title");
        }

        return movies.get(movie).stream()
                .mapToDouble(e -> e.getGrade().doubleValue())
                .average()
                .orElse(0.0);
    }

    public synchronized List<Movie> sortMoviesByAvgGradeFroFromBottomToTop(boolean ascending) {

        Comparator<Map.Entry<Movie, List<Rating<T>>>> comparator = Comparator.comparingDouble((Map.Entry<Movie, List<Rating<T>>> v)  -> v.getValue().stream()
                .mapToDouble(e -> e.getGrade().doubleValue()).average().orElse(0.0));

        if (!ascending){
            comparator = comparator.reversed();
        }

        return movies.entrySet().stream().sorted(comparator).map(Map.Entry::getKey).toList();
    }
}
