package com.bombadu.mvp2.presenter

import com.bombadu.mvp2.contract.ContractInterface.*
import com.bombadu.mvp2.model.MainActivityModel


class MainActivityPresenter(_view: View) : Presenter {

    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }


    override fun multiplyValues(numA: Int, numB: Int) {
        model.multiplyTotal(numA, numB)
        view.updateViewData()

    }

    override fun getTotal(): Int {
        return model.getTotal()

    }

}