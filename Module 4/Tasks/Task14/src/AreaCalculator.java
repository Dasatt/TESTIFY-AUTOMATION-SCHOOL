public class AreaCalculator {
    public static void main(String[] args) {
        Square newInstance = new Square();
        newInstance.setBreadth(20);
        newInstance.setLength(4);

        int breadth = newInstance.getBreadth();
        int length = newInstance.getLength();


        int area = breadth * length;
        System.out.println("The area of a square of length: " + length+ " and breadth: " + breadth + " is "+ area +" square meters");
    }
}
