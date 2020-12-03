package com.bombadu.mvp2.view

import android.os.Bundle
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import com.bombadu.mvp2.R
import com.bombadu.mvp2.contract.ContractInterface.*
import com.bombadu.mvp2.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View {

    private var presenter: MainActivityPresenter? = null
    private lateinit var numPickerA: NumberPicker
    private lateinit var numPickerB: NumberPicker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        numPickerA = findViewById(R.id.numberPickerA)
        numPickerB = findViewById(R.id.numberPickerB)
        numPickerA.minValue = 0
        numPickerB.minValue = 0
        numPickerA.maxValue = 12
        numPickerB.maxValue = 12

        multiplyButton.setOnClickListener {
            val numA = numPickerA.value
            val numB = numPickerB.value
            presenter?.multiplyValues(numA, numB)
        }

    }

    override fun updateViewData() {
        displayTextView.text = presenter?.getTotal().toString()

    }
}