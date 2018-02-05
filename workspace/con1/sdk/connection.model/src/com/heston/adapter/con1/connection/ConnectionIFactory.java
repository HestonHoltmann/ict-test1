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
 * The factory interface for IPackage.
 * 'com.heston.adapter.con1.connection'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface ConnectionIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.heston.adapter.con1.connection'.
     */
    com.heston.adapter.con1.connection.ConnectionIFactory I_INSTANCE = new
        com.heston.adapter.con1.connection.impl.ConnectionIFactoryImpl();
    /**
     * Creates an instance of FileSystemConnectInfoExtension IClass.
     * @return an object of type FileSystemConnectInfoExtension.
     */

    com.heston.adapter.con1.connection.FileSystemConnectInfoExtension createFileSystemConnectInfoExtension();
    /**
     * Creates an instance of FileSystemConnectInfo IClass.
     * @return an object of type FileSystemConnectInfo.
     */

    com.heston.adapter.con1.connection.FileSystemConnectInfo createFileSystemConnectInfo();
}