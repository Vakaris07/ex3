public class Main {
    public static double calculateCircleArea(double radius) {
        double pi=3.14159;

        double area=pi*radius*radius;
        double circumference=2*pi*radius;

        System.out.println("Area is: "+area);
        System.out.println("Circumference: "+circumference);
        return area;

    }
    public static void main(String[] args){
        System.out.println(calculateCircleArea(3));
    }





}