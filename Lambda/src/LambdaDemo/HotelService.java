package LambdaDemo;
import java.util.*;

public class HotelService {

    List<Hotel> hotels=new ArrayList<>();
    HotelService(){
        hotels.add(new Hotel(2000, 2, HotelType.THREE_STAR));
        hotels.add(new Hotel(1000, 1, HotelType.THREE_STAR));
        hotels.add(new Hotel(10000, 4, HotelType.FOUR_STAR));
        hotels.add(new Hotel(20000, 5, HotelType.FIVE_STAR));
        hotels.add(new Hotel(5000, 3, HotelType.FOUR_STAR));
    }


    private boolean isPriceGreaterThan(int value,Hotel hotel){
        return hotel.getPricePerNight()>value;
    }

    public List<Hotel> getPricePerNightGreaterThan(int value){
        List<Hotel> sortedList=new ArrayList<>();
        for(Hotel x:hotels){
            if(isPriceGreaterThan(value,x));
            sortedList.add(x);
        }
        return sortedList;
    }

    private boolean isHotelFiveStar(Hotel hotel){
        return hotel.getHotelType()==HotelType.FIVE_STAR;
    }

    public List<Hotel> getFiveStarHotels(){
        List<Hotel> sortedList=new ArrayList<>();
        for(Hotel x:hotels){
            if(isHotelFiveStar(x));
            sortedList.add(x);
        }
        return sortedList;
    }

    public List<Hotel> genericFilter(FilteringCondition filter){
        List<Hotel> sortedList=new ArrayList<>();
        for(Hotel x:hotels){
            if(filter.Test(x))
            sortedList.add(x);
        }
        return sortedList;
    }

}
