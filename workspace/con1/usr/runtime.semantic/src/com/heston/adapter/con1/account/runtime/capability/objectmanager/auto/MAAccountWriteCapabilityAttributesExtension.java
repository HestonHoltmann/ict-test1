// Copyright (c) 2010 Informatica Corporation. All rights reserved.

// *** This file is generated. Do not modify. ***

package com.heston.adapter.con1.account.runtime.capability.objectmanager.auto;

import java.io.PrintStream;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.MetadataObject;
import java.util.Iterator;
import java.util.Date;
import com.informatica.messages.InfaMessage;
import java.util.Collection;
import com.heston.adapter.con1.account.runtime.capability.semantic.auto.SAAccountWriteCapabilityAttributesExtension;
import java.util.Set;
import java.util.HashMap;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.Action;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.ObjectManagerContext;
import java.util.ArrayList;
import java.util.List;
import com.informatica.sdk.adapter.metadata.asoextension.objectmanager.manual.MD_ModelExtensionWriteCapAttributes;
import com.informatica.imf.icore.IProperty;
import com.informatica.adapter.sdkadapter.logical.semantic.manual.*;
import com.informatica.adapter.sdkadapter.logical.objectmanager.manual.ObjectManagerContextImpl;
import com.informatica.adapter.sdkadapter.logical.objectmanager.manual.OM_Obj;
import com.informatica.adapter.sdkadapter.logical.semantic.messages.Sdk_app_comMsg;
import java.util.Collections;
import com.informatica.adapter.sdkadapter.logical.validation.manual.SL_ValidationException;
import java.util.LinkedHashSet;

/** 
  * Object Manager for 
  */
@SuppressWarnings("unused") //$NON-NLS-1$
public class MAAccountWriteCapabilityAttributesExtension extends MD_ModelExtensionWriteCapAttributes implements OM_Obj
{

    /** Validate all fields. Override this in semantic layer to add custom validation */
    public boolean validateAll(boolean recurse, ObjectManagerContext ctx, MetadataObject currentObj, MetadataObject containerObj) throws SL_ValidationException
    {
        boolean rc = true;
        if(!super.validateAll(recurse, ctx, currentObj, containerObj))
            rc = false;
        SAAccountWriteCapabilityAttributesExtension semObj = (SAAccountWriteCapabilityAttributesExtension)currentObj;
        SL_ContainerObj rootObj = semObj.getRootObj();
        if(!validate_UpdateMode(new ObjectManagerContextImpl(Action.NOCHANGE), semObj.getUpdateMode(), semObj)) rc = false;
        return rc;

    }

    /** Validate the 'UpdateMode' property  */
    public boolean validate_UpdateMode(ObjectManagerContext ctx, String newVal, MetadataObject semanticObject) throws SL_ValidationException
    {
        boolean rc = true;
        if(newVal.length()<0 || newVal.length()>4000)
            rc = Utils.processLengthViolation((SL_Obj)semanticObject, newVal.length(), 0, 4000, newVal, com.heston.adapter.con1.account.runtime.capability.AccountWriteCapabilityAttributesExtension.Properties.UPDATE_MODE);
        return rc;

    }

}
