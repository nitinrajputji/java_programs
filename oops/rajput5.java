class vehicle
{
    int wheels;
    vehicle(int noOfWheels)
    {
        wheels=noOfWheels;

    }
}

class rajput5
{
    rajput5()
    {
        System.out.println("object is now created");
    }
    public static void main(String args[])
    {
        vehicle  car=new vehicle(4);
        vehicle scooty=new vehicle(2);
        System.out.println(scooty.wheels+"wheels");


    }
}