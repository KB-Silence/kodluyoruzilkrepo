public class LetterWithStar {
    public static void main(String[] args) {
        String[][] letterA = new String[5][4];
        for (int row = 0; row < letterA.length; row++) {
            for (int col = 0; col < letterA[row].length; col++) {
                if (row == 0 || row == 2) {
                    if (row == 0 && (col == 0 || col == 3)) {
                        letterA[row][col] = "   ";
                    } else {
                        letterA[row][col] = " * ";
                    }

                } else if (col == 0 || col == 3) {
                    letterA[row][col] = " * ";
                } else {
                    letterA[row][col] = "   ";
                }
            }
        }
        for (String[] row : letterA) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println();

        String[][] letterB = new String[7][4];
        for (int row = 0; row < letterB.length; row++) {
            for (int col = 0; col < letterB[row].length; col++) {
                if (row == 0 || row == 3 || row == 6) {
                    if (col < 3) {
                        letterB[row][col] = " * ";
                    } else {
                        letterB[row][col] = "   ";
                    }
                } else if (col == 0 || col == 3) {
                    letterB[row][col] = " * ";
                } else {
                    letterB[row][col] = "   ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println();

        String[][] letterP = new String[7][4];
        for (int row = 0; row < letterP.length; row++) {
            for (int col = 0; col < letterP[row].length; col++) {
                if (row == 0 || row == 3) {
                    if (col < 3) {
                        letterP[row][col] = " * ";
                    } else {
                        letterP[row][col] = "   ";
                    }
                } else if (col == 0) {
                    letterP[row][col] = " * ";
                } else if (row < 3 && col == 3) {
                    letterP[row][col] = " * ";
                } else {
                    letterP[row][col] = "   ";
                }
            }
        }

        for (String[] row : letterP) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
