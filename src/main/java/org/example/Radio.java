package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int stationCount;

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public Radio() {
        this.stationCount = 10;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationCount - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void nextStation() {
        if (currentStation == stationCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

