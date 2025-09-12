package techmahindra.patterns.factoryPattern;

public interface RemoteStorageProvider {
    void upload(String filePath);
    void download(String filePath);
}