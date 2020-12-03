package com.bombadu.mvp2.contract

interface ContractInterface {

    interface View {
        fun initView()
        fun updateViewData()

    }

    interface Presenter {
        fun multiplyValues(numA: Int, numB: Int)
        fun getTotal() : Int

    }

    interface Model {
        fun getTotal() : Int
        fun multiplyTotal(numA: Int, numB: Int)

    }


}