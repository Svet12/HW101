import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStationRegular() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationRegular9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationRegular0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegular() {
        Radio radio = new Radio();

        radio.setCurrentVolume(85);
        int actual = radio.getCurrentVolume();
        int expected = 85;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegular100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegular0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAfter() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNextAfter9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationGoingBefore0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegularLouder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(85);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 86;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegularQuieter() {
        Radio radio = new Radio();

        radio.setCurrentVolume(85);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 84;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegularLouder100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeRegularQuieter0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationRegularAboveTheLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(9);
        radio.setCurrentStation(16);
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNextAfterTheLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(15);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;


    }

    @Test
    public void setCurrentStationGoingBeforeAboveTheLimit() {
        Radio radio = new Radio(15);


        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 14;

        Assertions.assertEquals(expected, actual);
    }


}
