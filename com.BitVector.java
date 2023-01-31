public class BitVector {
    private final int[] size;
    public BitVector(int bits) {
        size = new int[(bits + 31) / 32];
    }


    public void set(int bitNum) {
        int arrInd = (bitNum-1) / 32;       // find array's index
        int bitInd = (bitNum-1) % 32;       // find a bit number
        size[arrInd] |= 1 << bitInd;        // change bit to 1
        System.out.println(size[arrInd]);    // should print 0
    }

    public void reset(int bitNum) {
        int arrInd = (bitNum-1) / 32;     // find array's index
        int bitInd = (bitNum-1) % 32;      // find a bit number
        size[arrInd] &= ~(1 << bitInd);    // change bit to 0
        System.out.println(size[arrInd]);     // should print int number which is equal to a (bitIND-1) power of 2
    }

    public boolean get(int bitNum) {
        int arrInd = (bitNum-1) / 32;     // find a bit number
        int bitInd = (bitNum-1) % 32;       // find a bit number
        return (size[arrInd] & (1 << bitInd)) != 0;       // for checking the changes
    }

}
class Demo {
    public static void main(String[] args) {
        BitVector bv = new BitVector(100);      // Provide new vector with 100 bits
        bv.set(9); // change 9-th bit to 1
        System.out.println(bv.get(9));       // Output should be true
        bv.reset(9); // change 9-th bit to 0
        System.out.println(bv.get(9));      // Output should be false
    }
}
