package cc150.stacks_and_queues;

/**
 * Created by xianyu.hxy on 2015/8/18.
 */
public class _3_1_1 {
    int stackSize=300;
    int indexUsed=0;
    int[] stackPointer={-1,-1,-1};
    StackNode[] buffer=new StackNode[stackSize*3];
    void push(int stackNum,int value){
        int lastIndex=stackPointer[stackNum];
        stackPointer[stackNum]=indexUsed;
        indexUsed++;
        buffer[stackPointer[stackNum]]=new StackNode(lastIndex,value);
    }
    int pop(int stackNum){
        int value=buffer[stackPointer[stackNum]].value;
        int lastIndex=stackPointer[stackNum];
        stackPointer[stackNum]=buffer[stackPointer[stackNum]].previous;
        buffer[lastIndex]=null;
        indexUsed--;
        return value;
    }
    int peek(int stack){
        return buffer[stackPointer[stack]].value;
    }
    boolean isEmpty(int stackNum){
        return stackPointer[stackNum]==-1;
    }

    class StackNode{
        public int previous;
        public int value;
        public StackNode(int p,int v){
            value=v;
            previous=p;
        }
    }
}
