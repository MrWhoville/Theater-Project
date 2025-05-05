import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    
    SceneRunner Scene = new SceneRunner();

    Scene.drawScene();
    Theater.playScenes(Scene);

  }
  
}
