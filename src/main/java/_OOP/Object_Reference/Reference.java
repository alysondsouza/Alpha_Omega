//OBJECTS REFERENCE
//INNER CLASS

package _OOP.Object_Reference;

public class Reference {
    public static void main(String[] args) {
        House blueHoouse = new House("blue");
        House anotherHouse = blueHoouse; //NEW REFERENCE to the same object

        System.out.println("\nBlueHouse: " + blueHoouse.getColor());
        System.out.println("AnotherHouse: " + anotherHouse.getColor());

        anotherHouse.setColor("yellow");
        System.out.println("\nBlueHouse: " + blueHoouse.getColor());
        System.out.println("AnotherHouse: " + anotherHouse.getColor());

        House greenHouse = new House("green");
        anotherHouse = greenHouse;
        System.out.println("\nBlueHouse: " + blueHoouse.getColor());
        System.out.println("GreenHouse: " + greenHouse.getColor());
        System.out.println("AnotherHouse: " + anotherHouse.getColor());
    }

    //INNER CLASS
    private static class House {
        private String color;

        public House(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
