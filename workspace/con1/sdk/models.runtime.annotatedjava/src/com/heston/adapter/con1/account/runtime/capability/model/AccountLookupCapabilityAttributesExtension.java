package com.heston.adapter.con1.account.runtime.capability.model;

import com.informatica.adapter.sdkadapter.asoextension.model.D_ModelExtensionLookupCapAttributes;
import com.informatica.imf.annotations.Class;
import com.informatica.imf.annotations.Property;
import com.informatica.imf.annotations.constraints.model.Length;
import com.informatica.imf.annotations.constraints.model.Persistence;
import com.informatica.imf.annotations.constraints.model.Range;
import com.informatica.metadata.common.annotation.model.Parameterizable;
import com.informatica.metadata.common.annotation.model.CppSerializeAsGeneric;
import com.informatica.adapter.sdkadapter.logical.model.L_ModelExtensionNode;

@CppSerializeAsGeneric( extensionPoint = "com.informatica.adapter.sdkadapter.capabilityattribute.D_LookupCapabilityAttributes" ,  serializedExtensionClass = "com.informatica.adapter.sdkadapter.asoextension.D_GenericModelExtensionLookupCapAttributes" ,  containerProperty = "genericContainer" )
@com.informatica.imf.annotations.Class()
public class AccountLookupCapabilityAttributesExtension extends D_ModelExtensionLookupCapAttributes  {
}