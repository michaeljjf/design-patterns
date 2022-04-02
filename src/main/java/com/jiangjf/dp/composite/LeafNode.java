package com.jiangjf.dp.composite;

/**
 * 叶子节点
 *
 * @author jiangjf
 * @date 2022/4/2
 */
public class LeafNode extends Node {
    private String content;

    public LeafNode() {
    }

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(this.content);
    }
}
