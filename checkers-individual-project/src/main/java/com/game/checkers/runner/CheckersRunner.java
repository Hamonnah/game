package com.game.checkers.runner;

import com.game.checkers.board.Board;
import com.game.checkers.board.Graphics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CheckersRunner extends Application {

    private Board board = new Board();
    private static Stage primaryStage;
    private Graphics checkersBoard= new Graphics(board);

    @Override
    public void start(Stage primaryStage) throws Exception {


        this.primaryStage = primaryStage;
        Scene scene = new Scene(checkersBoard.getBorderPane(), 585, 612, Color.BLACK);
        primaryStage.setTitle("Checkers Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
