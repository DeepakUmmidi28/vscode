package Arrays;
public class MaximumValueOfStringInArray {
    public static int maximumValue(String[] strs) {
        int max=0;
        for(String str:strs){
            if(isInteger(str)){
                max=Integer.max(Integer.parseInt(str),max) ;
            }
            else{
                max=Integer.max(str.length(),max) ;
            }
        }
        return max;
    }

    public static boolean isInteger(String str){
        if(str==null) return false;
        else{
            try {
                Integer.parseInt(str);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[]={"iw1","61939","7","7i","cye","bv7yg","t3ye6","990"};
        System.out.println(maximumValue(arr));
    }
}
