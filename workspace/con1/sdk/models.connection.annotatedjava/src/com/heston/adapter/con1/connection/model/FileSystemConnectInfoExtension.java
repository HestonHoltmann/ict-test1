package com.heston.adapter.con1.connection.model;

import com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.model.SDKConnectInfoModelExtension;
import com.informatica.imf.annotations.Class;
import com.informatica.imf.annotations.Property;
import com.informatica.imf.annotations.constraints.model.Length;
import com.informatica.imf.annotations.constraints.model.Persistence;
import com.informatica.imf.annotations.constraints.model.Range;
import com.informatica.metadata.common.annotation.model.Parameterizable;
import com.informatica.imf.annotations.ClassKind;
import com.informatica.metadata.common.annotation.model.CppSerializeAsGeneric;

@CppSerializeAsGeneric( extensionPoint = "com.informatica.metadata.infasdk.connectinfo.sdkadapter.SDKConnectInfo" ,  serializedExtensionClass = "com.informatica.metadata.infasdk.connectinfo.common.sdkmodelextension.GenericSDKConnectInfoModelExtension" ,  containerProperty = "genericContainer" )
@com.informatica.imf.annotations.Class( classKind = com.informatica.imf.annotations.ClassKind.SECOND_CLASS_INTERNAL )
public class FileSystemConnectInfoExtension extends SDKConnectInfoModelExtension  {

    @Property( minOccurs = 0 ,  maxOccurs = 1 )
    @Length( min = 0 ,  max = 255 )
    @Persistence( size = 255 )
    String filename = "c:\\\\tmp\\\\test.txt";

}