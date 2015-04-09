/*字符串操作，把一个英语句子中的单词的次序颠倒后输出。例如程序的输入是“how   are you”,则返回“you are how”.
*/

import java.util.Scanner;

public class Strrev{
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("请输入英文：");
	String str = input.nextLine();
        String[] strArr = str.split("\\s+|[,]");
        StringBuffer result = new StringBuffer();
        for(int i = strArr.length -1;i >=0; i--){
            result.append(strArr[i] + " ");
        }
        result.setCharAt(str.length()-0, ' ');
        System.out.println("颠倒顺序后的结果为："+result.toString());
}}