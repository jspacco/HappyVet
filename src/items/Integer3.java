package items;
/**
 * Fastest version! But, does minimal caching
 * 
 * Only cache 2^8 or 256 values, from -128 to 127
 * 
 * This means that values outside of that range create new instances each time,
 * even with the static factor method.
 */
public class Integer3 {
    private final int value;
    private static final int MIN_VALUE = -128;
    private static final int MAX_VALUE = 127;

    private static final long start;

    static final Integer3[] cache;

    static {
      start = System.currentTimeMillis();
      // static initializer is like a constructor for static things
      // it is only called once, when the class is first loaded
      
      // leave the cache empty
      cache = new Integer3[- MIN_VALUE + Integer3.MAX_VALUE + 1];
    }

    public static Integer3 valueOf(int i) {
        if (i < MIN_VALUE || i > MAX_VALUE) return new Integer3(i);

        int index = i + -MIN_VALUE;
        if (cache[index] == null) cache[index] = new Integer3(i);
        return cache[index];
    }

    private Integer3(int i) {
      this.value = i;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args)
    {
      Integer3 i1 = Integer3.valueOf(5);
      Integer3 i2 = Integer3.valueOf(5);
      System.out.printf("i1 is %s with hashcode %x\n", i1, i1.hashCode());
      System.out.printf("i2 is %s with hashcode %x\n", i2, i2.hashCode());
      // make sure these values are the same
      assert i1 == i2;
      long total = System.currentTimeMillis() - start;
      System.out.println(total);
      System.out.printf("This code took about %.3f seconds\n", (total/1000.0));

      Integer3 i3 = Integer3.valueOf(1001);
      Integer3 i4 = Integer3.valueOf(1001);
      System.out.printf("i3 is %s with hashcode %x\n", i3, i3.hashCode());
      System.out.printf("i4 is %s with hashcode %x\n", i4, i4.hashCode());
    }
}
