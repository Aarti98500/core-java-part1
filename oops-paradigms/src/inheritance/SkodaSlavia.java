package inheritance;

//extends -> Is a Relationship

public class SkodaSlavia extends Car {
    //String brandName;
    //String yearOfMan;
    //int cc;
    //boolean isPetrol;
    int numOfBags;

    public SkodaSlavia(int numOfBags){
     //super();
        System.out.println(this.getClass().getName() + " called");
        this.numOfBags = numOfBags;
    }
    public SkodaSlavia(String brandName, String yearOfMan, int cc, boolean isPetrol, int numOfBags){
        super(brandName, yearOfMan, cc, isPetrol);
        System.out.println(this.getClass().getName() + " called");
        this.numOfBags = numOfBags;
    }

    @Override
    public String toString() {
        return "SkodaSlavia{" +
                "numOfBags=" + numOfBags +
                '}';
    }
}
