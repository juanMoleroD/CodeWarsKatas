package kyu4.rankingsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankingSystemUserTest {

    RankingSystemUser user;

    @BeforeEach
    void setup() {
        user = new RankingSystemUser();
    }

    @Test
    void user_startsAtRank8() {
        assertEquals(-8, user.getRank());
    }

    @Test
    void userRankIsOnlyFromAllowedList() {
        user.setRank(-9);
        assertEquals(-8, user.getRank());
    }

    @Test
    void user_hasProgress() {
        RankingSystemUser user = new RankingSystemUser();
        assertEquals(0, user.getProgress());
    }

    @Test
    void user_canIncreaseProgress() {
        user.incProgress(-7);
        assertEquals(10, user.getProgress());
    }

    @Test
    void ifActivityRank_sameAsRank_increaseProgressBy3() {
        user.incProgress(-8);
        assertEquals(3, user.getProgress());
    }

    @Test
    void ifActivityRank_1RanksBelow_increaseProgressBy1() {
        user.setRank(-6);
        user.incProgress(-7);
        assertEquals(1, user.getProgress());
    }

    @Test
    void ifActivityRank_2RanksBelow_ignore() {
        user.setRank(-6);
        user.incProgress(-8);
        assertEquals(0, user.getProgress());
    }

    @Test
    void ifActivityRank_1RankAbove_increaseProgressBy10() {
        user.incProgress(-7);
        assertEquals(10, user.getProgress());
    }

    @Test
    void ifActivityRank_2RanksAbove_increaseProgressBy40() {
        user.incProgress(-6);
        assertEquals(40, user.getProgress());
    }

    @Test
    void ifActivityRank_3RanksAbove_increaseProgressBy90() {
        user.incProgress(-5);
        assertEquals(90, user.getProgress());
    }

    @Test
    void ifActivityRank_4RanksAbove_increaseProgressBy160() {
        user.incProgress(-4);
        assertEquals(60, user.getProgress());
    }

    @Test
    void ifActivityRank_over4RanksAbove_increaseProgressBy160() {
        user.incProgress(-3);
        assertEquals(60, user.getProgress());
    }


    @Test
    void user_levelsUp_ifProgressReaches100() {
        user.setProgress(90);
        user.incProgress(-7);
        assertEquals(-7, user.getRank());
    }

    @Test
    void userOnlyLevelsUp_whenProgressOver99() {
        user.incProgress(-7);
        assertEquals(-8, user.getRank());
    }

    @Test
    void when_user_levelsUp_Progress_goesBack100(){
        user.setProgress(90);
        user.incProgress(-7);
        assertEquals(0, user.getProgress());
    }

    @Test
    void when_user_levelsUp_Progress_goesBack100_andSavesExtra(){
        user.setProgress(99);
        user.incProgress(-7);
        assertEquals(9, user.getProgress());
    }

    @Test
    void levelUpAfterMinus7_isMinus6(){
        user.setRank(-7);
        user.setProgress(95);
        user.incProgress(-6);
        assertEquals(-6, user.getRank());
    }

    @Test
    void levelUpAfterMinus1_is1() {
        user.setRank(-1);
        user.setProgress(95);
        user.incProgress(1);
        assertEquals(1, user.getRank());
    }

    @Test
    void userProgressMaxIs0_whenLevelingUpTo8() {
        user.setRank(7);
        user.setProgress(95);
        user.incProgress(8);
        assertEquals(0, user.getProgress());
    }

    @Test
    void userProgressMaxIs0_whenAlready_Level8() {
        user.setRank(8);
        user.setProgress(5);
        user.incProgress(8);
        assertEquals(0, user.getProgress());
    }


}