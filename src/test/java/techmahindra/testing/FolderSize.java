package techmahindra.testing;

import java.io.File;
import java.util.ArrayList;
public class FolderSize
{
    public static void main(String[] args) {
        long folderSize = findSize("C:\\Users");
        System.out.println("Size in byte :"+folderSize);
    }
    public static long findSize(String path) {
        long totalSize = 0;
        ArrayList<String> directory = new ArrayList<String>();
        File file = new File(path);

        if(file.isDirectory()) {
            directory.add(file.getAbsolutePath());
            while (directory.size() > 0) {
                String folderPath = directory.get(0);
                System.out.println("Size of this :"+folderPath);
                directory.remove(0);
                File folder = new File(folderPath);
                File[] filesInFolder = folder.listFiles();
                int noOfFiles = filesInFolder.length;

                for(int i = 0 ; i < noOfFiles ; i++) {
                    File f = filesInFolder[i];
                    if(f.isDirectory()) {
                        directory.add(f.getAbsolutePath());
                    } else {
                        totalSize += f.length();
                    }
                }
            }
        } else {
            totalSize = file.length();
        }
        return totalSize;
    }
}
