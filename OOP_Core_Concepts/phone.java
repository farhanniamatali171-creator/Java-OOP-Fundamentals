public class phone {
    private String brand;
    private String model;
    private double price;
    private Battery battery=new Battery();

    public phone() {
      this.brand="unknown";
      this.model="unknown";
      this.price=0;
      battery=new Battery();    
    }
    public phone(String brand,String model, double price, Battery battery) {
        this.brand = brand;
        this.model=model;
        if(price>0)
        this.price = price;
        this.battery = new Battery(battery);
    }
    phone(phone p){
        this.brand=p.brand;
        this.model=p.model;
        this.price=p.price;
        this.battery=new Battery(p.battery);
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }
    
public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        if (price>0.0) {
            this.price = price;
        }
        
    }
    public void setBattery(Battery battery) {
      this.battery=new Battery(battery);
    }


    @Override
    public String toString() {
        return "Brand    : "+brand+
        "\nModel    : "+model+
        "\nPrice    : "+price+
        "\nBattery  : "+battery+
        "\n-----------------------" ;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(!(obj instanceof phone))
            return false;
        phone p=(phone) obj;
        return brand.equals(p.brand)
        && model.equals(p.model)
        && battery.getCapacity()==p.battery.getCapacity()
        && battery.getType().equals(p.battery.getType());
    }
    
    
}
