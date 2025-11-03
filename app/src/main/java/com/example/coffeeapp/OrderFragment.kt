package com.example.coffeeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.coffeeapp.databinding.FragmentOrderBinding


class OrderFragment : Fragment() {
    lateinit var binding: FragmentOrderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_order, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOrderBinding.bind(view)

        val coffeePrice = 4.53
        val deliveryFee = 1.0
        var totalPrice: Double

        val quantityTextView = binding.quantityText
        val priceValueTextView = binding.priceValue
        val totalPriceTextView = binding.totalPriceText

        var currentQuantityInt = quantityTextView.text.toString().toInt()

        binding.buttonPlus.setOnClickListener {
            if (currentQuantityInt < 99) {
                currentQuantityInt++
                quantityTextView.text = currentQuantityInt.toString()

                var currentPrice = coffeePrice * currentQuantityInt
                priceValueTextView.text = currentPrice.toString()
                totalPrice = currentPrice + deliveryFee
                totalPriceTextView.text = totalPrice.toString()
            }
        }

        binding.buttonMinus.setOnClickListener {
            if (currentQuantityInt > 1) {
                currentQuantityInt--
                quantityTextView.text = currentQuantityInt.toString()

                var currentPrice = coffeePrice * currentQuantityInt
                priceValueTextView.text = currentPrice.toString()
                totalPrice = currentPrice + deliveryFee
                totalPriceTextView.text = totalPrice.toString()

            }
        }
    }
}