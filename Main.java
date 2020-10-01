import java.util.Random;
/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Random r = new Random();
        int w = r.nextInt(4) + 4;
        int h = r.nextInt(4) + 4;
        Map.getInstance().changeSize(h, w);
        new JerooGUI();
        Main m = new Main();
        m.runJerooCode();

    }

    /**
     * DO NOT TOUCH THIS!
     */
    public void runJerooCode() {
        Random r = new Random();

        

        int w = Map.getInstance().getColumns();
        int h = Map.getInstance().getRows();

        int yFlower = r.nextInt(h);
        int xFlower = r.nextInt(w);
        Jeroo temp = new Jeroo(yFlower, xFlower, NORTH, 1);
        temp.plant();
        temp.remove();

        int yStart = r.nextInt(h);
        int xStart = r.nextInt(w);
        int d = r.nextInt(4);
        CompassDirection dStart = NORTH;
        if (d == 0) 
            dStart = EAST;
        else if (d == 1)
            dStart = SOUTH;
        else if (d == 2)
            dStart = WEST;

        Jeroo j1 = new Jeroo(yStart,  xStart, dStart, 0);
        j1.findFlowerInRoom();

    }
}
