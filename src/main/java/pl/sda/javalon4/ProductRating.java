package pl.sda.javalon4;

public class ProductRating {

    private int score = 3;

    //Alt+Insert -> Getter&Setter
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        if(score < 1)
            this.score = 1;
        if(score > 5)
            this.score = 5;
    }
}
