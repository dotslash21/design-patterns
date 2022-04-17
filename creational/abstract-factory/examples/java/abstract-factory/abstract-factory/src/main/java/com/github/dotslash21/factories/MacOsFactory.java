package com.github.dotslash21.factories;

import com.github.dotslash21.buttons.Button;
import com.github.dotslash21.buttons.MacOsButton;
import com.github.dotslash21.checkboxes.Checkbox;
import com.github.dotslash21.checkboxes.MacOsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
