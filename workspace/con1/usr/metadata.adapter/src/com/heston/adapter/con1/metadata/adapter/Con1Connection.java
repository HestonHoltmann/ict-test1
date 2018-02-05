package com.heston.adapter.con1.metadata.adapter;

import com.informatica.sdk.adapter.metadata.provider.AbstractConnection;
import java.util.Map;
import com.informatica.sdk.adapter.metadata.common.Status;
import com.informatica.sdk.adapter.metadata.common.StatusEnum;
import com.informatica.sdk.exceptions.ExceptionManager;
import com.heston.adapter.con1.designmessages.*;

public class Con1Connection extends AbstractConnection  {

    Object nativeConnection = null;


    /**
     * Establishes a connection with the external data source.
     * 
     * @param connAttrs
     *            The list of connection attributes.
     * @return The Status of the connection.
     */

    @Override
    @SuppressWarnings("unused")
    public Status openConnection(Map<String, Object> connAttrs){
    	Status status;
    		try {
    			String filename = (String) connAttrs.get("filename");
    			status = new Status(StatusEnum.SUCCESS, null);
    		} catch (Exception e) {
    			ExceptionManager.createNonNlsAdapterSDKException(e.getMessage());

    			//To create localized exception ExceptionManager.createNlsAdapterSDKException(ExceptionManager.createNlsAdapterSDKException(MessageBundle.getInstance(),Messages.Test_CONN_SUCC_200, arguments);

    			status = new Status(StatusEnum.FAILURE, e.getMessage());
    		}
    		return status;
    }



    /**
     * Closes the connection of the data source.
     * 
     * @return The Status of the connection.
     */ 

    @Override
    public Status closeConnection(){
    	return new Status(StatusEnum.SUCCESS, null);
    }



    /**
     * A provisional method to access the native connection object that will 
     * be set as a part of the openConnection() method. 
     * 
     * @return The native connection object.
     */ 

    public Object getNativeConnection(){
    	return nativeConnection;
    }


}