package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketPriceTestControlTest {

    TicketPrice tp = new TicketPrice();

    @Test
    @DisplayName("Test control flow R1")
    void testR1() {
        assertThrows(IllegalArgumentException.class, () -> tp.calculatePrice(2, "ngay_thuong"));
    }

    @Test
    @DisplayName("Test control flow R2")
    void testR2() {
        assertEquals(45000, tp.calculatePrice(6, "ngay_thuong"));
    }

    @Test
    @DisplayName("Test control flow R3")
    void testR3() {
        assertEquals(52000, tp.calculatePrice(6, "cuoi_tuan"));
    }

    @Test
    @DisplayName("Test control flow R4")
    void testR4() {
        assertEquals(60000, tp.calculatePrice(25, "ngay_thuong"));
    }

    @Test
    @DisplayName("Test control flow R5")
    void testR5() {
        assertEquals(69000, tp.calculatePrice(25, "ngay_le"));
    }

    @Test
    @DisplayName("Test control flow R6")
    void testR6() {
        assertEquals(45000, tp.calculatePrice(70, "ngay_thuong"));
    }

    @Test
    @DisplayName("Test control flow R7")
    void testR7() {
        assertEquals(52000, tp.calculatePrice(70, "ngay_le"));
    }

}