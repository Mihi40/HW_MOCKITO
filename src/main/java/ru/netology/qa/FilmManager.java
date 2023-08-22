package ru.netology.qa;

public class FilmManager {

    private String[] filmNames = new String[0];
    private int limit;

    public FilmManager() {
        limit = 5;
    }

    public FilmManager(int limit2) {
        limit = limit2;
    }

    public void addNewFilm(String film) {

        String[] tmp = new String[filmNames.length + 1];
        for (int i = 0; i < filmNames.length; i++) {
            tmp[i] = filmNames[i];
        }
        tmp[tmp.length - 1] = film;
        filmNames = tmp;
    }

    public String[] findAll() {
        return filmNames;
    }

    public String[] findLast() {
        int countLastFilm;
        if (limit > filmNames.length) {
            countLastFilm = filmNames.length;
        } else {
            countLastFilm = limit;
        }
        String[] clf = new String[countLastFilm];
        for (int i = filmNames.length - 1; i >= filmNames.length - countLastFilm; i--) {
            clf[filmNames.length - i - 1] = filmNames[i];
        }
        return clf;

    }
}
