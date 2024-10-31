import java.util.Arrays;
import java.util.Scanner;

class Medicine {
    private String medicineName;
    private String batchNo;
    private String disease;
    private int price;


    //Setters nad getters 
    public void setMedicineName(String name){
        this.medicineName=name;
    }
    public void setBatchNo(String no){
        this.batchNo=no;
    }
    public void setDisease(String disease){
        this.disease=disease;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getMedicineName(){
        return medicineName;
    }
    public String getBatchNo(){
        return batchNo;
    }
    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }

    //parameterized constructor
    Medicine(String medicineName, String batchNo, String disease, int price){
        this.medicineName=medicineName;
        this.batchNo=batchNo;
        this.disease=disease;
        this.price=price;
    }
}

public class myClass{
    //Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Medicine arr[]=new Medicine[2];
        String a,b,c;
        int d;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter medicineName :");
            a=sc.nextLine();
            System.out.print("Enter batchNo :");
            b=sc.nextLine();
            System.out.print("Enter disease :");
            c=sc.nextLine();
            System.out.print("Enter price :");
            d=sc.nextInt();
            sc.nextLine();
            System.out.println();
            arr[i]=new Medicine(a,b,c,d);
        }
        System.out.print("Enter the disease : ");
        String e=sc.nextLine();
        System.out.println();
        System.out.println("-----------------");
        int ans[]=medicinePriceForGivenDisease(e, arr);
        for(int x:ans){
            System.out.println(x);
        }
        sc.close();
    }


    public static int[] medicinePriceForGivenDisease(String disease, Medicine med[]){
        // int ans[]=new int[4];
        // int counter=0;
        // for(int i=0;i<med.length;i++){
        //     if(med[i].getDisease().equalsIgnoreCase(disease)){
        //         ans[counter++]=med[i].getPrice();
        //     }
        // }

        int ans[]=new int[0];
        for(int i=0;i<med.length;i++){
            if(med[i].getDisease().equalsIgnoreCase(disease)){
                ans=Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]=med[i].getPrice();
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
