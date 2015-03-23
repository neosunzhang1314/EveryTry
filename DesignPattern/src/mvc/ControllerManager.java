package mvc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangziyang on 14-10-10.
 */
public class ControllerManager {
    public static Map controllerFactory;
    static{
        controllerFactory=new HashMap();
        controllerFactory.put("mainController",Controller.class);
        controllerFactory.put("subController",SubController.class);
    }
}
