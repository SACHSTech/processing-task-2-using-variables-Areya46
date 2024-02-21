import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(46, 140, 191);
    int width = 400;
    int height = 400;
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
// House

    // Foreground of picture (oval)
    fill(78, 140, 70);
    ellipse(width / 2, height, (float)(width * 1.25), height);

    // Body of house (rectangle)
    fill(242, 237, 133);
    rect((float)(width * 0.375), (float)(height * 0.3125), width / 4, (float)(height * 0.1875));

    // Roof of house (triangle)
    fill(242, 139, 65);
    triangle((float)(width * 0.375), (float)(height * 0.3125), (float)(width * 0.625), (float)(height * 0.3125), width / 2, (float)(height * 0.1875));     

    // Door (rectangle)
    fill(252, 165, 3);
    rect((float)(width * 0.4), (float)(height * 0.425), (float)(width * 0.05),(float)(height * 0.075));

    // Top left bay window (rectangle)
    fill(46, 140, 191);
    rect((float)(width * 0.4), (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.0375));

    // Upper bay window (rectangle)
    fill(46, 140, 191);
    rect(width / 2, (float)(height * 0.35), (float)(width * 0.075), (float)(height * 0.05));

    // Lower bay window (rectangle)
    fill(46, 140, 191);
    rect(width / 2, (float)(height * 0.4325), (float)(width * 0.075), (float)(height * 0.05));
    // Sun 
    fill(252, 231, 3);
    ellipse(width, 0, (width / 4), (400 / 4));
  }
  
  // define other methods down here.
}