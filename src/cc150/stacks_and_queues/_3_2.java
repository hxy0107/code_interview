package cc150.stacks_and_queues;

import java.util.Stack;

/**
 * Created by xianyu.hxy on 2015/8/18.
 */
/*
3 2 How would you design a stack which, in addition to push and pop, also has a function
min which returns the minimum element? Push, pop and min should all operate in
O(1) time
 */
public class _3_2 {

    public class StackWithMin extends Stack<NodeWithMin>{
        public void push(int value){
            int newMin=Math.min(value,min());
            super.push(new NodeWithMin(value,newMin));
        }
        public int min(){
            if(this.isEmpty()){
                return Integer.MAX_VALUE;
            }else {
                return peek().min;
            }
        }
    }
    class NodeWithMin{
        public int value;
        public int min;
        public NodeWithMin(int v,int min){
            value=v;
            this.min=min;
        }
    }
    public class StackWithMin2 extends Stack<Integer>{
        Stack<Integer> s2;
        public StackWithMin2(){
            s2=new Stack<Integer>();
        }
        public void push(int value){
            if(value<=min()){
                s2.push(value);
            }
            super.push(value);
        }
        public Integer pop(){
            int value=super.pop();
            if(value==min()){
                s2.pop();
            }
            return value;
        }
        public int min(){
            if(s2.isEmpty()){
                return Integer.MAX_VALUE;
            }else {
                return s2.peek();
            }
        }
    }
}



















