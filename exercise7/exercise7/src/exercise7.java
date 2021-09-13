import java.util.Scanner;


public class exercise7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is the length of the room in feet?");
        String length = input.next();
        int convLength = Integer.parseInt(length);

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is the width of the room in feet?");
        String width = input2.next();
        int convWidth = Integer.parseInt(width);

        System.out.println("You entered dimensions of "+convLength+" feet by "+convWidth+" feet." );

        int area = convLength * convWidth;
        double meters = area * 0.09290304;

        System.out.println("The area is\n"+ area+" square feet\n"+ String.format("%.3f", meters)+" square meters");


    }
}

