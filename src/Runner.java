public class Runner {
    public static void main(String[] args){
        Car eva = new Car(2002,"Toyota","Camry");
        System.out.println(eva.toString());
        eva.drive(60);
        System.out.println(eva.toString());

        Rectangle rect = new Rectangle(4,6);
        System.out.println(rect.getArea());
        System.out.println(rect.getDiagonal());
        System.out.println(rect.isSquare());
    }
}
