package com.example.goodmerchant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.example.goodmerchant.databinding.FragmentListBinding
import com.example.goodmerchant.databinding.FragmentProductDetailBinding
import com.squareup.picasso.Picasso

class ProductDetailFragment : Fragment() {

    lateinit var binding: FragmentProductDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProductDetailBinding.inflate(layoutInflater, container, false)

        val bundle = arguments
        val args = ProductDetailFragmentArgs.fromBundle(bundle!!)
        Picasso.get().load(args.productInformation.thumbnail).into(binding.productDetailImageIv)
        binding.productDetailProductDetailTv.text = args.productInformation.source
        binding.productDetailProductPriceTv.text = args.productInformation.price
        binding.productDetailProductNameTv.text = args.productInformation.title
        return binding.root
    }

}