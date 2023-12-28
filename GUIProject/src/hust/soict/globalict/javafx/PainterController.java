package hust.soict.globalict.javafx;

import javafx.scene.paint.Color;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

// Hoàng Tố An - 20214980
public class PainterController {
	@FXML
	private Pane drawingAreaPane;
	@FXML
	private ToggleGroup Tools;
	@FXML
	private Color curColor = Color.BLACK;
	
	@FXML
	void clearButtonPressed(ActionEvent event)
	{
		drawingAreaPane.getChildren().clear();
	}
	@FXML
	void drawingAreaMouseDragged(MouseEvent event)
	{
		Circle newCircle = new Circle(event.getX(), event.getY(), 4, curColor);
		drawingAreaPane.getChildren().add(newCircle);
	}
	@FXML
	void penRB(ActionEvent event)
	{
		curColor = Color.BLACK;
	}
	@FXML
	void eraserRB(ActionEvent event)
	{
		curColor = Color.WHITE;
	}
}
