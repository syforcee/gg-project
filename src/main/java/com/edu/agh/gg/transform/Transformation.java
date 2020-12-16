package com.edu.agh.gg.transform;

import com.edu.agh.gg.model.GraphModel;
import com.edu.agh.gg.model.*;

public abstract class Transformation {

    public abstract boolean isApplicable(GraphModel graph, GraphNode interior);

    public abstract void transform(GraphModel graph, GraphNode interior);

    protected String getNodeName(GraphNode graphNode, String nodeName) {
        return graphNode.getId() + nodeName;
    }

    protected String getEdgeName(GraphNode first, GraphNode second) {
        return first.getId() + second.getId();

    }

}
