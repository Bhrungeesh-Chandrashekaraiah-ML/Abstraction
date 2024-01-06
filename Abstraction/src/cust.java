class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}


class Example {
    void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        }
    }

    public static void main(String[] args) {
        Example example = new Example();

        try {
            example.checkValue(-5);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());

        }
    }
}
