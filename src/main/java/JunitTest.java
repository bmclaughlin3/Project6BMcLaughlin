import org.junit.Test;
import java.awt.*;

public class JunitTest {

    //Runs test to see if rectangle 1 hits rectangle 2
    @Test
    public void test() {
        Rectangle r1 = new Rectangle(0, 5, 5, 0);
        Rectangle r2 = new Rectangle(0, 5, 5, 0);
        assert r1.doesHit(r2);
        assert true;
    }

    //Testing 2 rectangles far from each other
    @Test
    public void test2() {
        Rectangle r3 = new Rectangle(1, 3, 3, 1);
        Rectangle r4 = new Rectangle(40, 59, 59, 40);
        assert r3.doesHit(r4);
        assert false;
    }

    //Testing rectangle against itself
    @Test
    public void test3() {
        Rectangle r5 = new Rectangle(5, 10, 10, 5);
        assert r5.doesHit(r5);
        assert true;
    }

    //Testing a rectangle only partially touching rectangle 6
    @Test
    public void test4() {
        Rectangle r6 = new Rectangle(0, 5, 5, 0);
        Rectangle r7 = new Rectangle(2, 7, 7, 2);
        assert r6.doesHit(r7);
        assert true;
    }
}
