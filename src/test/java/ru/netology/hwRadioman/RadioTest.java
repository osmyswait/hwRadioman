package ru.netology.hwRadioman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "6,6",
            "9,9",
            "10,0"
    })
    void shouldSetCurrentRadioStation(int newRadioStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(newRadioStation);

        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,0",
            "5,6"
    })
    void shouldNextRadioStation(int newRadioStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(newRadioStation);

        rad.nextRadioStation();

        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "6,5"
    })
    void shouldPervRadioStation(int newRadioStation, int expected) {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(newRadioStation);

        rad.pervRadioStation();

        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "5,5",
            "10,10",
            "11,0"
    })
    void shouldSetVolume(int newVolume, int expected) {
        Radio rad = new Radio();
        rad.setVolume(newVolume);

        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,7",
            "10,10"
    })
    void shouldVolumeUp(int newVolume, int expected) {
        Radio rad = new Radio();
        rad.setVolume(newVolume);

        rad.volumeUp();

        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3,2",
            "0,0",
    })
    void shouldVolumeDown(int newVolume, int expected) {
        Radio rad = new Radio();
        rad.setVolume(newVolume);

        rad.volumeDown();

        int actual = rad.getVolume();
        assertEquals(expected, actual);
    }
}
