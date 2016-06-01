package maze;
import javax.swing.JPanel;

public class Tiles extends JPanel{
    int x, y;
    boolean isWall = true;
    
    public Tiles(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setWall(boolean isWall){
        this.isWall = isWall;
    }
}
