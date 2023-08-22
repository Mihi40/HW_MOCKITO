package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void emptyManager() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");
        manager.addNewFilm("Человек-невидимка");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLastFilm() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли.Мировой тур");
        manager.addNewFilm("номер один");

        String[] expected = {"номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLast7Film() {
        FilmManager manager = new FilmManager(7);

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли.Мировой тур");
        manager.addNewFilm("номер один");

        String[] expected = {"номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLast3Film() {
        FilmManager manager = new FilmManager(3);

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентельмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли.Мировой тур");
        manager.addNewFilm("номер один");

        String[] expected = {"номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLast5Film() {
        FilmManager manager = new FilmManager(5);

        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли.Мировой тур");
        manager.addNewFilm("номер один");

        String[] expected = {"номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}



