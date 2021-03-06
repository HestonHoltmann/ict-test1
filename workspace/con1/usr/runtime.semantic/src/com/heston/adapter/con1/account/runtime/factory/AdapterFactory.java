// Copyright (c) 2010 Informatica Corporation. All rights reserved.

// *** This file is generated. Do not modify. ***

package com.heston.adapter.con1.account.runtime.factory;

import java.io.PrintStream;
import java.util.Iterator;
import com.informatica.adapter.sdkadapter.aso.semantic.auto.SAD_Factory;
import java.util.Date;
import com.informatica.messages.InfaMessage;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import com.informatica.imf.icore.IProperty;
import com.informatica.adapter.sdkadapter.logical.semantic.manual.*;
import java.util.Collections;
import java.util.LinkedHashSet;

@SuppressWarnings("unused") //$NON-NLS-1$
public class AdapterFactory extends SAD_Factory
{



    /** Map contains assoications between IMF interfaces and semantic/validator classes */
    private static java.util.concurrent.ConcurrentHashMap<String, MapEntry> _AdapterFactory_map = new java.util.concurrent.ConcurrentHashMap<String, MapEntry>();

    /** Get mapping for this IMF class. Delegate upwards if not found */
    public MapEntry getMapping(String imfInterfaceClass) throws SL_Exception
    {
        MapEntry rc = _AdapterFactory_map.get(imfInterfaceClass);
        if(rc==null)
            return super.getMapping(imfInterfaceClass);
        else {
            if(rc.semanticClass == null)
            {
                MapEntry rc1 = super.getMapping(imfInterfaceClass);
                rc.semanticClass = rc1.semanticClass;
            }
            return rc;
        }

    }




    // Associate IMF classes with semantic/validator classes.
    // Strings are used for delayed class loading in DxT
    static {
        MapEntry entry;
        entry = new MapEntry("com.heston.adapter.con1.account.runtime.capability.semantic.auto.SAAccountCallCapabilityAttributesExtension", "com.heston.adapter.con1.account.runtime.capability.objectmanager.auto.MAAccountCallCapabilityAttributesExtension");
        addMapping(_AdapterFactory_map, "com.heston.adapter.con1.account.runtime.capability.AccountCallCapabilityAttributesExtension", entry);
        entry = new MapEntry("com.heston.adapter.con1.account.runtime.capability.semantic.auto.SAAccountLookupCapabilityAttributesExtension", "com.heston.adapter.con1.account.runtime.capability.objectmanager.auto.MAAccountLookupCapabilityAttributesExtension");
        addMapping(_AdapterFactory_map, "com.heston.adapter.con1.account.runtime.capability.AccountLookupCapabilityAttributesExtension", entry);
        entry = new MapEntry("com.heston.adapter.con1.account.runtime.capability.semantic.auto.SAAccountReadCapabilityAttributesExtension", "com.heston.adapter.con1.account.runtime.capability.objectmanager.auto.MAAccountReadCapabilityAttributesExtension");
        addMapping(_AdapterFactory_map, "com.heston.adapter.con1.account.runtime.capability.AccountReadCapabilityAttributesExtension", entry);
        entry = new MapEntry("com.heston.adapter.con1.account.runtime.capability.semantic.auto.SAAccountWriteCapabilityAttributesExtension", "com.heston.adapter.con1.account.runtime.capability.objectmanager.auto.MAAccountWriteCapabilityAttributesExtension");
        addMapping(_AdapterFactory_map, "com.heston.adapter.con1.account.runtime.capability.AccountWriteCapabilityAttributesExtension", entry);
        entry = new MapEntry("com.heston.adapter.con1.runtime.aso.semantic.auto.SAComplexASO", "com.heston.adapter.con1.runtime.aso.objectmanager.auto.MAComplexASO");
        addMapping(_AdapterFactory_map, "com.heston.adapter.con1.runtime.aso.ComplexASO", entry);
        entry = new MapEntry(null, "com.heston.adapter.con1.runtime.semantic.manual.Con1ASOOperationObjMgr");
        addMapping(_AdapterFactory_map, "com.informatica.adapter.sdkadapter.aso.D_ASOOperation", entry);
    }
}
