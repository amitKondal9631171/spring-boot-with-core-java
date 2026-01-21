package techmahindra.patterns.factoryPattern;

import java.util.HashMap;
import java.util.Map;

public class Testing {
    public static void main(String[] args) throws Exception {
        Map<String, String> settings = new HashMap<>();
        settings.put("dataStoreType", "onedrive");

        RemoteStorageProvider provider = RemoteStorageProviderFactory.getProvider(settings);
        provider.upload("report.pdf");
        provider.download("invoice.pdf");
    }
}
