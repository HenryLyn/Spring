package top.linhuarui.spring.bean.autowiring;

/**
* @author LHR
* @date 2018/7/16
* @desc auto wiring practice.
*/
public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;

    public AutoWiringService (AutoWiringDAO autoWiringDAO) {
        System.out.println("Constructor");
        this.autoWiringDAO = autoWiringDAO;
    }


    /**
    * @author LHR
    * @date 2018/7/16
    * @desc setAutoWiringDAO
    * @params [autoWiringDAO]
    * @returns void
    */
    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("setter");
        this.autoWiringDAO = autoWiringDAO;
    }

    /**
    * @author LHR
    * @date 2018/7/16
    * @desc say
    * @params [world]
    * @returns void
    */
    public void say (String world) {
        this.autoWiringDAO.say(world);
    }
}
