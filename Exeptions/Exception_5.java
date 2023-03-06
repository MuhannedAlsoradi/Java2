class TooSmallException extends ArithmeticException {
    public TooSmallException() {
        super("value is less than 100");
    }

    public TooSmallException(String message) {
        super(message);
    }
}

class Exception_5 {
    public static int compute(int x, int y) {
        if (x < 100 || y < 100) {
            throw new TooSmallException();
        } else
            return x + y;
    }

    public static void main(String[] args) {
        try {
            System.out.println(compute(100, 100));
        } catch (TooSmallException e) {
            System.out.println(e);
        }
    }
}
