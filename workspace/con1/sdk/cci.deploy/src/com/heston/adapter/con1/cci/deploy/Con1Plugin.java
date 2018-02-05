package com.heston.adapter.con1.cci.deploy;

import java.util.HashMap;
import java.util.UUID;
import com.informatica.cloud.adapter.cci.boot.CCIBootPlugin;
import com.informatica.cloud.api.adapter.plugin.IPluginExtension;
import com.informatica.cloud.adapter.cci.boot.CCIBootPlugin;
import com.informatica.cloud.api.adapter.plugin.IPluginExtension;

public class Con1Plugin extends CCIBootPlugin  implements IPluginExtension {

    static final String uuid = "91bfb16a-4bc0-4398-bce9-b0f6efdad68a";

    static final String ADAPTER_ID = "com.heston.adapter.con1";

    static HashMap<String, Object> configurations = new HashMap<String, Object>();
    static {
            configurations.put("schema", "Folder");
            configurations.put("Account.AccountWrite.Upsert", "UpdateMode.Update else Insert");
            configurations.put("HAS_FAULT", false);
    }


    public Con1Plugin(){
    		super(UUID.fromString(uuid), ADAPTER_ID, configurations);
    }


}