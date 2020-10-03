abstract class shape {
void numberOfSides() {
}
}
class rectangle extends shape {
void numberOfSides() {
System.out.println("Rectangle has 4 sides");
}
}
class triangle extends shape {
void numberOfSides() {
System.out.println("Triangle has 3 sides");
}
}
class hexagon extends shape {
void numberOfSides() {
System.out.println("Hexagon has 6 sides");
}
}
public class polymorphism {
public static void main(String[] args) {
hexagon myHex = new hexagon();
myHex.numberOfSides();
triangle myTriangle = new triangle();
myTriangle.numberOfSides();
rectangle myRectangle = new rectangle();
myRectangle.numberOfSides();
}
}
