package processing.standalonedemo;

import processing.core.PApplet;

public class MyPApplet extends PApplet {
    @Override
    public void settings() {
        size(500, 250);
    }

    @Override
    public void setup() {
        ellipse(this.width / 2, this.height / 2, 100, 100);
    }

}
