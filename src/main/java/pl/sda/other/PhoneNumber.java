package pl.sda.other;

import java.util.Objects;

public class PhoneNumber {

    int prefix; //48
    int number; //777666111

    public PhoneNumber(int prefix, int number) {
        this.prefix = prefix;
        this.number = number;
    }

    //Alt+Insert -> equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return prefix == that.prefix &&
                number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, number);
    }
}
