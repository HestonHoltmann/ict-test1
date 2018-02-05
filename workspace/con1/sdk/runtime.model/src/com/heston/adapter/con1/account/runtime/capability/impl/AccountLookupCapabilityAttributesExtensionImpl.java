/*
 * Copyright (c) 2018 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2018-02-05 14:40:38
 */
package com.heston.adapter.con1.account.runtime.capability.impl;

/**
 * The implementation for an AccountLookupCapabilityAttributesExtension.
 *
 */
public class AccountLookupCapabilityAttributesExtensionImpl
extends com.informatica.adapter.sdkadapter.asoextension.impl.D_ModelExtensionLookupCapAttributesImpl
implements com.heston.adapter.con1.account.runtime.capability.AccountLookupCapabilityAttributesExtension {
    /**
     * The generated Serial Version UID.
     */
    private static final long serialVersionUID = -7886219734029537694L;






    /**
     * Default constructor for AccountLookupCapabilityAttributesExtensionImpl.
     */
    public AccountLookupCapabilityAttributesExtensionImpl() {
        assert iObjInfo != null;
        iSetIClass(com.heston.adapter.con1.account.runtime.capability.CapabilityIPackage.I_INSTANCE
                .getAccountLookupCapabilityAttributesExtensionIClass());
    }




    /**
     * Returns the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @return the value of the specified property
     *
     */

    @SuppressWarnings("unchecked")
    @Override
    public java.lang.Object iGet(com.informatica.imf.icore.IProperty iProperty) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount())
    	return super.iGet(iProperty);
    	else
    	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
        default:
                throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass());
        }
    }

    /**
     * Returns the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @param encrypted indicates if the returned string value needs to be
     * 			encrypted. Applicable only to string properties.
     * @return the value of the specified property
     */
    @SuppressWarnings("unchecked")
    @Override
    public java.lang.Object iGet(com.informatica.imf.icore.IProperty iProperty,
    							boolean encrypted) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount())
    	return super.iGet(iProperty,encrypted);
    	else
    	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
            default:
                   throw new com.informatica.core.exception.IllegalArgumentException(
                       com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                       iProperty.getName(),
                       this.iGetIClass());
        }
    }

    /**
     * Returns true if the specified collection has items in it.
     * @param iProperty is any IProperty
     * @return true if the specified collection has items in it.
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean iHasItems(com.informatica.imf.icore.IProperty iProperty) {
        if(!this.iGetIClass().containsIProperty(iProperty)) {
            throw new com.informatica.core.exception.IllegalArgumentException(
                  com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                  iProperty.getName(),
                  this.iGetIClass().getQualifiedName());
        }
        if (iIsProxy()) {
             if(!isResolvingProxy() && !resolveProxyUsingCallback()) {
                throw new com.informatica.imf.icore.exception.UnresolvedProxyException(
                    com.informatica.imf.ImfMsg.GETTERS_AND_SETTERS_NOT_PERMITTED_ON_PROXY_OBJECT);
              }
        }
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount())
    	return super.iHasItems(iProperty);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
            default:
                    throw new com.informatica.core.exception.IllegalArgumentException(
                        com.informatica.imf.ImfMsg.ILLEGAL_INVOCATION_OF_HASITEMS_ON_NON_COLLECTION_PROPERTY_property_FOR_CLASS_class,
                        iProperty.getName(),
                        this.iGetIClass());
            }
        }

     /**
     * Sets the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @param newValue is the new value for the specified IProperty
     *
     */
    @SuppressWarnings("unchecked")
    @Override
    public void iSet(com.informatica.imf.icore.IProperty iProperty, java.lang.Object newValue) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount())
    	super.iSet(iProperty,newValue);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()) {
            default:
                  throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_SET_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass());
            }
        }

    /**
     * Sets the value of the specified IProperty.
     * @param iProperty is any IProperty
     * @param newValue is the new value for the specified IProperty
     * @param encrypted boolean indicating if the value passed is already
     * 			encrypted or not.
     *
     */
    @SuppressWarnings("unchecked")
    @Override
    public void iSet(com.informatica.imf.icore.IProperty iProperty, java.lang.Object newValue
    	, boolean encrypted) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount())
    	super.iSet(iProperty,newValue,encrypted);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()){
            default:
                  throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_SET_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass());
        }
    }

    /**
     * Sets the value of the specified IProperty.
     * Note on setting collection property: Even though collection properties can be set using this method, it is to be
     * noted that the wrapped collections as such are not directly replaced instead, the core collection in the wrappers
     * are replaced using the passed wrappers core (i.e: lhs.setWrappedCollection(rhs.getWrappedCollection())
     * @param iProperty is any IProperty
     * @param newValue is the new value for the specified IProperty
     *
     */
    @SuppressWarnings("unchecked")
    @Override
    public void iInverseSet(com.informatica.imf.icore.IProperty iProperty, java.lang.Object newValue) {
    	if(!this.iGetIClass().containsIProperty(iProperty)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.COULD_NOT_RETRIEVE_PROPERTY_property_FOR_CLASS_class,
                    iProperty.getName(),
                    this.iGetIClass().getQualifiedName());
    	}
    	int propertyId= ((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getPropertyId();
    	if( propertyId <com.informatica.adapter.sdkadapter.asoextension.impl.AsoextensionIPackageImpl.getD__MODEL_EXTENSION_LOOKUP_CAP_ATTRIBUTESFeatureCount())
    	super.iInverseSet(iProperty,newValue);
    	else
        	switch (((com.informatica.imf.icore.internal.IPropertyInternal) iProperty).getQualifiedName()) {
            default:
                  throw new com.informatica.core.exception.IllegalArgumentException(
                      com.informatica.imf.ImfMsg.COULD_NOT_SET_PROPERTY_property_FOR_CLASS_class,
                      iProperty.getName(),
                      this.iGetIClass());
         }
    }


    /**
     * @generated
     */
    @Override
    public String toString() {
        return com.informatica.imf.io.TextFormatter.format(this);
    }

}