module sudoku.main {
    requires javafx.controls;
    requires javafx.fxml;

    opens sudoku.main to javafx.fxml;
    exports sudoku.main;
}
