class VolumeEarth{
public static void main(String args[]){
int radius = 6378;
double volumeInKm = 4/3.0 * 3.14 * radius *radius*radius;
double volumeInMiles =  volumeInKm / 1.6 ;
System.out.println("The Volume of earth in cubic kilometer is " + volumeInKm + " and cubic miles is " + volumeInMiles );
}
}