package com.violence.bowling;

import java.util.List;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */

public class Bowling {
    public int calcTotalPoint(List<Frame> frameList) {
        int totalPoints = 0;
        for (int i = 0; i < frameList.size(); i++) {
            if (frameList.get(i).isStrike()) {
                if (!frameList.get(i + 1).isStrike()) {
                    totalPoints += frameList.get(i).getFirstThrow() + frameList.get(i + 1).getFirstThrow() + frameList.get(i + 1).getSecondThrow();
                } else {
                    totalPoints += frameList.get(i).getFirstThrow() + frameList.get(i + 1).getFirstThrow() + frameList.get(i + 2).getFirstThrow();
                }
            } else if (frameList.get(i).isSpare()) {
                totalPoints += frameList.get(i).getTotalPoints() + frameList.get(i + 1).getFirstThrow();
            } else {
                totalPoints += frameList.get(i).getTotalPoints();
            }
        }
        return totalPoints;
    }
}
