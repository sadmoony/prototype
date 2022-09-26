public class Demo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType() + "; hashcode " + clonedShape.hashCode());

       Shape clonedShape2 = (Shape) ShapeCache.getShape("3");
       System.out.println("Shape: " + clonedShape2.getType() + "; hashcode: " + clonedShape2.hashCode());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape3.getType() + "; hashcode: " + clonedShape3.hashCode());
    }
}
