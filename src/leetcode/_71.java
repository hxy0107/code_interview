package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianyu.hxy on 2015/8/25.
 */
/*
Simplify Path Total Accepted: 34420 Total Submissions: 171212 My Submissions Question Solution
Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
 */
public class _71 {
    public String simplifyPath(String path){
        String[] parts=path.split("/");
        List<String> list=new ArrayList<String>();
        for(String item:parts){
            if(item.equals("..")&&!list.isEmpty()){
                list.remove(list.size()-1);
            }else if(!item.equals("")&&!item.equals(".")&&!item.equals("..")){
                list.add(item);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String item:list){
            sb.append("/");
            sb.append(item);
        }
        if(sb.length()==0){return "/";}
        return sb.toString();
    }
}
