package duke;

import java.util.Scanner;

public class Duke {

    public static void main(String[] args) {
        int images = 2;                        // number of images
        int WIDTH = 900, HEIGHT = 900;    
        
        System.out.println(null instanceof Scanner);// images are 130-by-80
        StdDraw.setCanvasSize(WIDTH, HEIGHT);
        StdDraw.setXscale(150, WIDTH);
        StdDraw.setYscale(120, HEIGHT);
        StdDraw.enableDoubleBuffering();

        // main animation loop
        for (int t = 0; true; t++) {
            int i = 1 + (t % images);
            String filename = "T" + i + ".gif";  // name of the ith image
            StdDraw.picture(WIDTH/2.0, HEIGHT/2.0, filename);
            StdDraw.show();
            StdDraw.pause(500);
        }
    }

}
