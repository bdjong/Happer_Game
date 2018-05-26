import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class SpelObject extends Node{

    public Image texture;

    private int x;
    private int y;

    public abstract void Draw(GraphicsContext graphics);

    public int GetX() {

        return this.x;
    }

    public int GetY() {

        return this.y;
    }

    protected void SetX(int xValue) {

        this.x = xValue;
    }

    protected void SetY(int yValue) {

        this.y = yValue;
    }
}