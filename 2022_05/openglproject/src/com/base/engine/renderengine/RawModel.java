package com.base.engine.renderengine;

public class RawModel {
    
    private int vaoID;
    private int vertexCount;

    public RawModel(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }


    public int getVaoID() {
        return this.vaoID;
    }

    public int getVertexCount() {
        return this.vertexCount;
    }

}
