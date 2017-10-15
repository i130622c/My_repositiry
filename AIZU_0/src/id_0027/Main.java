package id_0027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/*何曜日？
2004 年 1 月 1 日から 12 月 31 日までの日付を入力し、その日の曜日を出力するプログラムを作成して下さい。
なお、2004 年 1 月 1 日は木曜日です。また、2004 年はうるう年ですので 2 月29 日があることに注意して下さい。

Input
複数のデータセットを処理しなければなりません。
１つのデータセットに月と日が１つのスペースで区切られて１行に与えられます。
月が 0 となったとき入力の最後とします（この場合は処理をしないでプログラムを終了させる）。
データセットの数は 50 を超えません。

Output
各データセットごとに曜日を英語で１行に出力して下さい。*/

public class Main{
	public static void main(String[] args){
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
		StringBuilder stringBuilder = new StringBuilder();
		String[] week_name = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                "Thursday", "Friday", "Saturday"};
		try{
			String dataSet;
			while((dataSet=bufferedReader.readLine()) != null){
				String[] dataList = dataSet.split(" ");
				Calendar calender = Calendar.getInstance();
				int month =  Integer.parseInt(dataList[0]);
				int day = Integer.parseInt(dataList[1]);
				if((month == 0)&&(day==0)) break;
				calender.set(2004, month-1, day);
				int week = calender.get(Calendar.DAY_OF_WEEK) -1;
				stringBuilder.append(week_name[week] + "\n");
			}
			System.out.print(stringBuilder);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}