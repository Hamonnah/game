package com.game.checkers.board;

import com.game.checkers.pieces.Piece;
import com.game.checkers.pieces.PositionOfPieces;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.Map;


public class Graphics {

    private Board board;
    private BorderPane borderPane = new BorderPane();
    private static GridPane grid = new GridPane();
    private Background background;
    private final Image imageBoard = new Image(Resources.getPath("board.jpg"));
    private final Image imageWhitePiece = new Image(Resources.getPath("white-normal.png"));

    public Graphics(Board board) {
        this.board = board;
        borderPane.setBackground(createBoardBackground());

        createBoardBackground();

        createPieces();
    }

    private void createPieces() {
        for(Map.Entry<PositionOfPieces, Piece> pieces : board.getBoard().entrySet()) {

            addPiece(pieces.getKey(), pieces.getValue());
        }
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }

    private Background createBoardBackground() {
        BackgroundSize backgroundSize = new BackgroundSize(612, 612, false, false, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBoard, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;
    }



    private static Image generateImagePath(Piece piece) {
            return new Image(Resources.getPath( "white-normal.png"));
    }

    protected static void addPiece(PositionOfPieces position, Piece piece) {
        grid.add(new ImageView(generateImagePath(piece)), position.getCol(), position.getRow());
    }

}