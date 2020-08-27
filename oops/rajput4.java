class vehicle
{
    int wheels;
    vehicle()
    {
        wheels=4;

    }
}

class rajput4
{
    rajput4()
    {
        System.out.println("object is now created");
    }
    public static void main(String args[])
    {
        vehicle  car=new vehicle();
        System.out.println(car.wheels+"wheels");


    }
}