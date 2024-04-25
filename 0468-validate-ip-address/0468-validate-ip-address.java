class Solution {
    public String validIPAddress(String queryIP) {
        int n = queryIP.length();
        if (n == 0) {
            return "Neither";
        }
        int cnt1=0,cnt2=0;
        for(char c: queryIP.toCharArray()){
            if(c=='.') cnt1++;
            if(c==':' ) cnt2++;
        }
        if (queryIP.charAt(n - 1) == '.' || queryIP.charAt(n - 1) == ':' ||queryIP.charAt(0) == '.'||queryIP.charAt(0) == ':') {
            return "Neither";
        }
       
        if (cnt1==3) {
          String arr[]    = queryIP.split("\\.");
        
        if (arr.length == 4) {
            // int flag = 0;
            for (String str : arr) {
                if (!isIPv4(str)) {
                    // flag = 1;
                    return "Neither";
                }
            }
        }
            // if(flag == 0){
            return "IPv4";
            // }
        } 
        if(cnt2==7) {
            String arr[]  = queryIP.split("\\:");
        
         if (arr.length == 8) {
            // int flag = 0;
            // for (String str : arr) {
                if (!isIPv6(arr)) {
                    // flag = 1;
                    return "Neither";
                // }
            }
            // if(flag == 0){
            return "IPv6";
            // }
        }
        }
        return "Neither";
    }

    private boolean isIPv4(String str) {
        if (str.length() > 1 && str.charAt(0) == '0') {
                return false;
            } 
        try{
             int num = Integer.parseInt(str);
        if (num < 0 || num > 255) return false;
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isIPv6(String[] strs) {
        
        for(String str:strs){
        if (str.length() > 4 || str.length()<=0) return false; 
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if ((ch >= 'a' && ch <= 'f') ||  (ch >= 'A' && ch <= 'F')||(ch >= '0' && ch <= '9') ) {
                    continue;
                } else {
                    return false;
                }
            }
        }
            return true;
        
    
}
}