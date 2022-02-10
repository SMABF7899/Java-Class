package tamrin5;

public class Soldier {
    private final int id;
    private int[] bullet = new int[4];
    private String initialRank;
    private String finalRank;
    private int finalScore;

    Soldier(int id){
        this.id = id;
    }

    public void setBullet(int[] bullet) {
        this.bullet = bullet;
    }

    public void setFinalRank(String finalRank) {
        this.finalRank = finalRank;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public void setInitialRank(String initialRank) {
        this.initialRank = initialRank;
    }

    public int getId() {
        return id;
    }

    public int[] getBullet() {
        return bullet;
    }

    public String getInitialRank() {
        return initialRank;
    }

    public String getFinalRank() {
        return finalRank;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public static float personOfCorporals(int n) {
        return (n / 30f) * 100;
    }
}
