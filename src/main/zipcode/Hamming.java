package zipcode;

public class Hamming {
    public String firstString = null;
    public String secondString = null;

    public Hamming(String s, String s1) {
        if (s.length() != s1.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        firstString = s;
        secondString = s1;
    }

    public int getHammingDistance() {
        char[] charArr = firstString.toCharArray();
        char[] charArr2 = secondString.toCharArray();
        int distance = 0;
        for (int x = 0; x < charArr.length; x++) {
            if (charArr[x] != charArr2[x])
                distance++;
        }
        return distance;
    }
}

