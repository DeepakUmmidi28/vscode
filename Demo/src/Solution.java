import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Projector res = Solution.getProjectorByMaxPrice();
        if (res != null && res.getAvailableIn().equals("Tata"))
            System.out.println(res.getId());
        else
            System.out.println("No projector found..!");
    }

    public static Projector getProjectorByMaxPrice() {
        Scanner sc = new Scanner(System.in);

        Projector[] arr = new Projector[2];
        Projector result = null;  // Start with no projector selected
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter ID");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Price");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter IN");
            String in = sc.next();
            sc.nextLine();
            arr[i] = new Projector(id, price, in);
            if (result == null || result.getPrice() < arr[i].getPrice()) {
                result = arr[i];
                System.out.println("Price Modified");
            }
        }
        sc.close();  // Close the scanner to prevent resource leaks

        if (result != null && result.getAvailableIn().equals("Tata"))
            return result;
        else 
            return null;
    }
}

class Projector {
    private int id;
    private int price;
    private String availableIn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAvailableIn() {
        return availableIn;
    }

    public void setAvailableIn(String availableIn) {
        this.availableIn = availableIn;
    }

    public Projector(int id, int price, String availableIn) {
        this.id = id;
        this.price = price;
        this.availableIn = availableIn;
    }
}
