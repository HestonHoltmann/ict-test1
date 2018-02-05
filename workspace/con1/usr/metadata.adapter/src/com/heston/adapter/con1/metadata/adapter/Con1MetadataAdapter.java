package com.heston.adapter.con1.metadata.adapter;

import com.informatica.sdk.adapter.metadata.provider.AbstractMetadataAdapter;
import java.util.List;
import java.util.Map;
import com.informatica.sdk.adapter.metadata.common.Option;
import com.informatica.sdk.adapter.metadata.patternblocks.catalog.semantic.iface.Catalog;
import com.informatica.sdk.adapter.metadata.patternblocks.procedure.semantic.iface.Parameter;
import com.informatica.sdk.adapter.metadata.patternblocks.procedure.semantic.iface.Procedure;
import com.informatica.sdk.adapter.metadata.patternblocks.hierrecord.semantic.iface.HierRecord;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.Record;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.ImportableObject;
import com.informatica.sdk.adapter.metadata.provider.Connection;
import com.informatica.sdk.adapter.metadata.common.CCatalogImportOpts;
import com.informatica.sdk.adapter.metadata.patternblocks.semantic.iface.Factory;
import com.informatica.sdk.adapter.metadata.patternblocks.field.semantic.iface.Field;
import com.informatica.sdk.adapter.metadata.patternblocks.flatrecord.semantic.iface.FlatRecord;
import com.informatica.sdk.adapter.metadata.patternblocks.container.semantic.iface.Package;
import com.informatica.sdk.adapter.metadata.common.CWriteObjectsOpts;
import com.informatica.sdk.adapter.metadata.common.Option;
import com.informatica.sdk.adapter.metadata.common.Status;
import com.informatica.sdk.adapter.metadata.common.StatusEnum;
import com.informatica.sdk.adapter.metadata.common.semantic.iface.MetadataObject;
import com.informatica.sdk.adapter.metadata.writeback.ActionTypeEnum;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteAction;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteOptions;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteResults;
import com.informatica.sdk.adapter.metadata.writeback.MetadataWriteSession;
import com.informatica.sdk.adapter.metadata.field.semantic.iface.FieldBase;

@SuppressWarnings("unused")
public class Con1MetadataAdapter extends AbstractMetadataAdapter  {


    /**
     * Gets the adapter metadata connection instance.
     * 
     * @param options
     *            The various Options of the metadata connection instance. Ex: NMO-type
     * @param connAttrs
     *            The connection attributes of the adapter.
     * @return INFASDKConnection object that is the adapter specific connection instance.
     */

    @Override
    public Connection getMetadataConnection(List<Option> options, Map<String, Object> connAttrs){
    	return new Con1Connection();
    }



    /*
     * Used to filter Records during metadata import. (Sample Only)
     * TODO: Implement the filtering logic to push the filter request to source.
     */

    private Boolean isRespectFilter(String objectName, String nameFilter){
    		if (null == nameFilter)
    			return true;
    		return objectName.matches(nameFilter);
    }



    /**
     * Caters to the user requests pertaining to the native metadata 
     * catalog. This may be performed in a single bulk catalog retrieval call or by 
     * a series of separate incremental requests. The adapter is expected to fetch 
     * the objects such as catalogs, hierarchy, packages, or records using Options 
     * parameter. During incremental processing, the first call will be expected to 
     * set the root objects on the SDKCatalog object and the subsequent calls should 
     * add child metadata objects to the retrieved object specified by the START_AT 
     * SDKOption.
     * 
     * @param options
     *            List of option values that includes a START_AT option. 
     * 			  The START_AT option references a previously retrieved 
     * 			  object from which to start or resume metadata import. 
     * 			  The START_AT option also specifies the depth to indicate 
     * 			  the levels of child metadata objects to retrieve. 
     * 			  If the START_AT option is not provided then retrieval 
     * 			  starts at the root level.
     * @param connection
     *				Adapter connection object to be used for connecting to the third
     *				party
     * @param catalog
     *            The object to store the retrieved metadata catalog which 
     *			  is of interest to the user. The results of incremental 
     *			  calls are maintained in this object.
     * @return true if the adapter applies the filter options, false if the 
     *			  SDK applies the filers on the adapter's behalf.
     */

    @Override
    public Boolean populateObjectCatalog(Connection connection, List<Option> options, Catalog catalog){
    		Factory sdkFactory = catalog.getFactory();
    		// Use the startFolder for incremental browsing of metadata
    		Package startFolder =  MetadataUtils.getStartFolder(options);
    		String nmoType = MetadataUtils.getNmoTypeFilter(options);		
    		// Use the nameFilter for filtering the metadata by Name when fetching from catalog
    		String nameFilter = MetadataUtils.getNameFilter(options);


    		if (startFolder == null) {
    			// handle root folders/schemas or records

    			//TODO: Add code for populating object catalog
    			// Replace the sample code with actual metadata from source. This sample code adds 
    			// sample package to the root node. Sample code start :
    			Package pack = sdkFactory.newPackage(catalog);
    			pack.setName("sampleschema");
    			pack.setNativeName("sampleschema");
    			catalog.addRootPackage(pack);
    			// Sample code end.		
    		}
    		else
    		{
    			String folderName = startFolder.getName();
        			FlatRecord record  = sdkFactory.newFlatRecord(catalog);
    				record.setName("customer");
        			record.setNativeName("customer");
        			if(isRespectFilter(record.getName(),nameFilter))
    		    		startFolder.addChildRecord(record);

    		// Example: 
    		/* 					ResultSet tablesIter = metadata
    							.getTables(null, startFolder.getName(),
    									nameFilter == null ? "%" : nameFilter, null);
    					while (tablesIter.next()) {
    						FlatRecord flatRecord = sdkFactory.newFlatRecord(catalog);
    						String tableName = tablesIter.getString(3);
    						flatRecord.setName(tableName);
    						flatRecord.setNativeName(startFolder.getName() + "." + tableName);
    						startFolder.addChildRecord(flatRecord);
    					}
    					tablesIter.close();
    		*/
    		}

    	return true;
    }



    /**
     * Fetches metadata of the objects based on the options. Use this method to 
     * gather catalog information to support run-time data access when you create 
     * a platform data object corresponding to the fetched metadata object.
     * 
     * @param options 
     *			List of option values.
     * 
     * @param importableObjects 
     *			List of native objects that contains object names for which the 
     *			metadata details are required.
     * 
     * @param connection Adapter connection object to be used for connecting to the third party
     *
     * @param catalog 
     *			SDKCatalog that contains the retrieved metadata.
     */

    @Override
    public void populateObjectDetails(Connection connection, List<Option> options, List<ImportableObject> importableObjects, Catalog catalog){
    		//TODO: Add code for populating object details
    		// Replace the sample code with actual metadata from source. Sample code start : 
    		Factory sdkFactory = catalog.getFactory();
    		for (ImportableObject object : importableObjects) {
    			if(object instanceof FlatRecord){
        				FlatRecord sdkRecord = (FlatRecord) object;
        				Field sdkField = sdkFactory.newField(catalog);
        				sdkField.setName("customerName");
        				sdkField.setNativeName("customerName");
        				sdkField.setPrecision(255);
        				sdkField.setLength(255);
    					sdkField.setDataType("String");
        				sdkRecord.addField(sdkField);
        			}else if(object instanceof Procedure){
        				Procedure procedure  = (Procedure) object;
        				Parameter parameter = sdkFactory.newParameter(catalog);
        				parameter.setName("customerName");
        				parameter.setNativeName("customerName");
        				parameter.setPrecision(255);
        				parameter.setLength(255);
    					parameter.setDataType("String");
        				procedure.addParameter(parameter);

        			}
    		}
    		// Sample code end.		
    }


}