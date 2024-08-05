package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldNotCalculateRemainIfDivided1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}