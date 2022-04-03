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
    void user_hasProgress() {
        RankingSystemUser user = new RankingSystemUser();
        assertEquals(0, user.getProgress());
    }

    @Test
    void user_canIncreaseProgress() {
        int testRank = -7;
        user.incProgress(testRank);
        assertEquals(10, user.getProgress());
    }

    @Test
    void user_levelsUp_ifProgressReaches100() {
        user.setProgress(90);
        user.incProgress(-7);
        assertEquals(-7, user.getRank());
    }

    @Test
    void when_user_levelsUp_Progress_goesBack100(){
        user.setProgress(90);
        user.incProgress(-7);
        assertEquals(0, user.getRank());
    }


}