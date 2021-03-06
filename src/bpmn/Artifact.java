package bpmn;

import java.util.LinkedList;
import java.util.List;

import nodes.FlowObject;
import nodes.ProcessNode;

public class Artifact extends FlowObject {
	
	@Override
    public List<Class<? extends ProcessNode>> getVariants() {
        List<Class<? extends ProcessNode>> result = new LinkedList<Class<? extends ProcessNode>>();
        result.add(DataObject.class);
        result.add(DataStore.class);
        result.add(TextAnnotation.class);
        //result.add(Group.class);
        //result.add(UserArtifact.class);
        return result;
    }

}
