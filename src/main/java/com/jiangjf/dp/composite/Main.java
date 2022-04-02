package com.jiangjf.dp.composite;

/**
 * Composite组合模式，专门用于处理树状结构
 *
 * @author jiangjf
 * @date 2022/4/2
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode branchNode1 = new BranchNode("b1");
        LeafNode leafNode1 = new LeafNode("b11");
        LeafNode leafNode2 = new LeafNode("b12");
        BranchNode branchNode2 = new BranchNode("b2");
        LeafNode leafNode3 = new LeafNode("b21");
        LeafNode leafNode4 = new LeafNode("b22");

        root.addNode(branchNode1);
        root.addNode(branchNode2);
        branchNode1.addNode(leafNode1);
        branchNode1.addNode(leafNode2);
        branchNode2.addNode(leafNode3);
        branchNode2.addNode(leafNode4);

        tree(root, 0);
    }

    public static void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.print("|");
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        node.print();

        if (node instanceof BranchNode) {
            for (Node tempNode : ((BranchNode) node).getNodes()) {
                tree(tempNode, depth + 1);
            }
        }
    }
}
