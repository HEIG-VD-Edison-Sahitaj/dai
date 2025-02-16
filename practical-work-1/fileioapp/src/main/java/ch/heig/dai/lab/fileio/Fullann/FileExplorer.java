package ch.heig.dai.lab.fileio.Fullann;

import java.io.File;
import java.util.HashSet;

public class FileExplorer {
    private final File folder;
    private HashSet<File> knownFiles;

    /**
     * Constructor
     * Memorize the folder to explore and initialize the set of known files.
     * @param folder the path to the folder to explore
     */
    public FileExplorer(String folder) {
        this.folder = new File(folder);
        this.knownFiles = new HashSet<File>();
    }

    /**
     * Get a single new file from the folder.
     * The file must not have been returned before.
     * Use the java.io.file API to get the list of files in the folder.
     * Use the HashSet knownFiles to keep track of the files that have already been returned.
     * @return a new file, or null if there is no new file
     */
    public File getNewFile() {
        // Verify if the folder exists and is a directory
        if (folder.exists() && folder.isDirectory()) {
            // Get the list of files in the folder
            File[] files = folder.listFiles();

            if (files != null) {
                // Iterate through the files
                for (File file : files) {
                    // If the file is not already in knownFiles, return it
                    if (!knownFiles.contains(file)) {
                        knownFiles.add(file); // Mark the file as returned
                        return file;
                    }
                }
            }
        }
        // Return null if no new file is found
        return null;
    }
}
