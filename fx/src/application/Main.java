package application;

import java.util.ArrayList;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.geometry.Bounds;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class Main extends Application {


	Rectangle snake;
	Circle apple;
	Line leaf;

	//Rectangle snake2;
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 1000, 1000);


			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);



			// Snake
			double Xsnake =  ((Math.random() * 600));// snake x coordinate
			double Ysnake =  (Math.random() * 600);// snake y coordinate
			double WidthSnake = (double) 20;// width
			double LengthSnake = (double) 15;// length

			snake = new Rectangle(Xsnake, Ysnake, WidthSnake,LengthSnake);
			double r =Math.random(); //red
			double g= Math.random(); //green
			double b= Math.random(); //blue component
			double t=Math.random(); //transparency
			Color color=new Color(r,g,b,t); //Create new random color
			snake.setFill(color);
			root.getChildren().add(snake);

			//Array of Rectangles http://www.dreamincode.net/forums/topic/301160-how-do-i-make-an-arraylist-of-rectangles/
			ArrayList<Rectangle> Tail = new ArrayList<Rectangle>();


			// Apple
			double Xapple =  ((Math.random() * 500));
			double Yapple =  ((Math.random() * 500)+70);

			apple = new Circle(9);
			apple.setCenterX(Xapple);
			apple.setCenterY(Yapple);
			apple.setFill(Color.RED);
			root.getChildren().add(apple);
			leaf = new Line(Xapple, Yapple - 10, Xapple, Yapple - 15);
			leaf.setStroke(Color.GREEN);
			root.getChildren().add(leaf);
			if(apple.getCenterX()>=1001|| apple.getCenterX()<=1||apple.getCenterY()>=1001||apple.getCenterY()<=1){
				apple.setCenterX(50);
				apple.setCenterY(300);
			}

			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				public void handle(final KeyEvent keyEvent) {
					if (keyEvent.getCode() == KeyCode.UP) {
						snake.setY(snake.getY() - 10);
						for(int i=0; i<Tail.size(); i++){
							Rectangle cRect=Tail.get(i);
							cRect.setY(cRect.getY()-10);
						}

						keyEvent.consume();
					}
					if (keyEvent.getCode() == KeyCode.DOWN) {

						snake.setY(snake.getY() + 10);
						for(int i=0; i<Tail.size(); i++){
							Rectangle cRect=Tail.get(i);
							cRect.setY(cRect.getY()+10);
						}
						keyEvent.consume();
					}

					if (keyEvent.getCode() == KeyCode.RIGHT) {
						snake.setX(snake.getX() + 10);
						for(int i=0; i<Tail.size(); i++){
							Rectangle cRect=Tail.get(i);
							cRect.setX(cRect.getX()+10);
						}
						keyEvent.consume();
					}
					if (keyEvent.getCode() == KeyCode.LEFT) {
						snake.setX(snake.getX() - 10);
						for(int i=0; i<Tail.size(); i++){
							Rectangle cRect=Tail.get(i);
							cRect.setX(cRect.getX()-10);
						}
						keyEvent.consume();
					}
					Bounds bapple = apple.getBoundsInLocal();
					Bounds bsnake = snake.getBoundsInLocal();
					//for(int m=0;m<Tail.size();m++){
					//Bounds bTail = Tail.get(m).getBoundsInLocal();

					if (apple.intersects(bsnake) || snake.intersects(bapple)){//|| apple.intersects(bTail)|| bTail.intersects(bapple)) {
						snake.setWidth(snake.getWidth()+15);

						//Adding extra square to snake directly
						Tail.add(new Rectangle(snake.getX()-20,snake.getY(),20,15));
						root.getChildren().addAll(Tail);

						//Adding extra square in place of apple
						//Tail.add(new Rectangle(apple.getCenterX(),apple.getCenterY(),20,15));
						//root.getChildren().addAll(Tail);
						//snake.setWidth(Tail.size()*20);


						apple.setCenterX(apple.getCenterX() + Math.random() * 600);
						apple.setCenterY(apple.getCenterY() + (Math.random() * 300));
						if(apple.getCenterX()>=1001|| apple.getCenterX()<=1||apple.getCenterY()>=1001||apple.getCenterY()<=1){
							apple.setCenterX(50);
							apple.setCenterY(300);
						}
						leaf.setStartX(apple.getCenterX());
						leaf.setEndX(apple.getCenterX());
						leaf.setStartY(apple.getCenterY()-10);
						leaf.setEndY(apple.getCenterY()-15);
					}


					//Gameover Alert & reset game:
					if (
							snake.getX()+snake.getTranslateX()<= 0  ||
							snake.getX()+snake.getTranslateX()>= 1000 ||
							snake.getY()+snake.getTranslateY() >= 1001 ||
							snake.getY()+snake.getTranslateY() <= -1   )
					{

						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("GameOver");
						alert.setContentText("GameOver!");
						alert.showAndWait();
						start(primaryStage);
					}

				}	});

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
