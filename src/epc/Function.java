package epc;

import nodes.FlowObject;

public class Function extends FlowObject{
	
	 /** Loop-Type: "NONE, STANDARD, SEQUENCE, PARALLEL" */
    public static final String PROP_LOOP_TYPE = "loop_type";
    public static final String TYPE_SERVICE = "SERVICE";
    public static final String TYPE_SEND = "SEND";
    public static final String TYPE_RECEIVE = "RECEIVE";
    public static final String TYPE_MANUAL = "MANUAL";
    public static final String TYPE_SCRIPT = "SCRIPT";
    public static final String TYPE_RULE = "RULE";
    public static final String TYPE_USER = "USER";
    public static final String TYPE_REFERENCE = "Reference";
    /** Loop-Property: None */
    public static final String LOOP_NONE = "NONE";
    /** Loop-Property: Standard */
    public static final String LOOP_STANDARD = "STANDARD";
    /** Loop-Property: Multi Instance Sequence */
    public static final String LOOP_MULTI_SEQUENCE = "SEQUENCE";
    /** Loop-Property: Mutli Instance Parallel */
    public static final String LOOP_MULTI_PARALLEL = "PARALLEL";
    
  //** The property for compensation (0=FALSE;1=TRUE) */
    public final static String PROP_COMPENSATION = "compensation";
    public final static String PROP_IMPLEMENTATION = "implementation";

    public Function() {
        super();
        initializeProperties();
    }

    public Function(String label) {
        super();
        setText(label);
        initializeProperties();
    }

    protected void initializeProperties() {
        setProperty(PROP_LOOP_TYPE, LOOP_NONE);
 //       String[] type = { Activity.LOOP_NONE, Activity.LOOP_STANDARD, Activity.LOOP_MULTI_SEQUENCE, Activity.LOOP_MULTI_PARALLEL };

//        String[] atype = { "", Activity.TYPE_SEND, Activity.TYPE_RECEIVE, Activity.TYPE_SERVICE,
//            Activity.TYPE_USER, Activity.TYPE_MANUAL, Activity.TYPE_RULE, Activity.TYPE_SCRIPT
//        };
        
        setProperty(PROP_COMPENSATION, "FALSE");
        
        setProperty(PROP_IMPLEMENTATION, "");
    }

    @Override
    public void setProperty(String key, String value) {
        super.setProperty(key, value);
    }
	
}
