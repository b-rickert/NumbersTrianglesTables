package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < numberOfStars; i++) {
            row = row + "*";
        }
        return row;
    }

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            triangle = triangle += getRow(i) + "*\n"; {

            }
        }
        return triangle;
    } 

    // hmm
    
    public static String getSmallTriangle() {
        String smallTriangle = numberOfRows(i) + triangle(i) {
            return smallTriangle;
        }
    }

    public static String getLargeTriangle() {
        return null;
    }
}
