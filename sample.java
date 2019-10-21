import java.io.*; //java.ioという名前のパッケージに含まれている全てのクラスとインターフェイスをimportする、という意味

class Sample1 {
  public static void main(String[] args)  throws IOException
  {

    BufferedReader br =    //BufferedReaderクラスとは、テキストファイルを読み込むためのクラス
     new BufferedReader(new InputStreamReader(System.in));

     String str = br.readLine();
     //入力された文字列をstrで表す

     int res = Integer.parseInt(str);

     if (res == 2)
        　System.out.println("2が出力されました");
  }
}
