public class AssemblyRobot extends Robot {
    private String type="Assembly Robot";
    private String manufacturer="SK Robotics";
    private long serial_num;
    public void create(long serial_num)
    {
        this.serial_num=serial_num; 
        System.out.println(this.type+" created");
        System.out.println(this.manufacturer+" "+ this.serial_num);
    }
    static AssemblyRobot theInstance=new AssemblyRobot();
    private AssemblyRobot(){};//instance only can be create in side this Cuttinrobot and its extends class
    public static AssemblyRobot getInstance(){
        return theInstance;
    } 
    public void fetchParts(){        
        System.out.println("Drilled part fetched");
    }
    public void doTask(){
        System.out.println("Product Assembled");
    }
    public void storeParts(){
        System.out.println("Product sent to storage");
    } 
}