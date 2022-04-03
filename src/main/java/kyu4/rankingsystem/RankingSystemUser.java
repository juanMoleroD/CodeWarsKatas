package kyu4.rankingsystem;

import java.util.ArrayList;
import java.util.List;

public class RankingSystemUser {

    private int rank;
    private int progress;

    final private List<Integer> listOfRanks = new ArrayList<>(List.of(-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8));

    public RankingSystemUser() {
        this.rank = -8;
        this.progress = 0;
    }

    void incProgress(int activityRank) throws IllegalArgumentException {
            if (!listOfRanks.contains(activityRank))
                throw new IllegalArgumentException("invalid activity rank");

            int currentRankIndex = listOfRanks.indexOf(getRank());
            int activityRankIndex = listOfRanks.indexOf(activityRank);
            int differenceInRankAndActivityIndex = activityRankIndex - currentRankIndex;

            if (differenceInRankAndActivityIndex == 0) progress += 3;
            if (differenceInRankAndActivityIndex == -1) progress += 1;
            if (differenceInRankAndActivityIndex >= -2) progress += 0;

            if (differenceInRankAndActivityIndex > 0)
                progress += 10 * differenceInRankAndActivityIndex * differenceInRankAndActivityIndex;

            while (getProgress() >= 100) levelUp();
            if (listOfRanks.indexOf(getRank()) >= listOfRanks.size() - 1) setProgress(0);
    }

    private void levelUp() {
        int currentRankIndex = listOfRanks.indexOf(getRank());
        setRank(listOfRanks.get(currentRankIndex + 1));
        setProgress(progress - 100);
    }



    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        if (listOfRanks.contains(rank)) this.rank = rank;
    }

    int getProgress() {
        return progress;
    }

    void setProgress(int progress) {
        this.progress = progress;
    }
}
