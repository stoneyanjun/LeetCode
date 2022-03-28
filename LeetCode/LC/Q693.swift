//
//  Q693.swift
//  LeetCode
//
//  Created by stone on 2022/3/28.
//

import Foundation
class Solution693 {
    func test() {
        print("\(hasAlternatingBits2(11))")
    }
    
    func hasAlternatingBits(_ n: Int) -> Bool {
        var mode = n % 2
        var temp = n
        while temp > 0 {
            temp = temp >> 1
            let newModel = temp % 2
            if mode == newModel {
                return false
            } else {
                mode = newModel
            }
        }
        
        return true
    }
    func hasAlternatingBits2(_ n: Int) -> Bool {
            let x = n ^ (n >> 1);
            return (x & (x + 1)) == 0;
        }
}

/*
 public boolean hasAlternatingBits(int n) {
         int x = n ^ (n >> 1);
         return (x & (x + 1)) == 0;
     }

 作者：AC_OIer
 链接：https://leetcode-cn.com/problems/binary-number-with-alternating-bits/solution/gong-si-shui-by-ac_oier-zuw7/
 来源：力扣（LeetCode）
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
