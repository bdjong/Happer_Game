import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class BewegendObject extends SpelObject {

    public Image texture;

    public abstract void Move();
    public abstract void Draw(GraphicsContext graphics);
}