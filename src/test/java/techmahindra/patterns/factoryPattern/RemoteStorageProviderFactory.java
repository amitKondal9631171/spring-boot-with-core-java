package techmahindra.patterns.factoryPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteStorageProviderFactory {

    private static final Map<String, Function<Map<String, String>, RemoteStorageProvider>> registry = new HashMap<>();

    static {
        // Register all providers
        registry.put("sharepoint", SharepointProvider::new);
        registry.put("onedrive", OneDriveProvider::new);
       // registry.put("s3", S3Provider::new);
        //registry.put("sftp", SFTPProvider::new);
    }

    public static RemoteStorageProvider getProvider(Map<String, String> settings) throws Exception {
        String type = settings.get("dataStoreType");
        if (type == null) {
            throw new IllegalArgumentException("dataStoreType missing from settings");
        }

        Function<Map<String, String>, RemoteStorageProvider> creator = registry.get(type.toLowerCase());
        if (creator == null) {
            throw new UnsupportedOperationException("Store type not supported: " + type);
        }

        return creator.apply(settings);
    }
}