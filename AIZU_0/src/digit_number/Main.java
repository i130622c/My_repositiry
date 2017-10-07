package digit_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
桁数
与えられた２つの整数 a と b の和の桁数を出力するプログラムを作成して下さい。

Input
複数のデータセットが与えられます。
各データセットは １ 行に与えられます。
各データセットは２つの整数 a と b が１つのスペースで区切られて与えられます。
入力の終わりまで処理して下さい。

Constraints
0 ≤ a, b ≤ 1,000,000
データセットの数 ≤ 200
Output
各データセットごとに、a+b の桁数を出力して下さい。

Sample Input
5 7
1 99
1000 999

Output for the Sample Input
2
3
4
*/
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		// 入力された値を読み込む、InputStreamReaderのインスタンスisrを生成
		InputStreamReader isr = new InputStreamReader(System.in);
		
		// isrをラップするBufferedReaderのインスタンスbrを生成
		BufferedReader br = new BufferedReader(isr);
		
		//文字列の生成
		StringBuilder sb = new StringBuilder();
		
		while(true){
			// 1行読み込んで文字列dataSetに代入
			String dataSet = br.readLine();
			if(dataSet==null) break;
			String[] dataList = dataSet.split(" ");
			int totalDigit = String.valueOf(dataList[0]).length() + String.valueOf(dataList[1]).length();
			sb.append(totalDigit + "\n");
		}
		System.out.print(sb);
	}
}
