// Copyright (c) 2010 Informatica Corporation. All rights reserved.

// *** This file is generated. Do not modify. ***

package com.heston.adapter.con1.account.runtime.capability.semantic.auto;

import java.util.Date;
import com.informatica.tools.core.change.ObjectChangeSink;
import com.heston.adapter.con1.account.runtime.capability.semantic.iface.SEMAccountCallCapabilityAttributesExtension;
import java.util.HashMap;
import com.informatica.imf.utils.ObjectUtils;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.Action;
import com.informatica.adapter.sdkadapter.asoextension.semantic.auto.SAD_ModelExtensionCallCapAttributes;
import java.util.ArrayList;
import com.informatica.imf.icore.IProperty;
import com.informatica.metadata.common.modelextension.semantic.auto.SAModelExtension;
import com.informatica.adapter.sdkadapter.logical.semantic.manual.*;
import java.util.Map;
import com.heston.adapter.con1.account.runtime.capability.AccountCallCapabilityAttributesExtension;
import com.informatica.adapter.sdkadapter.logical.objectmanager.manual.ObjectManagerContextImpl;
import com.informatica.tools.core.change.impl.PropertyBasedObjectChangeImpl;
import com.informatica.adapter.sdkadapter.logical.validation.manual.SL_ValidationException;
import com.informatica.adapter.sdkadapter.logical.semantic.manual.SL_ObjImpl;
import java.util.LinkedHashSet;
import java.io.PrintStream;
import java.util.Iterator;
import com.informatica.messages.InfaMessage;
import java.util.Collection;
import com.heston.adapter.con1.account.runtime.capability.CapabilityIFactory;
import java.util.Set;
import java.util.List;
import com.informatica.semantic.change.ObjectChange;
import com.heston.adapter.con1.account.runtime.capability.objectmanager.auto.MAAccountCallCapabilityAttributesExtension;
import com.informatica.adapter.sdkadapter.logical.semantic.messages.Sdk_app_comMsg;
import java.util.Collections;

/** 
  * Code generated semantic layer wrapper for AccountCallCapabilityAttributesExtension
  */
@SuppressWarnings("unused") //$NON-NLS-1$
public class SAAccountCallCapabilityAttributesExtension extends SAD_ModelExtensionCallCapAttributes implements SL_Obj, SEMAccountCallCapabilityAttributesExtension
{


    protected HashMap<IProperty, Integer> propMap = new HashMap<IProperty, Integer>();
    // get IProperty->propId map
    public Map<IProperty, Integer> getPropMap(){
        // populate the property map if empty
        if (propMap.isEmpty()) {
            java.util.List<IProperty> props = ObjectUtils.getMetaClass(_get_imfObject()).getAllProperties();
            for (IProperty prop : props) {
                // create prop id string
                String propIDStr = prop.getName().toUpperCase() + "_ID";

            }
        }
        Map<IProperty, Integer> baseMap = super.getPropMap();
        for (IProperty prop : baseMap.keySet()) {
            if (!propMap.containsKey(prop))
                propMap.put(prop, baseMap.get(prop));
        }
        return propMap;
    }

    /**  *** DO NOT USE THIS! *** Objects are constructed via the static newObj method */
    public SAAccountCallCapabilityAttributesExtension()
    {
        super();
    }

    /** Get underlying IMF object. Reserved for semantic layer use only */
    public AccountCallCapabilityAttributesExtension _get_imfObject()
    {
        return (AccountCallCapabilityAttributesExtension)_imfObject;
    }

    /** Create new instance of Semantic layer object (inc. associated IMF object) */
    public static SAAccountCallCapabilityAttributesExtension newObj(SL_ContainerObj root) throws SL_Exception
    {
        AccountCallCapabilityAttributesExtension imfObj = CapabilityIFactory.I_INSTANCE.createAccountCallCapabilityAttributesExtension();
        Utils.objectUtilsNewObject(imfObj);
        return newObjFrom(imfObj, root);
    }


    /** Create new instance of Semantic layer object (for given IMF object) */
    protected static SAAccountCallCapabilityAttributesExtension newObjFrom(AccountCallCapabilityAttributesExtension imfObj, SL_ContainerObj root) throws SL_Exception
    {
        SAAccountCallCapabilityAttributesExtension newObj = (SAAccountCallCapabilityAttributesExtension)root.get_factory().newSemanticClass(AccountCallCapabilityAttributesExtension.class, root.get_factory().getClass().getClassLoader());
        newObj.rootObj = root;
        newObj._validator = (MAAccountCallCapabilityAttributesExtension)root.get_factory().newObjectmanagerClass(AccountCallCapabilityAttributesExtension.class, root.get_factory().getClass().getClassLoader());
        newObj._imfObject = imfObj;
        Utils.addObjectExtension(newObj);
        return newObj;
    }


    /** Get associated Semantic layer object from iObjectInfo extensions */
    public static  SAAccountCallCapabilityAttributesExtension getSemanticObject(AccountCallCapabilityAttributesExtension imfObj)
    {
        SAAccountCallCapabilityAttributesExtension rc = (SAAccountCallCapabilityAttributesExtension)Utils.getObjectExtension(imfObj);
        if(rc==null) {
            SL_ContainerObj container = Utils.getSemanticContainer(imfObj);
            rc = (SAAccountCallCapabilityAttributesExtension)Utils.invoke_buildSemanticLayer(imfObj, container, container.get_factory(), container.getClass().getClassLoader());
        }

        return rc;
    }

    public MAAccountCallCapabilityAttributesExtension _get_objectmanager()
    {
        return (MAAccountCallCapabilityAttributesExtension)_validator;
    }

    public AccountCallCapabilityAttributesExtension getAdaptee()
    {
        return _get_imfObject();

    }

    /** Override if you need something more than the plain PropertyBasedObjectChangeImpl */
    protected ObjectChange createPropertyChange(Object object, IProperty property)
    {
        return Utils.createPropertyChange(object, property);

    }

    /** Pretty-print this object: */
    public String toString()
    {
        String rc = "SAAccountCallCapabilityAttributesExtension " +" (hashCode="+hashCode()+")";
        return rc;

    }

    /** Builds semantic layer objects for existing IMF model */
    public static SAAccountCallCapabilityAttributesExtension buildSemanticLayer(AccountCallCapabilityAttributesExtension imfObj, SL_ContainerObj root) throws SL_Exception
    {
        SAAccountCallCapabilityAttributesExtension me = newObjFrom(imfObj, (SL_ContainerObj)root);
        me._buildSemanticLayerRecurse(root);
        return me;

    }

    /** Recursive helper method for building semantic layer */
    public SAAccountCallCapabilityAttributesExtension _buildSemanticLayerRecurse(SL_ContainerObj root) throws SL_Exception
    {

        super._buildSemanticLayerRecurse(root);

        return this;
    }

    /** Resets model dependent state in semantic layer. Called only when semantic layer encapulation has been bypassed with direct IMF model updates. */
    public void resetSemanticState() throws SL_Exception
    {
        super.resetSemanticState();


    }

    /** Get the value of property identified by 'propID'. Primitives come back as boxed. */
    public Object get(int propID) throws SL_Exception
    {
            switch(propID)
            {
            default:
                return super.get(propID);
            }

    }

    /** Set the value of property identified by 'propID'. Primitives are set as boxed. */
    public void set(int propID, Object obj) throws SL_Exception
    {
            switch(propID)
            {
            default:
                super.set(propID, obj);
                return;
            }

    }


    /** Just so we can force the class to initialise via a call to a known static method */
    public static void init() {}

    /** Get single entry from list identified by 'propID': */
    public  Object get(int propID, int i) throws SL_Exception
    {
        switch(propID)
        {
        default:
            return super.get(propID, i);
        }
    }

    /** Add single entry to list identified by 'propID': */
    public  void add(int propID, int i, Object obj) throws SL_Exception
    {
        switch(propID)
        {
        default:
            super.add(propID, i, obj);
        }
    }

    /** Remove single entry to list identified by 'propID': */
    public  Object remove(int propID, int i) throws SL_Exception
    {
        switch(propID)
        {
        default:
            return super.remove(propID, i);
        }
    }

    /** Get size of list identified by 'propID': */
    public  int size(int propID) throws SL_Exception
    {
        switch(propID)
        {
        default:
            return super.size(propID);
        }
    }

    /** 
      * Make this object a shallow copy of 'fromObj': primitives & (non-aggregating) references 
      * are copied as-is. Contained sub objects / contained collections not copied
      */
    public  void _shallowCopyInternal(SL_Obj fromObjArg) {
        SAAccountCallCapabilityAttributesExtension fromObj = (SAAccountCallCapabilityAttributesExtension)fromObjArg;
        super._shallowCopyInternal((SL_Obj)fromObj);
    }

    /** 
      * Make this object a deep copy of 'fromObj'. References are not updated.
      * Typically use deepCopy() instead of this.
      */
    public  void _deepCopyInternal(SL_Obj fromObjArg,SL_ContainerObj trgContainer) {
        _shallowCopyInternal(fromObjArg);
        SAAccountCallCapabilityAttributesExtension fromObj = (SAAccountCallCapabilityAttributesExtension)fromObjArg;
        super._deepCopyInternal((SAD_ModelExtensionCallCapAttributes)fromObj,trgContainer);


    }

    /** 
      * return shallow clone of this object. Primitives & references are copied as-is.
      * Contained sub objects and contained collections are changed. 
      */
    public SL_Obj _shallowCloneInternal(SL_ContainerObj trgContainer) {
        SAAccountCallCapabilityAttributesExtension newObj = (SAAccountCallCapabilityAttributesExtension) this._newObj_NonStatic((SL_ContainerObj)trgContainer);
        if(trgContainer.get_patchRefsMap()!=null) 
            trgContainer.get_patchRefsMap().put(this, newObj);
        newObj._shallowCopyInternal(this);
        return newObj;
    }

    /** 
      * Return deep clone of this object. References are not updated.
      * Typically use deepClone() instead of this.
      */
    public SAAccountCallCapabilityAttributesExtension _deepCloneInternal(SL_ContainerObj trgContainer) {
        SAAccountCallCapabilityAttributesExtension newObj = (SAAccountCallCapabilityAttributesExtension) this._newObj_NonStatic((SL_ContainerObj)trgContainer);
        if(trgContainer.get_patchRefsMap()!=null) 
            trgContainer.get_patchRefsMap().put(this, newObj);
        newObj._deepCopyInternal(this, trgContainer);
        return newObj;

    }

    /** 
      * Make a deep clone of this semantic object. Whole containment graph 
      * is cloned. References are updated. Note this is not the same 
      * as cloning the IMF objects: this clone ensures any semantic logic 
      * is executed for the new objects
      */
    public SAAccountCallCapabilityAttributesExtension deepClone(SL_ContainerObj trgContainer) {
        SAAccountCallCapabilityAttributesExtension newObj = (SAAccountCallCapabilityAttributesExtension) this._newObj_NonStatic((SL_ContainerObj)trgContainer);
        if(trgContainer.get_patchRefsMap()!=null) 
            trgContainer.get_patchRefsMap().put(this, newObj);
        newObj.deepCopy(this, trgContainer);
        return newObj;

    }

    /** 
      * Create new instance. Just calls static newObj method. Useful for
      * generated code where the exact class of an object is not known.
      */
    public SAAccountCallCapabilityAttributesExtension _newObj_NonStatic(SL_ContainerObj trgContainer) throws SL_Exception
    {
        return newObj((SL_ContainerObj)trgContainer);
    }

    /** 
      * Make this semantic object a deep copy of 'fromObj'. Whole containment graph 
      * is cloned. References are updated. Note this is not the same 
      * as cloning the IMF objects: this copy ensures any semantic logic 
      * is executed for the new objects. Agreegates are not copied.
      */
    public void deepCopy(SL_Obj fromObj,SL_ContainerObj trgContainer) {
        rootObj.set_patchRefsMap(new HashMap<SL_Obj, SL_Obj>());
        _deepCopyInternal(fromObj, trgContainer);
        _patchReferencesInternal(fromObj);
        rootObj.set_patchRefsMap(null);

    }

    /** 
      * Helper function for deepCopy/deepClone. Fixes references.
      */
    public void _patchReferencesInternal(SL_Obj fromObjArg) {
        SAAccountCallCapabilityAttributesExtension fromObj = (SAAccountCallCapabilityAttributesExtension)fromObjArg;

        // Get the map of old->new references
        Map<SL_Obj, SL_Obj> map = rootObj.get_patchRefsMap();

        SL_Obj wkObj;
        super._patchReferencesInternal(fromObj);


    }

}
