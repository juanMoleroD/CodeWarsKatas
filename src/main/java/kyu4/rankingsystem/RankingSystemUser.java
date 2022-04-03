package kyu4.rankingsystem;

public class RankingSystemUser {

    private int rank;
    private int progress;

    public RankingSystemUser() {
        this.rank = -8;
        this.progress = 0;
    }

    void incProgress(int testRank) {
        progress = 10;
        this.setRank(-7);
    }





    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    int getProgress() {
        return progress;
    }

    void setProgress(int progress) {
        this.progress = progress;
    }
}
