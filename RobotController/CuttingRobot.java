public class CuttingRobot extends Robot {
    protected String type="Cutting Robot";
    protected String manufacturer="Regina Machines";
    public void fetchParts(){        
        System.out.println("Raw material fetched");
    }
    public void doTask(){
        System.out.println("Raw material cut");
    }
    public void storeParts(){
        System.out.println("Cut part sent to storage");
    } 
}
class OccurrenceCut extends CuttingRobot{
    private long serial_num;
    public void create(long serial_num)
    {
        this.serial_num=serial_num; 
        System.out.println(this.type+" created");
        System.out.println(this.manufacturer+" "+ this.serial_num);
    }
    static OccurrenceCut theInstance=new OccurrenceCut();
    private OccurrenceCut(){};//instance only can be create in side this Cuttinrobot and its extends class
    public static OccurrenceCut getInstance(){
        return theInstance;
    } 
}