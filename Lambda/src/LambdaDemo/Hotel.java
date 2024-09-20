package LambdaDemo;

public class Hotel {
    public int PricePerNight;
    public int Rating;
    public HotelType hotelType;

    public Hotel(int PricePerNight,int Rating,HotelType hotelType){
        this.PricePerNight=PricePerNight;
        this.Rating=Rating;
        this.hotelType=hotelType;
    }

    public int getRating(){
        return Rating;
    }

    public int getPricePerNight(){
        return PricePerNight;
    }

    public HotelType getHotelType(){
        return hotelType;
    }

    public void setRating(int x){
        Rating=x;
    }

    public void setPricePerNight(int x){
        PricePerNight=x;
    }

    public void setHotelType(HotelType type){
        hotelType=type;
    }

    public String toString(){
        return "(Price :"+PricePerNight+", rating : "+Rating+", Hotel type : "+hotelType+")";
    }
}
