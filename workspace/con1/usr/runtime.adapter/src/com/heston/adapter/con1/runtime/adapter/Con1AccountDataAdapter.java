package com.heston.adapter.con1.runtime.adapter;

import com.informatica.sdk.adapter.javasdk.dataadapter.DataAdapter;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Arrays;
import com.informatica.sdk.adapter.javasdk.common.Logger;
import com.informatica.sdk.adapter.javasdk.common.ELogLevel;
import com.informatica.sdk.adapter.javasdk.common.EMessageLevel;
import com.informatica.sdk.adapter.javasdk.common.EReturnStatus;
import com.informatica.sdk.adapter.javasdk.dataaccess.DataSession;
import com.informatica.sdk.adapter.javasdk.common.EIndicator;
import com.informatica.sdk.adapter.javasdk.metadata.EmetadataHandleTypes;
import com.informatica.sdk.adapter.javasdk.metadata.RuntimeConfigMetadata;
import com.informatica.sdk.adapter.metadata.capabilityattribute.semantic.iface.CapabilityAttributes;
import com.informatica.sdk.adapter.metadata.patternblocks.field.semantic.iface.Field;
import com.informatica.sdk.adapter.metadata.patternblocks.shared.semantic.iface.ImportableObject;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.Constant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.FieldIdentifier;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.IntegerConstant;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.LeafExpression;
import com.informatica.sdk.adapter.metadata.projection.expression.semantic.iface.StringConstant;
import com.informatica.sdk.adapter.metadata.projection.helper.semantic.iface.BasicProjectionField;
import com.informatica.sdk.adapter.metadata.projection.helper.semantic.iface.BasicProjectionView;
import com.informatica.sdk.exceptions.SDKException;
import com.informatica.sdk.adapter.javasdk.dataadapter.ReadAttributes;
import com.informatica.sdk.adapter.javasdk.dataadapter.WriteAttributes;
import com.informatica.sdk.adapter.javasdk.dataaccess.DataAttributes;
import com.heston.adapter.con1.runtimemessages.*;

@SuppressWarnings("unused")
public class Con1AccountDataAdapter extends DataAdapter  {

    private Logger logger = null;

    private List<BasicProjectionField> projectionFields = null;

    private List<FieldInfo> connectedFields = null;

    private CapabilityAttributes capAttrs = null;

    private BasicProjectionView projectionView = null;

    private List<ImportableObject> nativeRecords = null;


    /**
     * Initializes the data session. This method is called once for the current 
     * plugin -> Data Source Object -> Thread and is called sequentially for each thread.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the initialization call.
     */

    @Override
    public int initDataSession(DataSession dataSession) throws SDKException  {
    	// Use the logger for logging messages to the session log 
    	//as logMessage(ELogLevel.TRACE_NONE, Messages.CONN_SUCC_200, "user",6005,5.2);
    	this.logger = dataSession.getInfaUtilsHandle().getLogger();

    	// The runtime metadata handle allows access to runtime metadata information
    	RuntimeConfigMetadata runtimeMetadataHandle = (RuntimeConfigMetadata) dataSession.getMetadataHandle(EmetadataHandleTypes.runtimeConfigMetadata);
    	// Use the basic projection view to get basic details like the projected fields/ filter / join metadata
    	projectionView = runtimeMetadataHandle.getBasicProjection();
    	// projectionFields has all fields of the native object to the platform source/target	
    	projectionFields = projectionView.getProjectionFields();
    	// connected fields is the subset of fields which are actually used in the mapping.
    	// use to fetch/write data to/from the native source
    	connectedFields= getConnectedFields(runtimeMetadataHandle);

    	// native flatrecord list used in the data session
    	nativeRecords = projectionView.getNativeRecords();

    	// handle to the list of capability attributes. Get the read/write capability details using this list
    	capAttrs = runtimeMetadataHandle.getCapabilityAttributes();

    	// connection object reference that can be used for data processing
    	Con1AccountDataConnection conn = (Con1AccountDataConnection)dataSession.getConnection();

    	// TODO : Add code to prepare the data session for read or write
    	// Sample code below how the query is constructed using the projected columns
    	/* 

    	String query = getQuery(connectedFields);
    	try {
        	Connection nativeConn = conn.getNativeConnection();
    		stmt = nativeConn.createStatement();
    		rs = stmt.executeQuery(query);
    	} catch (SQLException e) {
    		logger.logMessage(EMessageLevel.MSG_FATAL_ERROR, ELogLevel.TRACE_NONE, e.getMessage());
    		return EReturnStatus.FAILURE;
    	}
    	*/


    	return EReturnStatus.SUCCESS;
    }



    /**
     * Gets the list of connected fields in the read or write operation. If the method is 
     * referenced with any unconnected fields, the method may encounter errors.
     *
     * @param runtimeMetadataHandle 
     *            The run-time metadata handle of the DataSession.
     * @return A list of Fields that are connected in the read or write operation.
     */

    private ArrayList<FieldInfo> getConnectedFields(RuntimeConfigMetadata runtimeMetadataHandle){
    	int i = 0;
    	ArrayList<FieldInfo> fields = new ArrayList<FieldInfo>();
    	for (BasicProjectionField pfield : projectionFields) {
    		if (runtimeMetadataHandle.isFieldConnected(i)) { 
    			FieldInfo f = new FieldInfo(pfield,i); 
    			fields.add(f);
    		}
    		i++;
    	}
    	return fields;
    }

    /*
     * Sample code to construct the query based on the connected fields
     * 
     */
     /* 
     private String getQuery(List<FieldInfo> connectedFields) {
    	String query = "SELECT " ;
    	boolean addComma = false;
    	for (FieldInfo field : connectedFields) {
    		if (addComma)
    			query += " , ";
    		query += field.field.getNativeFieldRef().getName();
    		addComma = true;
    	}
    	// Assuming of a single source
    	query+= " FROM " + ((Record)nativeRecords.get(0)).getNativeName();
    	return query;
    }
    */


    /**
     * Begins the data session once for the current plugin -> DSO -> thread 
     * which could be called in parallel for each thread. If connection pooling 
     * is enabled, then the same connection can initialize multiple data sessions.
     * 
     * @param dataSession
     *            The Data session instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the begin session call.
     */

    @Override
    public int beginDataSession(DataSession dataSession){
    	return EReturnStatus.SUCCESS;
    }



    /**
     * Ends the data session once for the current plugin -> DSO -> thread which 
     * could be called in parallel for each thread. If connection pooling is enabled, 
     * then the same connection can initialize multiple data sessions.
     * 
     * @param dataSession
     *            The Data session instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the end session call.
     */

    @Override
    public int endDataSession(DataSession dataSession){
    	return EReturnStatus.SUCCESS;
    }



    /**
     * Deinitializes the data session. This method is called once for the current 
     * plugin -> Data Source Object -> Thread and is called sequentially for each thread.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @return EReturnStatus The status of the deinitialization call.
     */

    @Override
    public int deinitDataSession(DataSession dataSession){
    // Sample code show-casing the de-initialization of objects 
    /* try {
    	// close result set
    	if (rs != null)
    		rs.close();
    	// close statements
    	stmt.close();
    } catch (SQLException e) {
    	e.printStackTrace();
    }
    */
    	return EReturnStatus.SUCCESS;
    }



    /**
     * Reads data from the external data source. Returning NO_MORE_DATA after 
     * completion of reading data, stops calling the read method again. Returning 
     * a success informs SDK to continue calling the method.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @param readAttr
     *            The ReadAttributes that provides access to the read specific 
     *			  attributes for the data adapter passed during the read phase.
     * @return EReturnStatus The status of the read call.
     */

    @Override
    public int read(DataSession dataSession, ReadAttributes readAttr) throws SDKException  {
    		int rowsToRead = readAttr.getNumRowsToRead();
        	List<List<Object> > dataTable = new ArrayList<List<Object> >();

        	int returnStatus = readDatafromSource(dataTable, rowsToRead);
        	setDataToPlatform(dataSession, dataTable);
        	readAttr.setNumRowsRead(dataTable.size());
        	return returnStatus;
    }



    /**
     * Reads the data from the native source and populates the data table list by setting 
     * the data only for projected fields that are in the same sequence. The dataTable is a 
     * List of List<Object>. Each List<Object> represents a single row.
     *
     * @param dataTable
     *            List of List of Objects. Each List of Objects represents a single row.
     * @param rowsToRead
     *            Max number of rows to be read
     * @return EReturnStatus The status of the populate call.
     * 
     */

    private int readDatafromSource(List<List<Object>> dataTable, int rowsToRead){
    //	Example code to fetch data from the jdbc result set
    /*	int rowsRead = 0;
    	try {
    		while (rs.next() && rowsRead++ < rowsToRead) {
    			List<Object> datarow = new ArrayList<Object>();
    			for (int i = 0; i < connectedFields.size(); i++) {
    				datarow.add(rs.getObject(i+1));
    			}
    			dataTable.add(datarow);
    		}
    	} catch (SQLException e) {
    		logger.logMessage(EMessageLevel.MSG_FATAL_ERROR, ELogLevel.TRACE_NONE, e.getMessage());
    		return EReturnStatus.FAILURE;
    	}
    	if (rowsRead == rowsToRead)
    		return EReturnStatus.SUCCESS;
    */
    // TODO: Replace the sample code with native code to read data from the native object
    // Sample dummy code to populate a projected source with one column of string type and two rows
    List<Object> datarow = new ArrayList<Object>();
    datarow.add("Stan");
    List<Object> datarow2 = new ArrayList<Object>();
    datarow2.add("Mark");
    dataTable.add(datarow);
    dataTable.add(datarow2);
    	return EReturnStatus.NO_MORE_DATA;
    }



    /**
     * Sets the multiple row data in the data table to the data session buffer
     * <pre>
     * ##################################
     * AUTOGENERATED CODE
     * ##################################
     * </pre>
     *
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @param dataTable
     *             List of List of Objects. Each List of Objects represents a single row.
     */

    private void setDataToPlatform(DataSession dataSession, List<List<Object>> dataTable) throws SDKException  {
         for (int row = 0; row < dataTable.size(); row++) {
    			List<Object> rowData = dataTable.get(row);
    			for (int col = 0; col < connectedFields.size(); col++) {
    				DataAttributes pDataAttributes = new DataAttributes();
    				pDataAttributes.setDataSetId(0);
    				pDataAttributes.setColumnIndex(connectedFields.get(col).index);
    				pDataAttributes.setRowIndex(row);
    				Object data = rowData.get(col);

    				String dataType = connectedFields.get(col).field.getDataType();
    				String columnName = connectedFields.get(col).field.getName();

    				if (dataType.equalsIgnoreCase("string")
    						|| dataType.equalsIgnoreCase("text")) {
    					if (data == null) {
    						pDataAttributes.setLength(0);
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						String text = data.toString();

    						int fieldLength = connectedFields.get(col).field
    								.getPrec();
    						if (text.length() > fieldLength) {
    							pDataAttributes.setLength(fieldLength);
    							pDataAttributes.setIndicator(EIndicator.TRUNCATED);
    							data = text.substring(0, fieldLength);
    						} else {
    							pDataAttributes.setLength(text.length());
    							pDataAttributes.setIndicator(EIndicator.VALID);
    						}
    					}
    					dataSession.setStringData((String) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("double") == 0) {
    					if (data instanceof Double) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data instanceof Number) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    						data = ((Number) data).doubleValue();
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "] " + "should be a of type ["
    										+ Number.class.getName()
    										+ "] or its sub-types.");
    						data = null;
    					}
    					dataSession.setDoubleData((Double) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("float") == 0) {
    					if (data instanceof Float) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data instanceof Number) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    						data = ((Number) data).floatValue();
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "] " + "should be a of type ["
    										+ Number.class.getName()
    										+ "] or its sub-types.");
    						data = null;
    					}
    					dataSession.setFloatData((Float) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("long") == 0) {
    					if (data instanceof Long) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data instanceof Number) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    						data = ((Number) data).longValue();
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "] " + "should be a of type ["
    										+ Number.class.getName()
    										+ "] or its sub-types.");
    						data = null;
    					}
    					dataSession.setLongData((Long) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("short") == 0) {
    					if (data instanceof Short)
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					else if (data instanceof Number) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    						data = ((Number) data).shortValue();
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "] " + "should be a of type ["
    										+ Number.class.getName()
    										+ "] or its sub-types.");
    						data = null;
    					}
    					dataSession.setShortData((Short) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("integer") == 0) {
    					if (data instanceof Integer) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data instanceof Number) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    						data = ((Number) data).intValue();
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "] " + "should be a of type ["
    										+ Number.class.getName()
    										+ "] or its sub-types.");
    						data = null;
    					}
    					dataSession.setIntData((Integer) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("bigint") == 0) {
    					if (data instanceof Long) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data instanceof Number) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    						data = ((Number) data).longValue();
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "] " + "should be a of type ["
    										+ Number.class.getName()
    										+ "] or its sub-types.");
    						data = null;
    					}
    					dataSession.setLongData((Long) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("date/time") == 0) {
    					if (data instanceof Timestamp) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_ERROR,
    								ELogLevel.TRACE_NONE, "Data for column ["
    										+ columnName + "] of type [" + dataType
    										+ "]" + " should be a of type ["
    										+ Timestamp.class.getName() + "].");
    						data = null;
    					}
    					dataSession.setDateTimeData((Timestamp) data,
    							pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("binary") == 0) {

    					if (data == null) {
    						pDataAttributes.setLength(0);
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else if (data instanceof byte[]) {
    						byte[] binData = (byte[]) data;
    						int fieldLength = connectedFields.get(col).field
    								.getPrec();

    						if (binData.length > fieldLength) {
    							pDataAttributes.setLength(fieldLength);
    							pDataAttributes.setIndicator(EIndicator.TRUNCATED);
    							data = Arrays.copyOf(binData, fieldLength);
    						} else {
    							pDataAttributes.setLength(binData.length);
    							pDataAttributes.setIndicator(EIndicator.VALID);

    						}
    					} else {
    						logger.logMessage(EMessageLevel.MSG_DEBUG,
    								ELogLevel.TRACE_VERBOSE_DATA, "Data for type ["
    										+ dataType + "] should be a of type ["
    										+ byte[].class.getName() + "].");
    						data = null;
    						pDataAttributes.setLength(0);
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					}
    					dataSession.setBinaryData((byte[]) data, pDataAttributes);
    				} else if (dataType.compareToIgnoreCase("decimal") == 0) {
    					if (data instanceof BigDecimal) {
    						pDataAttributes.setIndicator(EIndicator.VALID);
    					} else if (data == null) {
    						pDataAttributes.setIndicator(EIndicator.NULL);
    					} else {
    						logger.logMessage(EMessageLevel.MSG_DEBUG,
    								ELogLevel.TRACE_VERBOSE_DATA, "Data for type ["
    										+ dataType + "] should be a of type ["
    										+ BigDecimal.class.getName() + "].");
    						data = null;
    					}
    					dataSession.setBigDecimalData((BigDecimal) data,
    							pDataAttributes);
    				}
    			}
    		}
         
    }



    /**
     * Writes data to the external data source. The SDK continues to call this 
     * method until it completes writing data to the data source.
     * 
     * @param dataSession
     *            The dataSession instance, which is the container for SDK handles.
     * @param writeAttr
     *            The WriteAttributes that provides access to the write specific 
     *			  attributes for the data adapter passed during the read phase.
     * @return EReturnStatus The status of the write call.
     */

    @Override
    public int write(DataSession dataSession, WriteAttributes writeAttr) throws SDKException  {
    	return EReturnStatus.SUCCESS;
    }



    /**
     * This API should be implemented by adapter developer in conjunction with read
     * API to implement lookup. SDK will provide updated filter condition with reset API.
     * Adapter developer are expected to reset the adapter context in reset API. 
     * 
     * @param dataSession
     *            DataSession instance
     * @return EReturnStatus
     */

    @Override
    public int reset(DataSession dataSession) throws SDKException  {
    	return EReturnStatus.SUCCESS;
    }



    /**
     * Log a localized message to session log.
     * 
     * @param logLevel
     *		ELogLevel Trace level at which the message should be logged.
     * @param messageKey
     *            Message Key of the Message.
     * @param messageFormatArguments
     *			  Message Format arguments.
     * @return EReturnStatus The status of the logger call.
     */

    private int logMessage(int logLevel, String messageKey, Object... messageFormatArguments){
    	if (this.logger != null) {
    		return logger.logMessage(MessageBundle.getInstance(),logLevel, messageKey, messageFormatArguments);
    	}
    	return EReturnStatus.FAILURE;
    }

    /*
     * Class holding information about the projected field and the index 
     * 
     */
    private class FieldInfo {
    	BasicProjectionField field;
    	int index;
    	public FieldInfo(BasicProjectionField field, int index) {
    		super();
    		this.field = field;
    		this.index = index;
    	}
    }

}