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
        int distance = 0;
        for (int x = 0; x < firstString.length(); x++) {
            if (firstString.charAt(x) != secondString.charAt(x))
                distance++;
        }
        return distance;
    }
}

