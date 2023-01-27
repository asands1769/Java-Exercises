package randomPractice;

import java.util.Objects;

public class tryingStuff {

    public int boilingPoint = 212;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        tryingStuff that = (tryingStuff) o;
        return boilingPoint == that.boilingPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boilingPoint);
    }

    public static tryingStuff stuff1 = new tryingStuff();
    public static tryingStuff2 stuff2 = new tryingStuff2();

    public static void main(String[] args){
        System.out.println(stuff1.equals(stuff2));
    }

}
