package _Loops;

public class _Switch {
    static int day;
    static String dayType;

    public static void main(String[] args) {

        System.out.println(dayWeekSwitch("MONDAY")); //'Return' is printed after the method execution.

        nestedSwitch(1, 2);

    }


    public static String dayWeekSwitch(String weekDay) {

        switch (weekDay.toLowerCase()) {
            case "monday":
                day = 1;
                break;
            case "tuesday":
                day = 2;
                break;
            case "wednesday":
                day = 3;
                break;
            case "thursday":
                day = 4;
                break;
            case "friday":
                day = 5;
                break;
            case "saturday":
                day = 6;
                break;
            case "sunday":
                day = 7;
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }

        //MULTIPLE CASES
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;

            default:
                System.out.println("Invalid Entry");
        }

        //ONE-LINE
        switch (dayType){
            case "Weekday": System.out.println("Let's work"); break;
            case "Weekend": System.out.println("Let's Party"); System.out.println("Woop-woop!");break;
        }

        return "The option " + weekDay + " on the Switch refers to: (" + dayType + ")";
    }

    public static void nestedSwitch(int x, int y) {
        System.out.println("\nFor x = " + x + " and y = " + y + ":");

        //NESTED SWITCH
        switch (x) { // Outer Switch
            case 1: // If x == 1
                switch (y) { // Nested Switch
                    case 1: // If y == 2
                        System.out.println("Switch case 1-1");
                        break;
                    case 2: // If y == 3
                        System.out.println("Switch case 1-2");
                        break;
                    default:
                        System.out.println("Invalid entry");
                }
                break;

            case 2: // If x == 4
                System.out.println("Switch case 2");
                break;
            case 3: // If x == 5
                System.out.println("Switch case 3");
                break;
            default:
                System.out.println("Choice is other than 1, 2 3, 4, or 5");
                break;
        }
    }


}
