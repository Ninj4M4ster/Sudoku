package sudoku.main;

import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {
    @FXML
    private VBox buttons_layout;
    @FXML
    private Button new_game_button;
    @FXML
    private Button continue_button;
    @FXML
    private Button exit_button;

    @FXML
    private void StartNewGame() throws IOException {
        App.setRoot("game_board");
    }
}