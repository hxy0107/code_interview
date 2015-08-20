package cc150.stacks_and_queues;

/**
 * Created by xianyu.hxy on 2015/8/18.
 */
/*
3 1 Describe how you could use a single array to implement three stacks
 */
public class _3_1 {
    int stackSize=300;
    int[] buffer=new int[stackSize*3];
    int[] stackPointer={0,0,0};
    void push(int stackNum,int value){
        int index=stackNum*stackSize+stackPointer[stackNum]+1;
        stackPointer[stackNum]++;
        buffer[index]=value;
    }
    int pop(int stackNum){
        int index=stackNum*stackSize+stackPointer[stackNum];
        stackPointer[stackNum]--;
        int value=buffer[index];
        buffer[index]=0;
        return value;
    }
    int peek(int stackNum){
        int index=stackNum*stackSize+stackPointer[stackNum];
        return buffer[index];
    }
    boolean isEmpty(int stackNum){
        return stackPointer[stackNum]==stackNum*stackSize;
    }
}

