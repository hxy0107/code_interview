package leetcode;

/**
 * Created by xianyu.hxy on 2015/8/6.
 */
/*
Compare Version Numbers Total Accepted: 28629 Total Submissions: 187231 My Submissions Question Solution
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
Credits:
Special thanks to @ts for adding this problem and creating all test cases.
 */
public class _165 {
    public static int compareVersion(String version1,String version2){
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");

        int i=0;
        while(i<arr1.length||i<arr2.length){
            if(i<arr1.length&&i<arr2.length){
                if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i]))
                    return -1;
                else if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i]))
                    return 1;
            }else if(i<arr1.length){
                if(Integer.parseInt(arr1[i])!=0)
                    return 1;
            }else if(i<arr2.length){
                if(Integer.parseInt(arr2[i])!=0)
                    return -1;
            }
            i++;
        }
        return 0;
    }
    public static void main(String[] args){
        compareVersion("1","0");
    }
}
