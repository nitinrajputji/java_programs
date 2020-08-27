class vehicle
{
    int wheels;
    int headLight;
    String color;
    vehicle(int noOfWheels)
    {
       wheels=noOfWheels;
       headLight=2;

    }



    vehicle(int noOfWheels ,String color)
    {
        wheels=noOfWheels;
        this.color=color;
        headLight=2;
       
    }
}


class rajput6
{
    rajput6()
    {
        System.out.println("object is now created");
    }
    public static void main(String args[])
    {
        vehicle headLight=new vehicle(2);
        vehicle  car=new vehicle(4);
        System.out.println(car.wheels+" "+car.headLight);
        vehicle scooty=new vehicle(2);
        System.out.println(scooty.wheels);
        vehicle eRiksha=new vehicle(3, "red");
        System.out.println(eRiksha.wheels+"wheels"+eRiksha.color);


    }
}