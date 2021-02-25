public class DrillingRobot extends Robot {
    protected String type="Drilling Robot";
    protected String manufacturer="Regina Machines";
    public void fetchParts(){        
        System.out.println("Cut part fetched");
    }
    public void doTask(){
        System.out.println("Holes drilled");
    }
    public void storeParts(){
        System.out.println("Drilled part sent to storage");
    } 
}
class OccurrenceDrill extends DrillingRobot{
    private long serial_num;
    public void create(long serial_num)
    {
        this.serial_num=serial_num; 
        System.out.println(this.type+" created");
        System.out.println(this.manufacturer+" "+ this.serial_num);
    }
    static OccurrenceDrill theInstance=new OccurrenceDrill();
    private OccurrenceDrill(){};//instance only can be create in side this Cuttinrobot and its extends class
    public static OccurrenceDrill getInstance(){
        return theInstance;
    } 
}
