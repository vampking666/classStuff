package project;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
    
    private static final int width = 1280;
    private static final int height = 720;
    private static final int fpsCap = 120;

    public static void createDisplay() throws LWJGLException {

        ContextAttribs attribs = new ContextAttribs(3,2);
        attribs.withForwardCompatible(true);
        attribs.withProfileCompatibility(true);

       try {
        Display.setDisplayMode(new DisplayMode(width, height));
        Display.create(new PixelFormat(), attribs);
       } catch (LWJGLException e) {
           e.printStackTrace();
       }
       
       GL11.glViewport(0, 0, width, height);

    }

    public static void updateDisplay() {

        Display.sync(fpsCap);
        Display.update();

    }

    public static void closeDisplay() {
        Display.destroy();
    }

}
