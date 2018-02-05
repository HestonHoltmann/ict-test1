/* 
 * Copyright (c) 2018 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2018-02-05 14:38:31
 */ 

package com.heston.adapter.con1.connection.impl;

/**
 * The factory implementation for IPackage.
 * 'com.heston.adapter.con1.connection'
 */
public class ConnectionIFactoryImpl
extends com.informatica.imf.icore.impl.IFactoryImpl
implements com.heston.adapter.con1.connection.ConnectionIFactory {

    /**
     * The generated Serial Version UID.
     * This is the same as for the 'com.heston.adapter.con1.connectionIPackageImpl'.
     */
    private static final long serialVersionUID = -2955892207748099036L;

    /**
     * Default constructor.
     */
    public ConnectionIFactoryImpl() {
    }
    
    /**
     * Returns an instance of specified IClass.
     * @param iClass the ICore class to be created.
     * @return an instance of specified IClass.
     */
    @SuppressWarnings("unchecked")
    public <T> T create(com.informatica.imf.icore.IClass iClass) {
        if(!this.getPackage().getTypes().contains(iClass)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.THE_CLASS_type_DOESNOT_BELONG_TO_PACKAGE_package,
                    iClass.getName(),
                    this.getPackage().getName());
    	}
        switch (((com.informatica.imf.icore.internal.ITypeInternal)iClass).getTypeId()) {
     	    case com.heston.adapter.con1.connection.impl.ConnectionIPackageImpl.FILE_SYSTEM_CONNECT_INFO_EXTENSION:
     	        return (T) createFileSystemConnectInfoExtension(); 
     	    case com.heston.adapter.con1.connection.impl.ConnectionIPackageImpl.FILE_SYSTEM_CONNECT_INFO:
     	        return (T) createFileSystemConnectInfo(); 
     	    default:
                throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.THE_CLASS_type_IS_NOT_A_VALID_CLASSIFIER,
                    iClass.getName());
     	}
    }
    /**
     * Returns a proxy instance of the specified IClass.
     * @param iClass
     *            The <code>IClass</code> whose instance needs to be created.
     * @param identity
     *            The identity of the proxy object.
     * @return the proxy instance with its identity set. All data members of the
     *         object are set to their default values
     * @throws com.informatica.imf.icore.exception.InstantiationException
     *              when <code>IClass</code> is abstract/non-identifiable/annotation
     * @throws com.informatica.imf.icore.exception.IllegalArgumentException
     *              when identity is null object
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T createProxy(com.informatica.imf.icore.IClass iClass,
        com.informatica.imf.icore.IIdentity identity) {
        if(!this.getPackage().getTypes().contains(iClass)) {
    		throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.THE_CLASS_type_DOESNOT_BELONG_TO_PACKAGE_package,
                    iClass.getName(),
                    this.getPackage().getName());
    	}
        if(!iClass.isIdentifiableClass()){
            throw new com.informatica.imf.icore.exception.InstantiationException(
                  com.informatica.imf.ImfMsg.PROXY_OBJECT_CANNOT_BE_CREATED_FOR_class_CLASS,
                  "non-externally referable"
                  );
        }
        if(iClass.isAbstract()){
            throw new com.informatica.imf.icore.exception.InstantiationException(
                  com.informatica.imf.ImfMsg.PROXY_OBJECT_CANNOT_BE_CREATED_FOR_class_CLASS,
                  "abstract"
                  );
        }
        if(iClass.isPrimitive()){
            throw new com.informatica.imf.icore.exception.InstantiationException(
                  com.informatica.imf.ImfMsg.PROXY_OBJECT_CANNOT_BE_CREATED_FOR_class_CLASS,
                  "primitive"
                  );
        }
        if(iClass.isAnnotationClass()){
            throw new com.informatica.imf.icore.exception.InstantiationException(
                  com.informatica.imf.ImfMsg.PROXY_OBJECT_CANNOT_BE_CREATED_FOR_class_CLASS,
                  "annotation"
                  );
        }
        if(identity == null){
            throw new com.informatica.core.exception.IllegalArgumentException(
                  com.informatica.imf.ImfMsg.NULL_IDENTITY_FOR_PROXY_OBJECT);
        }
        switch (((com.informatica.imf.icore.internal.ITypeInternal)iClass).getTypeId()) {
            case com.heston.adapter.con1.connection.impl.ConnectionIPackageImpl.FILE_SYSTEM_CONNECT_INFO:
                return (T) createFileSystemConnectInfoProxy(identity); 
            default:
            throw new com.informatica.core.exception.IllegalArgumentException(
                  com.informatica.imf.ImfMsg.THE_CLASS_type_IS_NOT_A_VALID_CLASSIFIER,
                  iClass.getName());
        }
        
    }
     	
    /**
     * Returns the value of specified IDataType that corresponding with the specified string.
     * Note that this method is specific to enumerations in the package.
     * @param iDataType the ICoreDatatype
     * @param initialValue the initial value.
     * @return the value of specified IDataType that corresponding with the specified string.
     * @throws com.informatica.imf.icore.exception.IllegalArgumentException
     *              when iDataType is not an enumeration in the package.
     */
    public java.lang.Object datatypeFromString(com.informatica.imf.icore.IDatatype iDataType, java.lang.String initialValue) {
        switch (((com.informatica.imf.icore.internal.ITypeInternal)iDataType).getTypeId()) {
            default:
                throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.THE_DATATYPE_type_IS_NOT_A_VALID_CLASSIFIER,
                    iDataType.getName());
        }
    }
    
    /**
     * Returns the string representation of the specified datatype value.
     * Note that this method is specific to enumerations in the package.
     * @param iDataType the ICore data type.
     * @param value the instance value.
     * @return Returns the string representation of the specified datatype value.
     * @throws com.informatica.imf.icore.exception.IllegalArgumentException
     *              when iDataType is not an enumeration in the package.
     */
    public java.lang.String datatypeToString(com.informatica.imf.icore.IDatatype iDataType, java.lang.Object value) {
        switch (((com.informatica.imf.icore.internal.IDatatypeInternal)iDataType).getTypeId()) {
        
            default:
                throw new com.informatica.core.exception.IllegalArgumentException(
                    com.informatica.imf.ImfMsg.THE_DATATYPE_type_IS_NOT_A_VALID_CLASSIFIER,
                    iDataType.getName());
        }
    }
    
    /**
     * Creates an instance of FileSystemConnectInfoExtension IClass.
     * @return an object of type FileSystemConnectInfoExtension.
     */
     public com.heston.adapter.con1.connection.FileSystemConnectInfoExtension createFileSystemConnectInfoExtension() {
        com.heston.adapter.con1.connection.FileSystemConnectInfoExtension fileSystemConnectInfoExtension = new FileSystemConnectInfoExtensionImpl();
        return fileSystemConnectInfoExtension;
     }

    /**
     * Creates an instance of FileSystemConnectInfo IClass.
     * @return an object of type FileSystemConnectInfo.
     */
     public com.heston.adapter.con1.connection.FileSystemConnectInfo createFileSystemConnectInfo() {
        com.heston.adapter.con1.connection.FileSystemConnectInfo fileSystemConnectInfo = new FileSystemConnectInfoImpl();
        return fileSystemConnectInfo;
     }

    /**
     * Creates a proxy instance of FileSystemConnectInfo IClass.
     * @return a proxy object of type FileSystemConnectInfo.
     */
     private com.heston.adapter.con1.connection.FileSystemConnectInfo createFileSystemConnectInfoProxy(com.informatica.imf.icore.IIdentity identity) {
        com.heston.adapter.con1.connection.FileSystemConnectInfo fileSystemConnectInfo = new FileSystemConnectInfoImpl(identity);
        return fileSystemConnectInfo;
     }
    
    /**
     * Retrieves the IPackage for this IFactory.
     * @return the IPackage for this IFactory.
     */
    @Override
    public com.informatica.imf.icore.IPackage getPackage() {
        return com.heston.adapter.con1.connection.ConnectionIPackage.I_INSTANCE;
    }
}