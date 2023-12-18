package ritsu.test01;

import java.io.File;

public class Fairu11 {

    public static void main(String[] args) throws Exception {
        // ファイルのパス
        String filePath = "/tmp/test.txt";

        // ファイルを作成
        File file = new File(filePath);
        file.createNewFile();

        // ファイルの存在を確認
        if (file.exists()) {
            System.out.println("ファイルが作成されました。");
        }
    }
}