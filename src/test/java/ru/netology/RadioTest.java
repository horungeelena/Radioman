package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void ShouldCurrentStation() {
        radio.setCurrentStation(5);
        assertEquals(5,radio.getCurrentStation());
    }

    @Test
    void ShouldMaxStation() {
        radio.setCurrentStation(10);
        assertEquals(10,radio.getMaxStation());
    }

    @Test
    void ShouldMinStation() {
        radio.setCurrentStation(0);
        assertEquals(0,radio.getMinStation());
    }

    @Test
    void ShouldOverMaxStation() {
        radio.setCurrentStation(11);
        radio.increaseStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void ShouldUnderMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void ShouldCurrentVolume() {
        radio.setCurrentVolume(50);
        assertEquals(50,radio.getCurrentVolume());
    }

    @Test
    void ShouldMaxVolume() {
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void ShouldMinVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0,radio.getMinVolume());
    }

    @Test
    void ShouldOverMaxVolume() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void ShouldUnderMinVolume() {
        radio.setCurrentVolume(-10);
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void  ShouldDecreaseStation() {
        radio.setCurrentStation(5);
        radio.decreaseStation();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    void ShouldIncreaseStation() {
        radio.setCurrentStation(5);
        radio.increaseStation();
        assertEquals(6,radio.getCurrentStation());
    }

    @Test
    void ShouldDecreaseVolume() {
        radio.setCurrentVolume(60);
        radio.decreaseVolume();
        assertEquals(59,radio.getCurrentVolume());
    }

    @Test
    void ShouldIncreaseVolume() {
        radio.setCurrentVolume(60);
        radio.increaseVolume();
        assertEquals(61,radio.getCurrentVolume());
    }
}
