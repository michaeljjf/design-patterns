package com.jiangjf.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 分支节点
 *
 * @author jiangjf
 * @date 2022/4/2
 */
public class BranchNode extends Node {

    private String name;
    private List<Node> nodes = new ArrayList<>();

    public BranchNode() {
    }

    public BranchNode(String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return this.nodes;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
