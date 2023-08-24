package SDLC_Pro_Practice;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakeScreenshots {
    public static void main(String[] args) {
        try {
            Thread.sleep(120);
            Robot robot = new Robot();

            // It saves screenshot to desired path
            String path = "D:// Shot.jpg";

            // Used to get ScreenSize and capture image
            Rectangle capture =
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = robot.createScreenCapture(capture);
            boolean jpg = ImageIO.write(Image, "jpg", new File("C:/Users/aronn/Pictures"));
            System.out.println("Screenshot saved");
        } catch (AWTException | IOException | InterruptedException exception) {
            System.out.println(exception);
        }
    }
}

/*
Expected Output::

Screenshot saved

* */
