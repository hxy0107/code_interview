package test;

/**
 * Created by xianyu.hxy on 2015/8/25.
 */
public class Remote {
    public void executeMessage(String msg,CallBack callBack){
        for(int i=0;i < 1000000000;i++){
            ;
        }
        System.out.println("excute msg:"+msg);
        msg = msg+"msg change...";
        callBack.execute(msg);
    }
}
