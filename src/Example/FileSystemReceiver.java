package Example;

import java.io.FilterInputStream;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closedFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile(){
        System.out.println("Opening file in unix OS");
    }

    @Override
    public void writeFile(){
        System.out.println("Writing file in unix OS");
    }

    @Override
    public void closedFile(){
        System.out.println("Closing file in unix IS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closedFile() {
        System.out.println("Closing file in Windows OS");
    }
}
