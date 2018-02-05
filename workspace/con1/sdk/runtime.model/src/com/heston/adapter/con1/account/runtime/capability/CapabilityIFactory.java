/* 
 * Copyright (c) 2018 Informatica Corporation. All rights reserved. 
 */
 
/*
 * This file is generated. Do not modify.
 * IMF Version: 9.5.0 
 * Generation time: 2018-02-05 14:40:38
 */ 
package com.heston.adapter.con1.account.runtime.capability;

/**
 * The factory interface for IPackage.
 * 'com.heston.adapter.con1.account.runtime.capability'
 *
 * <p><br>
 * <b>Thread-Safety</b>
 * <br>This interface is thread-safe. An instance of the class implementing
 * this interface can be accessed by multiple threads concurrently.</br>
 * </br></p>
 */

public interface CapabilityIFactory
extends com.informatica.imf.icore.IFactory {

    /**
     * The Factory instance for package
     * 'com.heston.adapter.con1.account.runtime.capability'.
     */
    com.heston.adapter.con1.account.runtime.capability.CapabilityIFactory I_INSTANCE = new
        com.heston.adapter.con1.account.runtime.capability.impl.CapabilityIFactoryImpl();
    /**
     * Creates an instance of AccountCallCapabilityAttributesExtension IClass.
     * @return an object of type AccountCallCapabilityAttributesExtension.
     */

    com.heston.adapter.con1.account.runtime.capability.AccountCallCapabilityAttributesExtension createAccountCallCapabilityAttributesExtension();
    /**
     * Creates an instance of AccountLookupCapabilityAttributesExtension IClass.
     * @return an object of type AccountLookupCapabilityAttributesExtension.
     */

    com.heston.adapter.con1.account.runtime.capability.AccountLookupCapabilityAttributesExtension createAccountLookupCapabilityAttributesExtension();
    /**
     * Creates an instance of AccountReadCapabilityAttributesExtension IClass.
     * @return an object of type AccountReadCapabilityAttributesExtension.
     */

    com.heston.adapter.con1.account.runtime.capability.AccountReadCapabilityAttributesExtension createAccountReadCapabilityAttributesExtension();
    /**
     * Creates an instance of AccountWriteCapabilityAttributesExtension IClass.
     * @return an object of type AccountWriteCapabilityAttributesExtension.
     */

    com.heston.adapter.con1.account.runtime.capability.AccountWriteCapabilityAttributesExtension createAccountWriteCapabilityAttributesExtension();
}