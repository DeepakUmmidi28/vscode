package LambdaDemo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HotelService hotelservice=new HotelService();
        List<Hotel> list=hotelservice.genericFilter(new FilterHotelsLessThan5000());

        System.out.println("Price less than 5000 - "+list);

        list=hotelservice.genericFilter(new FilterHotelsByFiveStar());
        System.out.println("Five star hotels - "+list);

        //Anonymous Inner Type
        // list=hotelservice.genericFilter(new FilteringCondition(){
        //     public boolean Test(Hotel hotel){
        //         return hotel.getHotelType()==HotelType.THREE_STAR;
        //     }
        // });

        
        //lambdas
        list=hotelservice.genericFilter((Hotel hotel)-> hotel.getHotelType()==HotelType.THREE_STAR);
        System.out.println("three star hotels - "+list);
    }
}
