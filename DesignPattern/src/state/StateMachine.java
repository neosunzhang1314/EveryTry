package state;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangziyang on 14-9-28.
 */
public class StateMachine {
    State state1=new State1();
    State state2=new State2();
    State state3=new State3();
    State state4=new State4();
    State currState=null;
    Map stateBuff=null;
    public StateMachine(){
        stateBuff=new HashMap();
        stateBuff.put(1,state1);
        stateBuff.put(2,state2);
        stateBuff.put(3,state3);
        stateBuff.put(4,state4);
        currState=state1;
    }

   public void goNext(){
       int temp= (int) Math.round(Math.random()*3+1);
       currState= (State) stateBuff.get(temp);
   }

   public void realAction1(){
       System.out.println("current state:"+currState);
       currState.action1();
       goNext();
   }

    public void realAction2(){
        System.out.println("current state:"+currState);
        currState.action2();
        goNext();
    }

    public void realAction3(){
        System.out.println("current state:"+currState);
        currState.action3();
        goNext();
    }

    public void realAction4(){
        System.out.println("current state:"+currState);
        currState.action4();
        goNext();
    }

    public void doAll(){
        System.out.println("start state machine");
        realAction1();
        realAction2();
        realAction3();
        realAction4();
        System.out.println("stop state machine");
    }


    public static void main(String[] args) {
        StateMachine sm=new StateMachine();
        for(int i=0;i<2;i++){
          sm.doAll();
      }
    }
}
