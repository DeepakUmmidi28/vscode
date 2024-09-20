package LambdaDemo;

public class FilterHotelsLessThan5000 implements FilteringCondition{
    public boolean Test(Hotel hotel){
        return hotel.getPricePerNight()<5000;
    }
}
