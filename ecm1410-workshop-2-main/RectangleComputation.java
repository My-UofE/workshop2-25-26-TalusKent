public class RectangleComputation {
    public static void main(String[] args){
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        System.out.println("shape: rectangle");
        System.out.print("area: ");
        System.out.println(height * width);
        System.out.print("perimeter: ");
        System.out.println(2 * (height + width));
    }
}
