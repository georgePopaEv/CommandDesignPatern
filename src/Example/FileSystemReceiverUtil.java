package Example;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else {
            return new UnixFileSystemReceiver();
        }
    }
}
