//
//  TreeNode.swift
//  LeetCode
//
//  Created by stone on 2022/3/21.
//

import Foundation

public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?
    public init() { self.val = 0; self.left = nil; self.right = nil; }
    public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
    public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
        self.val = val
        self.left = left
        self.right = right
    }
    
    public convenience init?(_ tree: [Int?], level: Int, index: Int) {
        self.init()
        
        if tree.count < (2 << (level - 1) + index) {
            return nil
        }
    }
}
