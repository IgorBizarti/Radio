package org.example.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void currentStationNumber () {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(9);

        int expected = 9;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationIncrease() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(11);

        int expected = 0;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(4);
        freq.next();

        int expected = 5;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void nextStation2() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(9);
        freq.next();

        int expected = 0;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prev() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(3);
        freq.prev();

        int expected = 2;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prev2() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(2);
        freq.prev();

        int expected = 1;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

   public void prev3() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(0);
        freq.prev();

        int expected = 9;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void currentStationDecrease() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void customRadioStation() {
        Radio freq = new Radio();

        freq.setCurrentRadioStation(7);
        freq.customRadioStation();

        int expected = 7;
        int actual = freq.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentVolume() {
        Radio freq = new Radio();

        freq.setCurrentVolume(7);

        int expected = 7;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentVolume2() {
        Radio freq = new Radio();

        freq.setCurrentVolume(-1);

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void upVolume() {
        Radio freq = new Radio();

        freq.setCurrentVolume(6);
        freq.increaseVolume();

        int expected = 7;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void upVolume2() {
        Radio freq = new Radio();

        freq.setCurrentVolume(10);
        freq.increaseVolume();

        int expected = 10;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void upVolume3() {
        Radio freq = new Radio();

        freq.setCurrentVolume(11);

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void downVolume() {
        Radio freq = new Radio();

        freq.setCurrentVolume(5);
        freq.decreaseVolume();

        int expected = 4;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void downVolume2() {
        Radio freq = new Radio();

        freq.setCurrentVolume(0);
        freq.decreaseVolume();

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void downVolume3() {
        Radio freq = new Radio();

        freq.setCurrentVolume(-1);
        freq.decreaseVolume();

        int expected = 0;
        int actual = freq.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}