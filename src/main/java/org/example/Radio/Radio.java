package org.example.Radio;

public class Radio {

    private int numberRadioStationMax;
    private int currentRadioStation;
    private int currentVolume;


    public Radio() {
        numberRadioStationMax = 9;
    }
    public Radio(int stationsCount) {

        numberRadioStationMax = stationsCount - 1;
    }

    public int getCurrentRadioStation() {
       return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentStation) {

        if (currentStation < 0) {
            currentRadioStation = numberRadioStationMax;
        }
        if (currentStation > numberRadioStationMax) {
            currentRadioStation = 0;
        }

        this.currentRadioStation = currentStation;

    }

    public void next() {

        if (currentRadioStation >= numberRadioStationMax) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = numberRadioStationMax;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void customRadioStation() {
        int newCurrentRadioStation = currentRadioStation();
        setCurrentRadioStation(newCurrentRadioStation);
    }

    public int currentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }

    }

}
