//first part

//first class on separate file
package com.company;

public class Thing {
    private String color;

    Thing(){
        color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "color='" + color + '\'' +
                '}';
    }
}



//second class on separate file
package com.company;

public class RoundThing{
    private int thing_radius;

    RoundThing(int radius){
        thing_radius = radius;
    }

    public void setThing_radius(int thing_radius) {
        this.thing_radius = thing_radius;
    }

    public int getThing_radius() {
        return thing_radius;
    }

    @Override
    public String toString() {
        return "RoundThing{" +
                "thing_radius=" + thing_radius +
                '}';
    }
}



//third class on separate file
package com.company;

public class RectangularThing {
    private int thing_width;

    RectangularThing(String color, int length, int width){
        thing_width = width;
    }

    public void setThing_width(int thing_width) {
        this.thing_width = thing_width;
    }

    public int getThing_width() {
        return thing_width;
    }

    @Override
    public String toString() {
        return "RectangularThing{" +
                "thing_width=" + thing_width +
                '}';
    }
}






//Second part

package com.company;
import java.lang.String;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static boolean isAlphabetical(String x) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if ((97 <= (char) x.charAt(i) && (char) x.charAt(i) <= 122) ||
                    (65 <= (char) x.charAt(i) && (char) x.charAt(i) <= 90)) {
                ++count;
            }
        }
        return count == 4;
    }

    public static boolean isInteger(String x) {
        return (x.matches("-?\\d+"));
    }

    public static boolean validFirstCharacter(String x) {
        String b = x.toLowerCase(Locale.ROOT);
        Character c = b.charAt(0);
        return (c.equals('m') || c.equals('c') || c.equals('i'));
    }

    public static boolean validNumbers(String x) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (49 <= x.charAt(i) && x.charAt(i) <= 51) {
                ++count;
            }
        }
        return count == 3;
    }

    public static String determineMajor(String moduleCode) {
        String copy = moduleCode.toLowerCase(Locale.ROOT);
        String major = null;
        switch (copy.charAt(0)) {
            case 'm':
                major = "Mathematics";
                break;
            case 'c':
                major = "Computer Science";
                break;
            case 'i':
                major = "Information Technology";
                break;
            default:
                System.out.println("Invalid module code");
        }
        return major;
    }

    public static String determineYearLevel(String moduleCode) {
        String year = null;
        if (moduleCode.charAt(4) == '1') {
            year = "The student is in the first year of study";
        } else if (moduleCode.charAt(4) == '2') {
            year = "The student is the second year of study";
        } else if (moduleCode.charAt(4) == '3') {
            year = "The student is in the third year of study";
        } else {
            year = "Invalid year of study";
        }

        return year;
    }

    public static boolean isValid(String moduleCode) {
        String firstPart = moduleCode.substring(0, 4);
        String secondPart = moduleCode.substring(4, 6) + moduleCode.charAt(6);
        boolean a = isAlphabetical(firstPart);
        boolean b = isInteger(secondPart);
        boolean c = validFirstCharacter(firstPart);
        boolean d = validNumbers(secondPart);
        return (a && b && c && d);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a subject code: ");
        //String code = input.nextLine();
        while(1>0){
            System.out.println("Enter a subject code: ");
            String mCode = input.nextLine();
            if(isValid(mCode) == true){
                System.out.println(determineMajor(mCode));
                System.out.println(determineYearLevel(mCode));
                break;
            }
        }
    }
}
