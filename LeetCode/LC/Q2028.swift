//
//  Q2028.swift
//  LeetCode
//
//  Created by stone on 2022/3/27.
//
//https://leetcode-cn.com/problems/find-missing-observations/

import Foundation
class Solution2028 {
    func test() {
        let rolls = [3,5,3]
        let result = missingRolls(rolls, 5, 3)
        guard !result.isEmpty else {
            print("[]")
            return
        }
        
        for item in result {
            print(item)
        }
    }
    func missingRolls(_ rolls: [Int], _ mean: Int, _ n: Int) -> [Int] {
        guard n > 0 else {
            return []
        }
        
        let count = rolls.count + n
        let letSum = mean * count - rolls.reduce(0, +)
        let leftMean = Float(letSum) / Float(n)
        if leftMean < 1 || leftMean > 6 {
            return []
        }
        
        let low = Int(leftMean)
        var result = Array(repeating: low, count: n)
        let left = letSum - low * n
        for index in 0..<left {
            result[index] += 1
        }
        
        return result
    }
}
