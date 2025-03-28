public class Integer {
    private final int value;
    private static final int MIN_VALUE = -2147483648;
    private static final int MAX_VALUE = 2147483647;

    static final Integer[] cache;
    static {
        // static initializer is like a constructor for static things
        // it is only called once, when the class is first loaded
        cache = new Integer[- MIN_VALUE + Integer.MAX_VALUE + 1];
        for (int i = 0; i < cache.length; i++)
            cache[i] = new Integer(Integer.MIN_VALUE + i);
    }

    public static Integer valueOf(int i) {
      return cache[MIN_VALUE + i];
    }

    private Integer(int i) {
      this.value = i;
    }

    public int getValue() {
        return value;
    }
}
