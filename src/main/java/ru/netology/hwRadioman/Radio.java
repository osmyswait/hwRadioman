package ru.netology.hwRadioman;

public class Radio {
    public int currentRadioStation;
    public int volume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation > 9) {
            return;
        }
        if (newRadioStation < 0) {
            return;
        }
        currentRadioStation = newRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = -1;
        }
        currentRadioStation++;
    }

    public void pervRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 10;
        }
        currentRadioStation--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 10) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void volumeUp() {

        if (volume == 10) {
            return;
        }
        if (volume < 10) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume == 0) {
            return;
        }
        if (volume > 0) {
            volume--;
        }
    }

}
