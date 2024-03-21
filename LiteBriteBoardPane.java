import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LiteBriteBoardPane extends GridPane {
    private LitePegButton[][] pegs;

    public LiteBriteBoardPane(EventHandler<ActionEvent> handler, int rows, int columns) {
        pegs = new LitePegButton[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                LitePegButton peg = new LitePegButton();
                peg.setOnAction(handler);
                pegs[i][j] = peg;

                this.add(peg, j, i);

            }
        }
    }
    
    public void reset() {

        for(int i = 0; i < pegs.length; i++) {
            for (int j = 0; j < pegs[i].length; j++) {
                pegs[i][j].resetColor();
            }
        }

        
    }
}
