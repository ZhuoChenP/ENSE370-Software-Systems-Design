    /*I use the factory pattern to create desired type of robot more efficiently which is constructed in RobotFactory class
    I also use Singleton pattern to only allow the user create the instance of different type of robot by using the build in function. 
    singleton patterns are build in each type of robot class, AssemblyRobot class, OccurrenceCut class, OccurrenceDrill class.
    The third pattern that I use is The Abstraction Occurrence Pattern to reduce the duplication of same type robot. 
    For this pattern, Abstraction classes are CuttingRobot class and DrillingRobot
    Occurrence classes are OccurrenceDrill and OccurrenceCut.
    */

public class A01chen222z {
    public static void main (String [] args){
        RobotFactory factory=new RobotFactory();
        Robot cut_1=factory.createRobot("cut",100200300401L);
        Robot cut_2=factory.createRobot("cut",100200300402L);
        Robot drill_1=factory.createRobot("drill",200200300401L);
        Robot drill_2=factory.createRobot("drill",200200300401L);
        Robot assembly=factory.createRobot("assembly",300200300401L);
        RobotController control=new RobotController();
        control.rawMaterial_num(4);
        control.add_robot(cut_1, "cut");
        control.add_robot(cut_2, "cut");
        control.add_robot(drill_1, "drill");
        control.add_robot(drill_2, "drill");
        control.add_robot(assembly, "assembly");
        control.send_command("cut");
        control.send_command("drill");
        control.send_command("assembly");

    }

}
