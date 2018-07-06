package algorithm;
//将字符串中的空格转换为%20
public class ReplaceBlank {
    public String Replace(String input){
        if (input == null) {
            return null;
        }
        StringBuffer outString = new StringBuffer();
        for (int i = 0; i <input.length() ; i++) {
           if (input.charAt(i)==' '){
               outString.append("%");
               outString.append("2");
               outString.append("0");
           }else {
               outString.append(input.charAt(i));
           }
        }
        return new String(outString);
    }

    public static void main(String[] args) {
        String a = "asd as dasd";
        ReplaceBlank replaceBlank = new ReplaceBlank();
        System.out.println(replaceBlank.Replace(a));
    }
}
