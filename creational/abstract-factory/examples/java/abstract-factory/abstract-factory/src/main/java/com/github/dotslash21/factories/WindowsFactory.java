package com.github.dotslash21.factories;

import com.github.dotslash21.buttons.Button;
import com.github.dotslash21.buttons.WindowsButton;
import com.github.dotslash21.checkboxes.Checkbox;
import com.github.dotslash21.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GuiFactory {
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
