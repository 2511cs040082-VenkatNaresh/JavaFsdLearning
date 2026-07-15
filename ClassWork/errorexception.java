package ClassWork;
class errorexception{
    public static void main(String args[]){
        int quantity = Integer.parseInt("abc");
        double price = 100.0;
        double total = quantity * price;
        System.out.println("Total:  " + total);
    }

}
