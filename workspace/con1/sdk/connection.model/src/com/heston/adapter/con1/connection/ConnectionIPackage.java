/*
 * Copyright (c) 2018 Informatica Corporation. All rights reserved.
 */

/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0
 * Generation time: 2018-02-05 14:38:31
 */

package com.heston.adapter.con1.connection;
/**
 * The package interface for IPackage.
 * 'com.heston.adapter.con1.connection'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently. Note that
 * the package initialization of this package and all its dependent package
 * is also thread-safe.</br>
 * </br></p>
 */
public interface ConnectionIPackage
extends com.informatica.imf.icore.IPackage {
    // Package attributes derived from package namespace and name
    /**
     * Constant for the name of the package.
     */
    java.lang.String I_NAME = "connection";

    /**
     * Constant for the comment associated with the package.
     */
    java.lang.String I_COMMENT = "";

    /**
     * Constant for the namespace prefix.
     */
    java.lang.String I_NS_PREFIX = "com.heston.adapter.con1";

    /**
     * Constant for the fully qualified name.
     */
    java.lang.String I_QUALIFIED_NAME = I_NS_PREFIX + "." + I_NAME;


    // Create and initialize metamodel for this package (reflective API)
    /**
     * Constant for the package instance.
     */
    com.heston.adapter.con1.connection.ConnectionIPackage I_INSTANCE = com.heston.adapter.con1.connection.impl.ConnectionIPackageImpl.init();


    /**
     * Retrieves the 'FileSystemConnectInfoExtension' IClass
     * defined in this IPackage.
     * @return the 'FileSystemConnectInfoExtension' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getFileSystemConnectInfoExtensionIClass();


    /**
     * Retrieves the 'FileSystemConnectInfo' IClass
     * defined in this IPackage.
     * @return the 'FileSystemConnectInfo' IClass
     * defined in this IPackage
     */
    com.informatica.imf.icore.IClass getFileSystemConnectInfoIClass();
}