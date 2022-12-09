package ru.netology.hwRadioman;

public class Radio {
    private int currentRadioStation;
    private int volume;
    private int maxStation;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int numberStation) {
        maxStation = numberStation - 1;

    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation > maxStation) {
            return;
        }
        if (newRadioStation < 0) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation++;
        } else
            currentRadioStation = 0;
    }

    public void pervRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else
            currentRadioStation = maxStation;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void volumeUp() {

        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }

    }
}
