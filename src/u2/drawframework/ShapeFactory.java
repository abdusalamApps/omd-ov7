package u2.drawframework;

import u2.Circle;
import u2.Square;
import u2.drawframework.Shape;

public interface ShapeFactory {
    public Shape create(String type);

}
