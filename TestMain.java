import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test1_findFlowerInRoom();

    }

    @Before
    public void setup() {

    }

    @Test
    public void test1_findFlowerInRoom()
    {   
        int i = 0; 
        while (i < 8) {
            i = i + 1;
            Map.getInstance().changeSize(8, 8);
            int yFlower = 2;
            int xFlower = 6;
            int yStart = 4;
            int xStart = 3;
            CompassDirection dStart = EAST;
            Map.getInstance().placeFlower(yFlower, xFlower);
            Jeroo j1 = new Jeroo(yStart,  xStart, dStart, 0);
            j1.findFlowerInRoom();
            int w = Map.getInstance().getColumns();
            int h = Map.getInstance().getRows();
            assertTrue("should be at (" + yFlower + ", " + xFlower + ")", Map.getInstance().isJeroo(yFlower, xFlower));

        }

    }

}

