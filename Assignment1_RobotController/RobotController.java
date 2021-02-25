import java.util.ArrayList;
public class RobotController {
    private ArrayList<Robot> cutRobot=new ArrayList<>();
    private ArrayList<Robot> drillRobot=new ArrayList<>();
    private ArrayList<Robot> assemblyRobot=new ArrayList<>();
    private int rawMaterial;

    private int cutRobot_num=6;
    private int drillRobot_num=3;
    private int assemblyRobot_num=1;
    public void rawMaterial_num(int input)
    {
        rawMaterial=input;
    }
    public void add_robot(Robot robot,String type)
    {
        if(type=="cut")
        {
            if(cutRobot.size()<cutRobot_num)
            {
                cutRobot.add(robot);
            }
            else
                System.out.println("The cutting robot positions are full");
        }
        if(type=="drill")
        {
            if(drillRobot.size()<drillRobot_num)
            {
                drillRobot.add(robot);
            }
            else
                System.out.println("The drilling robot positions are full");
        }
        if(type=="assembly")
        {
            if(assemblyRobot.size()<assemblyRobot_num)
            {
                assemblyRobot.add(robot);
            }
            else
                System.out.println("The assembly robot positions are full");
        }
    }
   public void send_command(String Command)
   {
    if(Command=="cut")
    {
       for(int x=rawMaterial;x>0;x=x-cutRobot.size())
            {
                    for(Robot cut:cutRobot)
                    {
                        cut.fetchParts();
                    }
                    for(Robot cut:cutRobot)
                    {
                        cut.doTask();
                    }
                    
                    for(Robot cut:cutRobot)
                    {
                        cut.storeParts();
                    }
        }
    }
                for(int x=rawMaterial;x>0;x=x-drillRobot.size()){
                if(Command=="drill")
                {
                        for(Robot drill:drillRobot)
                        {
                            drill.fetchParts();
                        }
                        for(Robot drill:drillRobot)
                        {
                            drill.doTask();
                        }
                        
                        for(Robot drill:drillRobot)
                        {
                            drill.storeParts();
                        }
                }
            }
                if(Command=="assembly")
                {
                    Robot assembly=assemblyRobot.get(0);
                    for(int x=0;x<rawMaterial;x++)
                    {
                        assembly.fetchParts();
                    }
                        assembly.doTask();
                        assembly.storeParts();
                }
            }
}
