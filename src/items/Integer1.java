package items;

/*
 * Slowest version!
 * Cache 200,000,000 values, from -100,000,000 to 100,000,000
 * Also create all of the instances ahead of time
 * 
 * This takes about 2 seconds on my laptop. You can double MIN_VALUE and MAX_VALUE 
 * to make it take longer.
 */
public class Integer1 {
    private final int value;
    private static final int MIN_VALUE = -100000000;
    private static final int MAX_VALUE = 100000000;

    private static final long start;

    static final Integer1[] cache;

    static {
      start = System.currentTimeMillis();
      // static initializer is like a constructor for static things
      // it is only called once, when the class is first loaded
      cache = new Integer1[- MIN_VALUE + Integer1.MAX_VALUE + 1];
      // this is absurdly inefficient! We have to create 
      for (int i = 0; i < cache.length; i++)
        cache[i] = new Integer1(i + -MIN_VALUE);
    }

    public static Integer1 valueOf(int i) {
      return cache[i + -MIN_VALUE];
    }

    private Integer1(int i) {
      this.value = i;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args)
    {
      Integer1 i1 = Integer1.valueOf(5);
      Integer1 i2 = Integer1.valueOf(5);
      System.out.printf("i1 is %s with hashcode %x\n", i1, i1.hashCode());
      System.out.printf("i2 is %s with hashcode %x\n", i2, i2.hashCode());
      // make sure these values are the same
      assert i1 == i2;
      long total = System.currentTimeMillis() - start;
      System.out.println(total);
      System.out.printf("This code took about %.3f seconds\n", (total/1000.0));
    }
}
