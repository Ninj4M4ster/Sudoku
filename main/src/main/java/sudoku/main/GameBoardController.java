package sudoku.main;

import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.Node;
import javafx.geometry.*;
import java.io.IOException;
import javafx.fxml.FXML;

public class GameBoardController {
    @FXML
    private VBox root;
    @FXML
    private HBox options_container;
    @FXML
    private HBox game_status_layout;
    @FXML
    private GridPane game_board_layout;
    @FXML
    private HBox game_buttons_layout;

    private Tile[][][][] board_tiles = new Tile[3][3][3][3];
    
    @FXML
    public void initialize() {
        // create tiles
        for(int row=0; row < 3; row++) {
            for(int column=0; column < 3; column ++) {
                GridPane sub_gridpane = new GridPane();
                for(int tile_row=0; tile_row < 3; tile_row++) {
                    for(int tile_column=0; tile_column < 3; tile_column++) {
                        Tile tile = new Tile(tile_column + " " + tile_row);
                        tile.setStyle("-fx-border-color:black; -fx-border-width:1;");
                        board_tiles[column][row][tile_column][tile_row] = tile;
                        sub_gridpane.add(tile, tile_column, tile_row);
                    }
                }
                game_board_layout.add(sub_gridpane, column, row);
                sub_gridpane.setStyle("-fx-border-color:black; -fx-border-width:5;");
                sub_gridpane.setVgap(-1);
                sub_gridpane.setHgap(-1);
            }
        }
    }
}
