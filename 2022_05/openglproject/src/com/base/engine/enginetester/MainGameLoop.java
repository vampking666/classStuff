package com.base.engine.enginetester;

import org.lwjgl.opengl.Display;
import com.base.engine.renderengine.DisplayManager;

public class MainGameLoop {
    
    public static void main(String[] args) {
        
        DisplayManager.createDisplay();

        while (!Display.isCloseRequested()) {
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();

    }
    
}
