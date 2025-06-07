public FileInputStream(File file) throws FileNotFoundException {
    // Check if the file is null
    if (file == null) {
        throw new NullPointerException("File cannot be null");
    }
    // Check if the file exists and is not a directory
    if (!file.exists()) {
        throw new FileNotFoundException("File does not exist: " + file);
    }
    if (file.isDirectory()) {
        throw new FileNotFoundException("Cannot open a directory: " + file);
    }

    // Open the file and create a FileDescriptor
    fd = new FileDescriptor();  // File descriptor to track the open file
    open(file.getPath());  // Calls a native method to open the file
}
