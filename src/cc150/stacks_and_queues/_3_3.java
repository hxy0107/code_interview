package cc150.stacks_and_queues;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by xianyu.hxy on 2015/8/18.
 */
/*
3 3 Imagine a (literal) stack of plates  If the stack gets too high, it might topple  Therefore, in real life, we would likely start a new stack when the previous stack exceeds
some threshold  Implement a data structure SetOfStacks that mimics this  SetOfStacks should be composed of several stacks, and should create a new stack once
the previous one exceeds capacity  SetOfStacks push() and SetOfStacks pop() should
behave identically to a single stack (that is, pop() should return the same values as it
would if there were just a single stack)
FOLLOW UP
Implement a function popAt(int index) which performs a pop operation on a specific
sub-stack
 */
    //wrong answer
public class _3_3 {
    ArrayList<Stack> stacks=new ArrayList<Stack>();
    public int capacity;
    public void SetOfStacks(int capacity){
        this.capacity=capacity;
    }
    public Stack getLastStack(){
        if(stacks.size()==0)return null;
        return stacks.get(stacks.size()-1);
    }
    public void push(int v){
    }
    public int pop(){
        Stack last=getLastStack();
        int v=(int)last.pop();
        if(last.size()==0)stacks.remove(stacks.size()-1);
        return v;
    }
    public int popAt(int index){
        return leftShift(index,true);
    }
    public int leftShift(int index,boolean removeTop){
        Stack stack=stacks.get(index);
        int removed_item;
        if(removeTop)removed_item=(int)stack.pop();
        return 0;
    }


}

