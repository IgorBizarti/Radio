package org.example.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {


    @Test

    public void numberRadioStations() {
        Radio freq = new Radio(10);

        int expected = 9;
        int actual = freq.getCurrentRadioStation();
    }

    @Test

    public void test() {
        Radio freq = new Radio(9);
        freq.setCurrentRadioStation(9);

        int expected = 9;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setCurrentRadioStation() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = freq.getCurrentRadioStation();
    }

    @Test

    public void setCurrentRadioStation2() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(10);

        int expected = 0;
        int actual = freq.getCurrentRadioStation();
    }

    @Test

    public void currentStationNumber() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(9);

        int expected = 9;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void currentRadioStation() {
        Radio freq = new Radio(9);
        freq.setCurrentRadioStation(0);

        int expected = 0;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationIncrease() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(9);
        freq.next();

        int expected = 0;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation() {
        Radio freq = new Radio(10);
        freq.setCurrentRadioStation(4);
        freq.next();

        int expected = 5;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void nextStation2() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(9);
        freq.next();

        int expected = 0;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prev() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(3);
        freq.prev();

        int expected = 2;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prev2() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(2);
        freq.prev();

        int expected = 1;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prev3() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(0);
        freq.prev();

        int expected = 9;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void currentStationDecrease() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(0);
        freq.prev();

        int expected = 9;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void customRadioStation() {
        Radio freq = new Radio(10);

        freq.setCurrentRadioStation(7);
        freq.customRadioStation();

        int expected = 7;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentVolume() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(7);

        int expected = 7;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void setCurrentVolume() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(100);
        freq.next();

        int expected = 100;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void currentVolume2() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(-1);

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void upVolume() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(6);
        freq.increaseVolume();

        int expected = 7;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void upVolume2() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(100);
        freq.increaseVolume();

        int expected = 100;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void upVolume3() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(100);

        int expected = 100;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void downVolume() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(5);
        freq.decreaseVolume();

        int expected = 4;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void downVolume2() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(0);
        freq.decreaseVolume();

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void downVolume3() {
        Radio freq = new Radio(10);

        freq.setCurrentVolume(-1);
        freq.decreaseVolume();

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}