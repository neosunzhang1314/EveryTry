package interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangziyang on 14-10-15.
 */
public class OldInterpreter {
    VirtualDog virtualDog;
    public OldInterpreter(VirtualDog virtualDog){
        this.virtualDog=virtualDog;
    }

    public void doCommand(String command){
        Map commandMap=parseRule(command);
        String doCommand= (String) commandMap.get("COMMAND");
        String  step= (String) commandMap.get("STEP");
        virtualDog.setStep(Integer.parseInt(step));
        if("up".equals(doCommand)){
            virtualDog.goUp();
        }else if("down".equals(doCommand)){
            virtualDog.goDown();
        }else if("left".equals(doCommand)){
            virtualDog.goLeft();
        }else if("right".equals(doCommand)){
            virtualDog.goRight();
        }else{
            System.out.println("wrong command");
        }

    }

    private Map parseRule(String command){
        Map commandMap=new HashMap();
        String regex="(\\w+)\\s(\\d);";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(command);
        if(matcher.find()){
           commandMap.put("COMMAND",matcher.group(1));
           commandMap.put("STEP",matcher.group(2));
        }
        return commandMap;
    }

}
