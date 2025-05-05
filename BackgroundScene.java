import org.code.theater.*;
import org.code.media.*;


  /**
   * Superclass used as a basic structure for the subclasses. 
   */
public class BackgroundScene {

  private String fileName;
  private int x;
  private int y;

  /**
  * Constructor for the BackgroundScene object that contains parameters such as the fileName, plus the x and y values.
  */
  public BackgroundScene(String fileName, int x, int y) {
    this.fileName = fileName;
    this.x = x;
    this.y = y;
  }

  /**
  * Method to get the value of X.
  */
  public int getX() {
    return x;
  }

  /**
  * Method to get the value of Y
  */
  public int getY() {
    return y;
  }

  /**
  * Method to get the string value for fileName.
  */
  public String getFileName() {
    return fileName;
  }

  /**
  * Method to set the int value of X to a new int value.
  */
  public void setX(int newX) {
    x = newX;
  }

  /**
  * Method to set the int value of Y to a new int value.
  */
  public void setY(int newY) {
    y = newY;
  }

  /**
  * Method to set the string value of fileName to a new string value.
  */
  public void setFile(String newFileName) {
    fileName = newFileName;
  }

}
