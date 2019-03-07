package com.violence.bowling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */


public class Main {
    public static void main(String[] args) {
        Bowling bowlingGame = new Bowling();
        String text = "X|7/|9-|X|-8|8/|-6|X|X|X||81";
        String[] parsedText = text.split("[|]+");
        System.out.println(Arrays.toString(parsedText));
        List<Frame> frames = new ArrayList<>();

        for (int i = 0; i < parsedText.length; i++) {
            frames.add(new Frame(parsedText[i].toCharArray()));
        }
        for (Frame frame : frames) {
            System.out.println(frame);
        }
        System.out.println(bowlingGame.calcTotalPoint(frames));
    }
}
