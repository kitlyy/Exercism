import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger result = BigInteger.TWO.pow(square - 1);
        return result;
    }

    BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.ZERO;
        for (int i = 1; i < 65; i ++) {
            result = result.add(grainsOnSquare(i));
        }
        return result;
    }

}
