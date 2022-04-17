package com.github.dotslash21;

import com.github.dotslash21.app.Application;
import com.github.dotslash21.factories.GuiFactory;
import com.github.dotslash21.factories.MacOsFactory;
import com.github.dotslash21.factories.WindowsFactory;

/**
 * Main class. Everything comes together here.
 */
public final class Main {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
