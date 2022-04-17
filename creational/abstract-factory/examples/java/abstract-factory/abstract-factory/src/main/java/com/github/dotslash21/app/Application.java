package com.github.dotslash21.app;

import com.github.dotslash21.buttons.Button;
import com.github.dotslash21.checkboxes.Checkbox;
import com.github.dotslash21.factories.GuiFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
