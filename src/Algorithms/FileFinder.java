package Algorithms;

import java.io.File;

public class FileFinder {
    public void findFile(String fileName, String inputPath) {
        File directory = new File(inputPath);
        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            for (File file : list) {
                findFile(fileName, file.getAbsolutePath());
            }
        }   else if (fileName.equals(directory.getName())) {
            System.out.println(inputPath + "/" + fileName + "found");
        }
    }

    public static void main(String args[]) {
        String projectPath = System.getProperty("user.dir");
        FileFinder fileFinder = new FileFinder();
        fileFinder.findFile("12111298", projectPath);
    }

}
