//
//  Q172.swift
//  LeetCode
//
//  Created by stone on 2022/3/26.
//

import Foundation
class Solution172 {
    func test() {
        print("trailingZeroes - \(trailingZeroes(6))")
    }
    
    func trailingZeroes(_ n: Int) -> Int {
        guard n >= 1 else {
            return 0
        }
        return n / 5 + ( trailingZeroes(n / 5 ))
    }
}
