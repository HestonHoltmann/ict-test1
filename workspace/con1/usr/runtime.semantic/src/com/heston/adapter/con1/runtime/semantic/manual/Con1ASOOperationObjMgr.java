package com.heston.adapter.con1.runtime.semantic.manual;

import com.informatica.sdk.adapter.metadata.aso.objectmanager.manual.MD_ASOOperation;
import com.informatica.sdk.adapter.metadata.aso.semantic.iface.ASOOperation;

public class Con1ASOOperationObjMgr extends MD_ASOOperation  {

    @Override
    public boolean prepareRuntimeOperation(ASOOperation semanticObject){
    	return true;
    }


}