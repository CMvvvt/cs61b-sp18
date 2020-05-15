package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer arb = new ArrayRingBuffer(10);
        assertEquals(true, arb.isEmpty());

        arb.enqueue(11);
        arb.enqueue(22);
        arb.enqueue(33);

        assertEquals(11, arb.peek());
        assertEquals(11, arb.dequeue());

        assertEquals(false, arb.isEmpty());
        assertEquals(false, arb.isFull());

        arb.enqueue(44);
        arb.enqueue(55);
        arb.enqueue(66);
        arb.enqueue(77);
        arb.enqueue(88);
        arb.enqueue(99);
        arb.enqueue(1010);
        arb.enqueue(1111);

        assertEquals(true, arb.isFull());

        for (Object i: arb) {
            System.out.println(i);
        }
    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
