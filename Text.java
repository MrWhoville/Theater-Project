import org.code.theater.*;
import org.code.media.*;

  /**
   * Superclass that is similar to the BackgroundScene class but is used for displaying text, rather than images.
   */
public class Text{ 

private String message;
private int X;
private int Y;
  
  /**
  * Constructor for the Text object that contains paramters such as the message, plus the x and y values.
  */
  public Text(String message, int X, int Y) {
    this.message = message;
    this.X = X;
    this.Y = Y;
  }

  /**
  * Method to get the int value of x.
  */
  public int getX() {
    return X;
  }

  /**
  * Method to get the int value of y.
  */
  public int getY() {
    return Y;
  }
  
  /**
  * Method to get the string value of text.
  */
  public String getText() {
    return message;
  }


}
