package repository;

import model.FileData;
import java.util.ArrayList;

public class FileRepository {
    private ArrayList<FileData> files = new ArrayList<>();

    public void save(FileData file) {
        files.add(file);
    }

    public FileData findById(String fileId) {
        for (FileData f : files) {
            if (f.getFileId().equals(fileId)) {
                return f;
            }
        }
        return null;
    }
}
