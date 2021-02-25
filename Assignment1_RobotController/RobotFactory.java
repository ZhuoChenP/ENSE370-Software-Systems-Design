import java.lang.IllegalArgumentException;
public class RobotFactory {
    public Robot createRobot(String robotType,long serial_num)
    {
        if(robotType=="cut")
        {
            OccurrenceCut result=OccurrenceCut.getInstance();
            result.create(serial_num);
            return result;
        }
         if (robotType=="drill")
        {
            OccurrenceDrill result=OccurrenceDrill.getInstance();
            result.create(serial_num);
            return result;
        }
        else if (robotType=="assembly")
        {
            AssemblyRobot result=AssemblyRobot.getInstance();
            result.create(serial_num);
            return result;
        }
        else
         throw new IllegalArgumentException("No corresponding Robot for robot type: " + robotType);
    }
}
