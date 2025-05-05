import org.code.theater.*;
import org.code.media.*;


  public class SceneRunner extends Scene {


  /**
   * 1D Arrays and an instance variable representing all the elements seen in the video.
   */
  private Character[] Ben = { new Character("bensitting.png", 230, 200), new Character("benidle.png", 10, 280)};
  private BackgroundScene[] Backgrounds = { new BackgroundScene("livingroomimage.jpg", 0, 0), new BackgroundScene("parktwo.jpg", -100, 0)};
  private Text[] Messages = { new Text("Hmm, Ben seems to be on his phone a lot. ", 10, 20), new Text("What could he do to reduce his screen time?", 10, 40), new Text("He can take a run in the park!", 10, 20)};
  private Elements[] Items = { new Elements("phone.jpg", 310, 290), new Elements("Border.jpg", 0, -100)};
    
    /**
     * Method to set up the video using different the methods and elements from the instance variables/arrays.
     */
    public void drawScene() {
      drawImage(Backgrounds[0].getFileName(), Backgrounds[0].getX(), Backgrounds[0].getY(), 610);
      drawImage(Ben[0].getFileName(), Ben[0].getX(), Ben[0].getY(), 120);
      drawImage(Items[0].getFileName(), Items[0].getX(), Items[0].getY(), 20);
      drawImage(Items[1].getFileName(), Items[1].getX(), Items[1].getY(), 1000);
      drawText(Messages[0].getText(), Messages[0].getX(), Messages[0].getY());
      drawText(Messages[1].getText(), Messages[1].getX(), Messages[1].getY());
      pause(5.0);
      drawBackground();
      moveBen();
    }

    /**
     * Method to draw the Background using index 1 of the Backgrounds array.
     */
    private void drawBackground() {
      drawImage(Backgrounds[1].getFileName(), Backgrounds[1].getX(), Backgrounds[1].getY(), 610);   
    }

    /**
     * Method to imitate the benidle.png moving across the screen that uses a while loop of using 
     * the drawBackground() method and the drawImage() method repeatedly to acheive the illusion.
     */
    private void moveBen() {
      while (Ben[1].getX() < 400) {
        drawBackground();
        drawImage(Items[1].getFileName(), Items[1].getX(), Items[1].getY(), 1000);
        drawText(Messages[2].getText(), Messages[2].getX(), Messages[2].getY());
        drawImage(Ben[1].getFileName(), Ben[1].getX(), Ben[1].getY(), 100);
        int newX = Ben[1].getX() + 10;
        Ben[1].setX(newX);
        pause(0.1);       
    }
      
  }
}
