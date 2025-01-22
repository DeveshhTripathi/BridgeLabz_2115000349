import java.util.*;
public class VolumeEarth{
	public static void main(String Args[]){
	double pi = 3.14;
	double radius = 6378;
	double volume = ((double)4/3) * pi * Math.pow(radius,3);
	double inMiles = volume *1.6;
	System.out.println("The volume of earth in cubic kilometers is " +volume + " and cubic miles is" + inMiles );
  }
}
