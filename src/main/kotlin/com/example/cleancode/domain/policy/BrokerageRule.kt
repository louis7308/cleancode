package com.example.cleancode.domain.policy

import kotlin.math.floor

// 가격이 특정 범위일 때 상한효율과 상한금액 가지는 클래스
class BrokerageRule(
    private val brokeragePercent: Double, // 상한요율
    private val limitAmount: Long? // 한도액
) {
    fun calcMaxBrokerage(price: Long): Long {
        if (limitAmount == null) {
            return multiplyPercent(price)
        }
        return multiplyPercent(price).coerceAtMost(limitAmount)
    }

    private fun multiplyPercent(price: Long): Long {
        return floor(brokeragePercent / 100 * price).toLong() // 소수점 자르기
    }
}