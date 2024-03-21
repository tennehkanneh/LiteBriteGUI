import javafx.scene.control.Button;

public class LitePegButton extends Button {
    private static final Color[] COLORS = { Color.black, Color.purple, Color.blue,
                                            Color.lawngreen, Color.yellow, Color.orange,
                                            Color.red, Color.pink, Color.white           
                                          };
    private int colorIndex;

    public LitePegButton() {
        colorIndex = 0;

        setStyle(COLORS[colorIndex].getBackground());
        this.setPrefSize(25, 25);

    }

    public Color getColor() {
        return COLORS[colorIndex];
    }

    public void resetColor() {
        colorIndex = 0;
        setStyle(COLORS[colorIndex].getBackground());

    }

    public void changeColor() {
        colorIndex = (colorIndex + 1) % COLORS.length;
        setStyle(COLORS[colorIndex].getBackground());
    }
}
