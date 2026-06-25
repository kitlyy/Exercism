class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int result = 0;
        int original = numberToCheck;
        int index = String.valueOf(numberToCheck).length();
        while (numberToCheck != 0) {
            int digit = numberToCheck % 10;
            result += (int) Math.pow(digit, index);
            numberToCheck /= 10;
        }
        return result == original;
    }

}
