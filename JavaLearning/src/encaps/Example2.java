package encaps;


public class Example2
{
public static void main(String args[])
{
Example1 car =new Example1();
car.setName("Mustang GT 4.8-litre V8");
car.setTopSpeed(201);
System.out.println(car.getName()+ " top speed in MPH is " + car.getTopSpeed());
System.out.println(car.getName() + " top speed in KMH is " + car.getTopSpeed());


}
}
