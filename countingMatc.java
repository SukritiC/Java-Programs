/**
 * 1773. Count Items Matching a Rule
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> a:items){
            // System.out.println(a+ " "+ ruleKey);
            switch(ruleKey){
                case "type":
                    // System.out.print("23");
                    if(a.get(0).equals(ruleValue)){
                        // System.out.print("1");
                      count++;  
                    }
                    break;
                case "color":
                    // System.out.print(a.get(1)+" "+ruleValue);
                    if(a.get(1).equals(ruleValue)){
                        // System.out.print("2");
                      count++;  
                    }
                    break;
                case "name":
                    // System.out.print("21");
                    if(a.get(2).equals(ruleValue)){
                        // System.out.print("3");
                      count++;  
                    }
                    break;
            }
        }
        return count;
    }
}