package pl.sda.javalon4;

public class ProductRatingWithExceptions {

    private int score = 3;

    public int getScore() {
        return score;
    }

    //Przyklady wyjatkow wchodzacych w sklad Java SE:
    //NullPointerException - wskazuje na pusta referencje do obiektu
    //IllegalArgumentException - wskazuje na bledy parametr wejsciowy metody
    //IllegalStateException - wskazuje, ze obiekt znajduje sie w nieprawidlowym stanie
    //itd.
    public void setScore(int score) {
        this.score = score;
        if(score < 1)
            throw new IllegalArgumentException();
        if(score > 5)
            throw new IllegalArgumentException();
    }

}
