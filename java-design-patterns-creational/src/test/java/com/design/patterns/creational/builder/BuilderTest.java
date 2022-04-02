package com.design.patterns.creational.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * @author : Lyes Sefiane
 * @mailto : lyes.sefiane@gmail.com
 * @created : 2022-04-02 4:12 p.m.
 */
class BuilderTest {

    private Bedroom bedroom;

    @Test
    @DisplayName("Builder Design Pattern")
    public void testCreatedBedroomIsNotNull() {
        // Given a bedroom

        // When
        bedroom = new BedroomBuilder()//
                .setDimensions(new Dimension(200, 100))//
                .setCellingHeight(132).setFloorNumber(2)//
                .setNumberOfDoors(4)//
                .setNumberOfWindows(16)//
                .setWallColor(Color.CYAN)//
                .build();

        // Then
        assertNotNull(bedroom);
    }




}