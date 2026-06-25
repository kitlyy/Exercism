class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
            } else if (!(operation.equals("+") || operation.equals("*") || operation.equals("/"))) {
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }
            return switch (operation) {
                case ("+") -> String.format("%d %s %d = " + (operand1 + operand2), operand1, operation, operand2);
                case ("*") -> String.format("%d %s %d = " + (operand1 * operand2), operand1, operation, operand2);
                case ("/") -> String.format("%d %s %d = " + (operand1 / operand2), operand1, operation, operand2);
                default -> "";
            };
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Operation cannot be null");
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
