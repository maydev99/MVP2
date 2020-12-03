package com.bombadu.mvp2.model

import com.bombadu.mvp2.contract.ContractInterface.*


class MainActivityModel: Model {

    private var total = 0

    override fun getTotal() = total

    override fun multiplyTotal(numA: Int, numB: Int)  {
        total = numA * numB

    }
}