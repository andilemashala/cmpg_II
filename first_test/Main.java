package  com.company;


//Question 1
class TeeShirt{
    int order_number;
    private int price;
    String size, color;

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }
    public int getOrder_number() {
        return order_number;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public int  determine_price(String t_size){
        if(t_size.toLowerCase() == "l" || t_size.toLowerCase() == "xl"){
            price = 89;
        }
        else{
            price = 59;
        }
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}

class CustomTee extends TeeShirt{
    String slogan;

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getSlogan() {
        return slogan;
    }
}


//This one need to be formatted after opening Date class
//second question....
class ExtDate{
    int year, day;
    String month;

    ExtDate(int d_day, String d_month, int d_year){
        day = d_day;
        month = d_month;
        year = d_year;

    }

    public String output_month_and_year(){
        return (month + " " + year);
    }
}
//end of second question


//testing question 1 and 2
public class Main{
    public static void main(String[] args) {

        //question 1
        TeeShirt t1 = new TeeShirt();
        t1.size = "xl";
        t1.color = "Yellow";
        t1.order_number = 20220403;
        int price1 = t1.determine_price(t1.size);
        System.out.printf("Size: %s %nPrice: %d %nColor: %s %nOrderNumber: %d\n\n",
                t1.getSize(), price1, t1.getColor(), t1.getOrder_number());


        CustomTee t2 = new CustomTee();
        t2.size = "l";
        t2.color = "red";
        t2.order_number = 20220405;
        t2.slogan = "Good t-shirt";
        int price2 = t2.determine_price(t2.size);

        System.out.printf("Size:%s %nPrice: %d, %nColor: %s %nOrderNumber: %d %nSlogan: %s\n\n",
                t2.getSize(), price2, t2.getColor(), t2.getOrder_number(), t2.getSlogan());


        //question 2
        ExtDate p = new ExtDate(10, "May", 2022);
        System.out.println(p.output_month_and_year());
    }

}
