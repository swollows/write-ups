package androidx.core.math;

public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int x, int y) {
        int sum = x + y;
        boolean z = true;
        if ((x >= 0) == (y >= 0)) {
            boolean z2 = x >= 0;
            if (sum < 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return sum;
    }

    public static long addExact(long x, long y) {
        long sum = x + y;
        boolean z = true;
        if ((x >= 0) == (y >= 0)) {
            boolean z2 = x >= 0;
            if (sum < 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return sum;
    }

    public static int subtractExact(int x, int y) {
        int difference = x - y;
        boolean z = true;
        if ((x < 0) != (y < 0)) {
            boolean z2 = x < 0;
            if (difference >= 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return difference;
    }

    public static long subtractExact(long x, long y) {
        long difference = x - y;
        boolean z = true;
        if ((x < 0) != (y < 0)) {
            boolean z2 = x < 0;
            if (difference >= 0) {
                z = false;
            }
            if (z2 != z) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return difference;
    }

    public static int multiplyExact(int x, int y) {
        int product = x * y;
        if (x == 0 || y == 0 || (product / x == y && product / y == x)) {
            return product;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long multiplyExact(long x, long y) {
        long product = x * y;
        if (x == 0 || y == 0 || (product / x == y && product / y == x)) {
            return product;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int a) {
        if (a != Integer.MAX_VALUE) {
            return a + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long a) {
        if (a != Long.MAX_VALUE) {
            return 1 + a;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int decrementExact(int a) {
        if (a != Integer.MIN_VALUE) {
            return a - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long decrementExact(long a) {
        if (a != Long.MIN_VALUE) {
            return a - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int a) {
        if (a != Integer.MIN_VALUE) {
            return -a;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long a) {
        if (a != Long.MIN_VALUE) {
            return -a;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int toIntExact(long value) {
        if (value <= 2147483647L && value >= -2147483648L) {
            return (int) value;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static float clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public static double clamp(double value, double min, double max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public static long clamp(long value, long min, long max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }
}
