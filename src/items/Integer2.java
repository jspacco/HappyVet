package items;

/**
 * This is faster than Integer1. We are still caching 200,000,000 numbers,
 * but we are not pre-creating them. We are only getting them as needed
 */
public class Integer2 {
    private final int value;
    private static final int MIN_VALUE = -100000000;
    private static final int MAX_VALUE = 100000000;

    private static final long start;

    static final Integer2[] cache;

    static {
      start = System.currentTimeMillis();
      // static initializer is like a constructor for static things
      // it is only called once, when the class is first loaded
      
      // leave the cache empty
      cache = new Integer2[- MIN_VALUE + Integer2.MAX_VALUE + 1];
    }

    public static Integer2 valueOf(int i) {
        int index = i + -MIN_VALUE;
        if (cache[index] == null) cache[index] = new Integer2(i);
        return cache[index];
    }

    private Integer2(int i) {
      this.value = i;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args)
    {
      Integer2 i1 = Integer2.valueOf(5);
      Integer2 i2 = Integer2.valueOf(5);
      System.out.printf("i1 is %s with hashcode %x\n", i1, i1.hashCode());
      System.out.printf("i2 is %s with hashcode %x\n", i2, i2.hashCode());
      // make sure these values are the same
      assert i1 == i2;
      long total = System.currentTimeMillis() - start;
      System.out.println(total);
      System.out.printf("This code took about %.3f seconds\n", (total/1000.0));
    }
}
