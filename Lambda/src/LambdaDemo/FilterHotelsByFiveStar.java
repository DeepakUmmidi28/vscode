package LambdaDemo;

public class FilterHotelsByFiveStar implements FilteringCondition{
    public boolean Test(Hotel hotel){
        return hotel.getHotelType()==HotelType.FIVE_STAR;
    }
}
