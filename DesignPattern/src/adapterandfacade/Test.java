package adapterandfacade;

import java.util.List;

/**
 * Created by zhangziyang on 14-9-17.
 */
public class Test {
    public static void main(String[] args) {
        Listener listener1=new Listener() {
            @Override
            public void action1() {
                System.out.println("do Action1");
            }

            @Override
            public void action2() {
                System.out.println("do Action2");
            }

            @Override
            public void action3() {
                System.out.println("do Action3");
            }
        };
      Listener simpleAdapterListener=new AbstractAdapter() {
          @Override
          public void action1() {
              System.out.println("do simple adapter listener action1");
          }

          @Override
          public void action2() {
              System.out.println("do simple adapter listener action2");
          }
      };

     ListenerAdapter listenerAdapter1= new ListenerAdapter(listener1);
     ListenerAdapter listenerAdapter2= new ListenerAdapter(simpleAdapterListener);
     listenerAdapter1.specialAction();
        System.out.println("------------------------------");
     listenerAdapter2.specialAction();
//       ListenerFacade listenerFacade1=new ListenerFacade(listener1);
//       ListenerFacade listenerFacade2=new ListenerFacade(simpleAdapterListener);
//       listenerFacade1.doAll();
//        System.out.println("------------------------------");
//        listenerFacade2.doAll();
    }
}
