public class Shirt {

    public int shirtID = 1000;
    public String description = "-description required";
    public char colorCode = 's';
    public double price = 200000;
    public int quantityInStock= 0;

    public void displayShirtInformation(){
        System.out.println("Shirt ID "+ shirtID);
        System.out.println("Shirt Deskription "+ description);
        System.out.println("Color Code "+ colorCode);
        System.out.println("Shirt Price Rp."+ price);
        System.out.println("Quantity in Stock "+ quantityInStock);
    }

    public static void main(String[] args) {

        Shirt shirt= new Shirt();
        shirt.displayShirtInformation();



    }
}
