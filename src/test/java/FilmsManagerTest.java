import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netolgy.FilmsManager;

public class FilmsManagerTest {

    FilmsManager manager = new FilmsManager();

    @Test
    public void testFindAll() {
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";
        String film4 = "Gintama";
        String film5 = "Fairy tail";

        manager.addFilm(film1);
        manager.addFilm(film4);

        String[] actual = manager.findAll();
        String[] expected = {film1, film4};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastFilmsFive() {
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";
        String film4 = "Gintama";
        String film5 = "Fairy tail";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastFilmsMoreFive() {
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";
        String film4 = "Gintama";
        String film5 = "Fairy tail";

        manager.addFilm(film1);
        manager.addFilm(film2);


        String[] actual = manager.findLast();
        String[] expected = {film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastFilmsLassFive() {
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";
        String film4 = "Gintama";
        String film5 = "Fairy tail";
        String film6 = "FullMetal Alchemist";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testParameterFindLastFilms() {
        FilmsManager manager = new FilmsManager(4);
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";
        String film4 = "Gintama";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] actual = manager.findLast();
        String[] expected = {film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testParameterFindLastFilmsMore() {
        FilmsManager manager = new FilmsManager(3);
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";


        manager.addFilm(film1);
        manager.addFilm(film2);


        String[] actual = manager.findLast();
        String[] expected = {film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testParameterFindLastFilmsLass() {
        FilmsManager manager = new FilmsManager(4);
        String film1 = "Onepuchman";
        String film2 = "Bleach";
        String film3 = "Naruto";
        String film4 = "Gintama";
        String film5 = "Fairy tail";
        String film6 = "FullMetal Alchemist";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] actual = manager.findLast();
        String[] expected = {film6, film5, film4, film3};

        Assertions.assertArrayEquals(expected, actual);

    }

}
