package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TicketPriceTest {

    TicketPrice tp = new TicketPrice();

    @Test
    @DisplayName("Test age under 5")
        //Testcase R1 - R6
    void testUnder5() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(-1, "ngay_thuong")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(-1, "cuoi_tuan")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(-1, "ngay_le")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(4, "ngay_thuong")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(4, "cuoi_tuan")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(4, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age 5-12")
        //Testcase R7 - R9
    void testChildren() {
        assertAll(
                () -> assertEquals(45000, tp.calculatePrice(10, "ngay_thuong")),
                () -> assertEquals(52000, tp.calculatePrice(10, "cuoi_tuan")),
                () -> assertEquals(52000, tp.calculatePrice(10, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age 13-59")
        //Testcase R10 - R12
    void testAdult() {
        assertAll(
                () -> assertEquals(60000, tp.calculatePrice(20, "ngay_thuong")),
                () -> assertEquals(69000, tp.calculatePrice(20, "cuoi_tuan")),
                () -> assertEquals(69000, tp.calculatePrice(20, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age 60-99")
        //Testcase R13 - R15
    void testElderly() {
        assertAll(
                () -> assertEquals(45000, tp.calculatePrice(65, "ngay_thuong")),
                () -> assertEquals(52000, tp.calculatePrice(65, "cuoi_tuan")),
                () -> assertEquals(52000, tp.calculatePrice(65, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age over 100")
        //Testcase R16 - R18
    void testOver100() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(104, "ngay_thuong")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(104, "cuoi_tuan")),
                () -> assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(104, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age norm")
        //Testcase R19 - R21
    void testNorm() {
        assertAll(
                () -> assertEquals(60000, tp.calculatePrice(25, "ngay_thuong")),
                () -> assertEquals(69000, tp.calculatePrice(25, "cuoi_tuan")),
                () -> assertEquals(69000, tp.calculatePrice(25, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age min")
        //Testcase R22 - R24
    void testMin() {
        assertAll(
                () -> assertEquals(45000, tp.calculatePrice(5, "ngay_thuong")),
                () -> assertEquals(52000, tp.calculatePrice(5, "cuoi_tuan")),
                () -> assertEquals(52000, tp.calculatePrice(5, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age min+")
        //Testcase R25 - R27
    void testMinPlus() {
        assertAll(
                () -> assertEquals(45000, tp.calculatePrice(6, "ngay_thuong")),
                () -> assertEquals(52000, tp.calculatePrice(6, "cuoi_tuan")),
                () -> assertEquals(52000, tp.calculatePrice(6, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age max")
        //Testcase R28 - R30
    void testMax() {
        assertAll(
                () -> assertEquals(45000, tp.calculatePrice(99, "ngay_thuong")),
                () -> assertEquals(52000, tp.calculatePrice(99, "cuoi_tuan")),
                () -> assertEquals(52000, tp.calculatePrice(99, "ngay_le"))
        );
    }

    @Test
    @DisplayName("Test age max-")
        //Testcase R31 - R33
    void testMaxMinus() {
        assertAll(
                () -> assertEquals(45000, tp.calculatePrice(98, "ngay_thuong")),
                () -> assertEquals(52000, tp.calculatePrice(98, "cuoi_tuan")),
                () -> assertEquals(52000, tp.calculatePrice(98, "ngay_le"))
        );
    }

}
