package sudoku.main;

import javafx.beans.NamedArg;
import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;

public class Tile extends Label {
    public Tile(@NamedArg("text") String text) {
        this.setText(text);
    }
}