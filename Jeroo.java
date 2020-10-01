/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    
    /**
     */
    public void findFlowerInRoom() 
    {
        goToOrgin();
        while(!Facing(SOUTH)){
            turn(LEFT);
            
        while(!isFlower(HERE)){
            if(!isWater(AHEAD))
                hop();
            else if (isFacing(SOUTH)){
                turn(LEFT);
                hop();
                turn(LEFT);
            }else{
                turn(RIGHT);
                hop();
                turn(RIGHT);
            }
          }
        }
                
                
       
            
           

    }


    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

