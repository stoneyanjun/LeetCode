//
//  TestInit.swift
//  LeetCode
//
//  Created by stone on 2022/3/21.
//

//"ABBBBBBBAAA"

import Foundation
class Solution2038 {
    
    func winnerOfGame(_ colors: String) -> Bool {
        guard colors.count > 2 else {
            return false
        }
        
        let arr: [Character] = colors.map { $0 }
        var a = 0
        var b = 0
        
        let charA = Character.init("A")
        var count = 1
        var findChar: Character = arr.first!
        
        for index in 1..<arr.count {
            if arr[index] == findChar {
                count += 1
            } else{
                if count >= 3 {
                    if findChar == charA {
                        a += (count - 2)
                    } else {
                        b +=  (count - 2)
                    }
                }
                findChar = arr[index]
                count = 1
            }
        }
        
        if count >= 3 {
            if findChar == charA {
                a += (count - 2)
            } else {
                b +=  (count - 2)
            }
        }
        
        return a > b
    }
    
    func test() {
        let firstColors = "AAB"
        print(winnerOfGame(firstColors))
    }
}
