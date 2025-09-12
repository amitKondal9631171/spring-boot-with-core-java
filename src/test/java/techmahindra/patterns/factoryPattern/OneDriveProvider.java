package techmahindra.patterns.factoryPattern;

import java.util.Map;

public class OneDriveProvider implements RemoteStorageProvider {
    private final Map<String, String> settings;

    public OneDriveProvider(Map<String, String> settings) {
        this.settings = settings;
    }

    @Override
    public void upload(String filePath) {
        System.out.println("Uploading to SharePoint: " + filePath);
    }

    @Override
    public void download(String filePath) {
        System.out.println("Downloading from SharePoint: " + filePath);
    }
}