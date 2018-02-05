/* 
 * Copyright (c) 2018 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2018-02-05 14:40:22
 */ 
package com.heston.adapter.con1.account.metadata;

/**
 * The factory interface for IPackage.
 * 'com.heston.adapter.con1.account.metadata'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface MetadataIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.heston.adapter.con1.account.metadata'.
     */
    com.heston.adapter.con1.account.metadata.MetadataIFactory I_INSTANCE = new
        com.heston.adapter.con1.account.metadata.impl.MetadataIFactoryImpl();
    /**
     * Creates an instance of AccountFieldExtensions IClass.
     * @return an object of type AccountFieldExtensions.
     */

    com.heston.adapter.con1.account.metadata.AccountFieldExtensions createAccountFieldExtensions();
    /**
     * Creates an instance of AccountRecordExtensions IClass.
     * @return an object of type AccountRecordExtensions.
     */

    com.heston.adapter.con1.account.metadata.AccountRecordExtensions createAccountRecordExtensions();
}