package complexTasks.task4;

import complexTasks.task3.InvalidGradeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {

    MovieService<Integer> integerMovieService;
    MovieService<Double> doubleMovieService;

    @BeforeEach
    public void setup(){
        integerMovieService = new MovieService<>();
        doubleMovieService = new MovieService<>();
    }

    @Test
    public void userCanAddRatingToTheMovie(){
        Movie interstellar = new Movie("Interstellar");
        Rating<Integer> rating = new Rating<>(8);
        integerMovieService.addGrade(interstellar, rating);
        assertTrue(integerMovieService.getMovies().containsKey(interstellar));
        assertTrue(integerMovieService.getMovies().get(interstellar).contains(rating));
    }

    @Test
    public void userCanCalculateAvgRatingByMovie(){
        Movie interstellar = new Movie("Interstellar");

        doubleMovieService.addGrade(interstellar, new Rating<>(10.0));
        doubleMovieService.addGrade(interstellar, new Rating<>(8.0));

        assertEquals(9.0, doubleMovieService.avgGradeByMovie(interstellar.getTitle()), 0.0001);
    }

    @Test
    public void userCatchExceptionWhenProvideUnexistedKey(){
        InvalidMovieException exception = assertThrows(InvalidMovieException.class, () -> doubleMovieService.avgGradeByMovie("Movie"));
       assertEquals("No such title", exception.getMessage());
    }

    public static Stream<Arguments> provideNegativeRatings(){
        return Stream.of(Arguments.of(new Movie("Interstellar"), new Rating<Integer>(-1)),
                Arguments.of(new Movie("Avatar"), new Rating<Integer>(11)));
    }

    @ParameterizedTest
    @MethodSource("provideNegativeRatings")
    public void userCannotProvideNegativeRating(Movie movie, Rating<Integer> rating){
        assertThrows(InvalidGradeException.class, () -> integerMovieService.addGrade(movie, rating));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void userCanSortMoviesByAvgRating(boolean ascending){
        Movie interstellar = new Movie("Interstellar");
        Movie avatar = new Movie("Avatar");
        Movie titanic = new Movie("Titanic");

        List<Movie> ascendingOrder = List.of(avatar, titanic, interstellar);
        List<Movie> descendingOrder = List.of(interstellar, titanic, avatar);

        doubleMovieService.addGrade(interstellar, new Rating<>(9.0));

        doubleMovieService.addGrade(avatar, new Rating<>(7.0));
        doubleMovieService.addGrade(avatar, new Rating<>(4.0));

        doubleMovieService.addGrade(titanic, new Rating<>(5.0));
        doubleMovieService.addGrade(titanic, new Rating<>(8.0));

        List<Movie> sorted = doubleMovieService.sortMoviesByAvgGradeFroFromBottomToTop(ascending);

        if (ascending) {
            assertEquals(ascendingOrder, sorted);
        }else {
            assertEquals(descendingOrder, sorted);
        }
    }
}