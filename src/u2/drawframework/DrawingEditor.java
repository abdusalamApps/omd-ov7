package u2.drawframework;

public class DrawingEditor {
    ShapeFactory factory;
    public Shape create(ShapeFactory factory, String shapeType) {
        this.factory = factory;
        return factory.create(shapeType);
    }

}
