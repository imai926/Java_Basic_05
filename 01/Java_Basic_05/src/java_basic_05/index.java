package java_basic_05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class index {
	public static void main(String[] args) {
		String filePath = "src/java_basic_05/Text.txt";
		String reversefile = "src/java_basic_05/reverseText.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath));
			 BufferedWriter bw = new BufferedWriter(new FileWriter(reversefile)))	{
			
            String line;
            int i =1;
            
            while ((line = br.readLine()) != null) {
                  StringBuffer sb = new StringBuffer(line);
          		  String dst = sb.reverse().toString();
		
          		  bw.write(dst + "\n");
          		  System.out.println("反転後の" + i + "行目の文字列： " + dst);
          		  
          		  i++;
            }
            
            System.out.println("\nファイルに書き込み完了");
            
        	}catch (IOException e) {
            e.printStackTrace();
        }
	}
}
