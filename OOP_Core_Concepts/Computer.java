 class Computer {

    protected double wordsize;
    protected double memorysize;
    protected double storagesize;
    protected double speed;

    public Computer(){
        this.wordsize=0.0;
        this.memorysize=0.0;
        this.storagesize=0.0;
        this.speed=0.0;
    }
    public Computer(double wordsize,double memorysize,double storagesize,double speed){
        this.wordsize=wordsize;
        this.memorysize=memorysize;
        this.storagesize=storagesize;
        this.speed=speed;
    }
    public double getWordsize() {
        return wordsize;
    }
    public void setWordsize(double wordsize) {
        this.wordsize = wordsize;
    }
    public double getMemorysize() {
        return memorysize;
    }
    public void setMemorysize(double memorysize) {
        this.memorysize = memorysize;
    }
    public double getStoragesize() {
        return storagesize;
    }
    public void setStoragesize(double storagesize) {
        this.storagesize = storagesize;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
 
  public void display(){
    System.out.println("Word size is :"+wordsize+" bits");
    System.out.println("Memory size is :"+memorysize+" Megabytes");
    System.out.println("Storage size is :"+storagesize+" Gigasize");
    System.out.println("Speed is :"+speed+" Megahertz");
  }
}
 class Laptop extends Computer{

    protected int length;
    protected int width;
    protected int height;
    protected int weight;
    public Laptop() {
        super();
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.weight = 0;
    }
    public Laptop(double wordsize,double memorysize,double storagesize,double speed,int length, int width, int height, int weight) {
        super(wordsize,memorysize,storagesize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
     public void display(){
    super.display();
    System.out.println("Length is :"+length+" cm");
    System.out.println("Height is :"+height+" cm");
    System.out.println("Width is :"+width+" cm");
    System.out.println("Weight is :"+weight+" kg");
  }
    
}
