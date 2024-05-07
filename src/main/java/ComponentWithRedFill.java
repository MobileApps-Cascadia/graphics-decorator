import java.awt.Color;
import java.awt.Graphics;

public class ComponentWithRedFill implements Component {

  private Component decoratedComponent;

  public ComponentWithRedFill(Component component) {
    this.decoratedComponent = component;
  }

  public void draw(Graphics graphics) {
    graphics.setColor(Color.RED);
    decoratedComponent.draw(graphics);
    graphics.setColor(Color.BLACK);

  }
}
