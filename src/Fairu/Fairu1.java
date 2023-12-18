// ファイルのパス名を指定
String filePath = "C:\\test.txt";

// ファイルのオブジェクトを作成
IFile file = Resources.createFile(filePath);

//ファイルに書き込む文字列を準備
String str = "Hello, world!";


//ファイルに書き込むバイト配列を準備
byte[] bytes = "Hello, world!".getBytes();

/ ファイルに書き込むオブジェクトを準備
Person person = new Person("John Doe", 30);

//ファイルに文字列を書き込む
file.setContents(str.getBytes(), IResource.FORCE, null);


file.setContents(bytes, IResource.FORCE, null);

ObjectOutputStream out = new ObjectOutputStream(file.getContents(true));
out.writeObject(person);
out.close();

//ファイルを閉じる
file.close();

public class SaveFile {

    public static void main(String[] args) throws IOException {
        // ファイルのパス名を指定
        String filePath = "C:\\test.txt";

        // ファイルのオブジェクトを作成
        IFile file = Resources.createFile(filePath);

        // ファイルに書き込む文字列を準備
        String str = "Hello, world!";

        // ファイルに文字列を書き込む
        file.setContents(str.getBytes(), IResource.FORCE, null);

        // ファイルを閉じる
        file.close();
    }
}