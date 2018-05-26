import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Speler extends BewegendObject {

    public Image texture;
    private int livesLeft;

    public Speler(int lives) {

        this.livesLeft = lives;
    }

    public void Move() {

        // TODO
    }

    public void Draw(GraphicsContext graphics) {

        // TODO
    }

    public int GetLivesLeft() {

        return livesLeft;
    }

    public void SetLivesLeft(int lives) {

        livesLeft = lives;
    }

	@Override
	protected boolean impl_computeContains(double arg0, double arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BaseBounds impl_computeGeomBounds(BaseBounds arg0, BaseTransform arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected NGNode impl_createPeer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object impl_processMXNode(MXNodeAlgorithm arg0, MXNodeAlgorithmContext arg1) {
		// TODO Auto-generated method stub
		return null;
	}
}