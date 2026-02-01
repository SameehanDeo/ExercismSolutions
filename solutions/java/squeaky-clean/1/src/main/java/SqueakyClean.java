class SqueakyClean {
    
    
    static String clean(String identifier){
        char[] numsArr = {'4','3','0','1','7'};
        char[] letterArr = {'a','e','o','l','t'};
        char[] stringAsArray = identifier.toCharArray();
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<stringAsArray.length; i++){
            if(Character.isWhitespace(stringAsArray[i])){
                result.append("_");
            }
            else if(stringAsArray[i]=='-'){
                if(i+1<stringAsArray.length){
                    result.append( Character.toUpperCase(stringAsArray[i+1]) );
                    i++;
                }
            }
            else if(Character.isDigit(stringAsArray[i])){
                boolean replaced = false;
                for(int j=0;j<letterArr.length;j++){
                    if(stringAsArray[i]==numsArr[j]){
                        result.append(letterArr[j]);
                        replaced=true;
                        break;
                    }
                }
                if (!replaced) {
                    //pass
                }
            }
            else if(Character.isLetter(stringAsArray[i])){
                result.append(stringAsArray[i]);
            }
                
            }
    
        String result1 = result.toString();
        return result1;
        
    }//method (clean) close
    
} //class close

