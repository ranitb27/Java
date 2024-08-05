public class Assignment2 {
    public static void main(String args[]){
        float petrolquantity, dieselquantity;
        double budget = 1546.12 , petrolquantity1, dieselquantity1;
        float petrolprices = 84.11f;
        float dieselprices = 74.91f;
        petrolquantity = (float) (budget / petrolprices);
        dieselquantity = (float) (budget / dieselprices);
        System.out.println("In this budget petrol is:"+petrolquantity+"and diesel is:"+dieselquantity);
        double petrolprices1 = 84.11, dieselprices1 = 74.91;
        petrolquantity1 = budget/petrolprices1;
        dieselquantity1 = budget/dieselprices1;
        System.out.println("In this budget petrol is:"+petrolquantity1+"and diesel is:"+dieselquantity1);
    }
}
